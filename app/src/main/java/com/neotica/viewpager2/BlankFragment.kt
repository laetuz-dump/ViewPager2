package com.neotica.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neotica.viewpager2.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentBlankBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    companion object {

    }
}