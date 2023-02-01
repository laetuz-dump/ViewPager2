package com.neotica.viewpager2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter (val frack: List<Fragment>, activity: AppCompatActivity)
    :FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return frack.size
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> BlankFragment()
            else -> BlankFragment2()
        }
    }

}