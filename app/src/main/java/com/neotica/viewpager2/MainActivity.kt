package com.neotica.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.neotica.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val images = listOf<Fragment>(
            BlankFragment(),
            BlankFragment2()
        )

        val adapter = ViewPagerAdapter(images, this)
        //Step 7: Add title list for position started in 0
        val titles = listOf("Home", "nope")
        binding.viewPager.adapter = adapter

        //Step 6: Add TabLayoutMediator
        //Version 1: Incremental Tabs
        TabLayoutMediator(binding.tabLayout, binding.viewPager) {tab, position ->
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