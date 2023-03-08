package com.neotica.viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.neotica.viewpager2.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank2Binding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    companion object {

    }
}