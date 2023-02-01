package com.example.prathamandroidcodingassessment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.prathamandroidcodingassessment.adapter.TopCategoryViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class SubCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sub_category, container, false)

        return view
    }

}