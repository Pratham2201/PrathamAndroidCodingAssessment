package com.example.prathamandroidcodingassessment.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.prathamandroidcodingassessment.CategoryFragment
import com.example.prathamandroidcodingassessment.SubCategoryFragment

class TopCategoryViewPagerAdapter(supportFragmentManager: FragmentManager, private val list: List<String>, val CategoryType: Int) : FragmentPagerAdapter(supportFragmentManager) {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {

        if(CategoryType==1) {
            val fragment = CategoryFragment()
            fragment.arguments = Bundle().apply {
                putString("category", list[position])
            }
            return fragment
        }
        else
        {
            val fragment = SubCategoryFragment()
            fragment.arguments = Bundle().apply {
                putString("SubCategory", list[position])
            }
            return fragment
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list[position]
    }
}