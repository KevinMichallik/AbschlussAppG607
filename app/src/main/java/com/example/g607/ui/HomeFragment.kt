package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.g607.R
import com.example.g607.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    //binding for this Fragment
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // permission to Layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.ivHome.setImageResource(R.drawable.plakette_g607_png)

        // Navigation for Start Button on Home to begin Test
        binding.btnHomeStart.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToPruefungFragment())
        }
        // Navigation for Galery Button to show Galery Fragment
        binding.btnHomeGalerie.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToGalerieFragment())
        }
    }
}