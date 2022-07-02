package com.example.fragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsapp.databinding.FragmentRoodBinding
import com.google.android.material.tabs.TabLayoutMediator


class RoodFragment : Fragment() {
    private val binding: FragmentRoodBinding by lazy {
        FragmentRoodBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentList = arrayListOf(
            HomeFragment(), SettingsFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter = adapter
        binding.viewPager.isSaveEnabled = true

        TabLayoutMediator(
            binding.tablelayout, binding.viewPager
        ) { tab, position ->
            when (position) {
                0 -> tab.setIcon(R.drawable.ic_home)
                1 -> tab.setIcon(R.drawable.ic_settings)
            }

        }.attach()
        return binding.root
    }
}