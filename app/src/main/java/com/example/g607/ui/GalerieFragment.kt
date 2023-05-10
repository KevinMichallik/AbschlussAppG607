package com.example.g607.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.g607.R
import com.example.g607.adapter.GaleryAdapter
import com.example.g607.data.model.Repository
import com.example.g607.databinding.FragmentGalerieBinding


class GalerieFragment : Fragment() {

    private lateinit var binding: FragmentGalerieBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_galerie, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val pictures = Repository().loadPictures()
        val recyclerView = binding.recyclerView

        recyclerView.adapter = GaleryAdapter(this, pictures)

        binding.btnGaleryHome.setOnClickListener {
            findNavController().navigate(GalerieFragmentDirections.actionGalerieFragmentToHomeFragment())
        }
    }
}


