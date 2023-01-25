package com.neotica.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.matrix1,
            R.drawable.matrix2,
            R.drawable.matrix3,
            R.drawable.matrix4,
            R.drawable.matrix5,
            R.drawable.matrix6,
            R.drawable.matrix7
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
    }
}