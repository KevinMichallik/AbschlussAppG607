package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.g607.R
import com.example.g607.databinding.FragmentPruefung1Binding
import com.example.g607.local.ClientTest
import com.example.g607.local.ClientTestDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Pruefung1Fragment : Fragment() {

    //binding for this Fragment
    private lateinit var binding: FragmentPruefung1Binding
    private val args: Pruefung1FragmentArgs by navArgs()
    private lateinit var clientTestDatabase: ClientTestDatabase


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // permission to Layout
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_pruefung1, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        clientTestDatabase = ClientTestDatabase.getDataBase(requireContext())

        // Navigation to next
        binding.btn1Next.setOnClickListener {
            if (binding.etBemerkungen.text.toString().isEmpty()) {
                Toast.makeText(requireContext(), "Please enter bemerkungen", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            lifecycleScope.launch(Dispatchers.IO) {
                val clientTest = ClientTest(
                    0,
                    args.name,
                    args.kennzeichen,
                    args.vin,
                    args.fahrzeugart,
                    binding.switchA.isChecked,
                    binding.switchB.isChecked,
                    binding.switchC.isChecked,
                    binding.switchD.isChecked,
                    binding.switchE.isChecked,
                    binding.switchF.isChecked,
                    binding.etBemerkungen.text.toString()

                )
                clientTestDatabase.clientTestDao().insertClientTest(
                    clientTest
                )
            }
            Toast.makeText(requireContext(), "Data Saved", Toast.LENGTH_SHORT).show()
            findNavController().navigate(Pruefung1FragmentDirections.actionPruefung1FragmentToPruefung2Fragment())
        }

        // Navigate back
        binding.btn1Back.setOnClickListener {
            findNavController().navigate(Pruefung1FragmentDirections.actionPruefung1FragmentToPruefungFragment())
        }


    }
}