package com.neotica.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neotica.viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
        binding.viewPager.adapter = adapter
    }
}