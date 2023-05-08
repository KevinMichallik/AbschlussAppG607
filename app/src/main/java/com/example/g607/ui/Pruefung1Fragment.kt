package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.g607.R
import com.example.g607.databinding.FragmentPruefung1Binding


class Pruefung1Fragment : Fragment() {

    //binding for this Fragment
    private lateinit var binding: FragmentPruefung1Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // permission to Layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pruefung1, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        // Navigation to next
        binding.btn1Next.setOnClickListener {
            findNavController().navigate(Pruefung1FragmentDirections.actionPruefung1FragmentToPruefung2Fragment())
        }

        // Navigate back
        binding.btn1Back.setOnClickListener {
            findNavController().navigate(Pruefung1FragmentDirections.actionPruefung1FragmentToPruefungFragment())
        }


    }}