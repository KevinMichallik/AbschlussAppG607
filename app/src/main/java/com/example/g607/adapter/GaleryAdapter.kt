package com.example.g607.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.g607.data.model.Pictures
import com.example.g607.databinding.GaleryItemBinding
import com.example.g607.ui.GalerieFragment


class GaleryAdapter(
    private val context: GalerieFragment,
    private val dataset: List<Pictures>
) : RecyclerView.Adapter<GaleryAdapter.ItemViewHolder>() {

    // View Holder for formatting Layout from Recycling
    class ItemViewHolder(val binding: GaleryItemBinding) : RecyclerView.ViewHolder(binding.root)

    // Create new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create Item Layout
        val binding = GaleryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    // Param from ViewHolder will be changed
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.itemImage.setImageResource(item.pictureResource)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}


