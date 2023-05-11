package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

            // Check if Name is entered
            if (binding.etName.text.toString().isEmpty()){
                Toast.makeText(requireContext(), "Bitte Name eintragen !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Check if Kennzeichen is entered
            if (binding.etKennzeichen.text.toString().isEmpty()){
                Toast.makeText(requireContext(), "Bitte Kennzeichen eintragen !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Check if VIN is entered
            if (binding.etVin.text.toString().isEmpty()){
                Toast.makeText(requireContext(), "Bitte VIN eintragen !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Check if Typ is entered
            if (binding.etTyp.text.toString().isEmpty()){
                Toast.makeText(requireContext(), "Bitte Fahrzeugart eintragen !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Create an action to navigate to next fragment with data entered by user
            val action = PruefungFragmentDirections.actionPruefungFragmentToPruefung1Fragment(
                binding.etName.text.toString(),
                binding.etKennzeichen.text.toString(),
                binding.etVin.text.toString(),
                binding.etTyp.text.toString()
            )
            // Navigate to next fragment
            findNavController().navigate(action)
        }

        // Navigate to Home Fragment
        binding.btnftBack.setOnClickListener {
            findNavController().navigate(PruefungFragmentDirections.actionPruefungFragmentToHomeFragment())
        }
    }}