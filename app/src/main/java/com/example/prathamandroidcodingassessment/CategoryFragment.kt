package com.example.prathamandroidcodingassessment

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.prathamandroidcodingassessment.adapter.TopCategoryViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class CategoryFragment : Fragment() {

    val list = listOf("For You", "Top Charts", "Categories", "Editor's Choice", "Early Access")
    val drawableList = listOf(R.drawable.ic_for_you, R.drawable.ic_chart, R.drawable.ic_category, R.drawable.ic_editors_choice, R.drawable.ic_early_access)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        val vpCategory = view.findViewById<ViewPager>(R.id.vpSubCategory)
        vpCategory.adapter = TopCategoryViewPagerAdapter(childFragmentManager, list, 2)
        val tabLayout = view.findViewById<TabLayout>(R.id.tlSubCategory)
        tabLayout.setupWithViewPager(vpCategory)

        for( iconIndex in (0..drawableList.size-1))
        {
            tabLayout.getTabAt(iconIndex)?.setIcon(drawableList[iconIndex])
        }

        return view
    }

}