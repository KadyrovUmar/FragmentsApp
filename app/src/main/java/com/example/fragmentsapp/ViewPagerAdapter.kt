package com.example.fragmentsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragment: List<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    private val list = fragment
    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment {
return list[position]
    }
}