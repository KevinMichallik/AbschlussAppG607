package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.g607.R
import com.example.g607.databinding.FragmentPruefungBinding

class PruefungFragment : Fragment() {

    //binding for this Fragment
    private lateinit var binding: FragmentPruefungBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // permission to Layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pruefung, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        // Navigation to next
        binding.btnftNext.setOnClickListener {
            findNavController().navigate(PruefungFragmentDirections.actionPruefungFragmentToPruefung1Fragment())
        }

        // Navigate back
        binding.btnftBack.setOnClickListener {
            findNavController().navigate(PruefungFragmentDirections.actionPruefungFragmentToHomeFragment())
        }


    }}