package com.example.prathamandroidcodingassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.prathamandroidcodingassessment.adapter.TopCategoryViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    val list = listOf("HOME", "GAME", "MOVIES", "MUSIC", "BOOKS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vpCategory = findViewById<ViewPager>(R.id.vpCategory)
        vpCategory.adapter = TopCategoryViewPagerAdapter(supportFragmentManager, list,1)
        val tabLayout = findViewById<TabLayout>(R.id.tlCategory)
        tabLayout.setupWithViewPager(vpCategory)


    }
}