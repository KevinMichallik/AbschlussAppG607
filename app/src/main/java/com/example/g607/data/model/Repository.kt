package com.example.g607.data.model

import com.example.g607.R

class Repository {


    fun loadPictures(): List<Pictures> {
        return listOf(
            Pictures(R.drawable.plakette_g607_png), Pictures(R.drawable.wohnmobil_typ_alkoven)

        )

    }
}