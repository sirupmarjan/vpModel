package com.quick.viewpagerkt.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.quick.viewpagerkt.Fragment.AddFragment
import com.quick.viewpagerkt.Fragment.MenuFragment
import com.quick.viewpagerkt.Fragment.ProfileFragment

class MyAdapter(fm : FragmentManager, behavior: Int) : FragmentStatePagerAdapter(fm , behavior) {
    private val tabName : Array<String> = arrayOf("Add", "Menu", "Profile")

    override fun getItem(position: Int): Fragment = when(position) {
            0 -> AddFragment()
            1 -> MenuFragment()
            2 -> ProfileFragment()

        else -> AddFragment()
    }
    override fun getCount() : Int = 3

    override fun getPageTitle(position: Int): CharSequence? = tabName.get(position)
}