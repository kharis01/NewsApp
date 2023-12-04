package com.idn.newsapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.newsapp.AboutAlQuranFragment
import com.idn.newsapp.CommonFragment
import com.idn.newsapp.WarningFragment
import com.idn.newsapp.aljazeera

class SectionPagerAdapter(fa : FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 4

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CommonFragment()
            1 -> AboutAlQuranFragment()
            2 -> aljazeera()
            3 -> WarningFragment()
            else -> aljazeera()
        }
    }

}