package com.example.machinetest.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.machinetest.fragments.*

class viewPagerAdapter(activity:FragmentActivity, private val tabCount:Int) :FragmentStateAdapter(activity){
    override fun getItemCount(): Int {
        return tabCount
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> AllFragment()
            1 -> CategoryFragment()
            2 -> FruitFragment()
            3 -> GroceryFragment()
            4 -> StationaryFragment()
            else ->AllFragment()
        }
    }
}