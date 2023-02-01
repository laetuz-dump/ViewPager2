package com.neotica.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf<Fragment>(
            BlankFragment()
        )

        val adapter = ViewPagerAdapter(images,this)
        viewPager.adapter = adapter
    }
}