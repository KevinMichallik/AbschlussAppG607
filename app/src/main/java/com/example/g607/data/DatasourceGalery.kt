package com.example.g607.data

import com.example.g607.R
import com.example.g607.data.model.Pictures


class DatasourceGalery {

    fun loadPictures(): List<Pictures> {
        return listOf(
            Pictures(R.drawable.wohnmobil_typ_alkoven),
            Pictures(R.drawable.plakette_g607_png)
        )
    }
}