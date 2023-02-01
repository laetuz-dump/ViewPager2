package com.neotica.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf<Fragment>(
            BlankFragment(),
            BlankFragment2()
        )

        val adapter = ViewPagerAdapter(images, this)
        //Step 7: Add title list for position started in 0
        val titles = listOf("Home", "nope")
        viewPager.adapter = adapter

        //Step 6: Add TabLayoutMediator
        //Version 1: Incremental Tabs
        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = titles[position]
        }.attach()
       /* //Version 2: OnClick on tabs
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                TODO("Not yet implemented")
            }
        })*/
    }
}