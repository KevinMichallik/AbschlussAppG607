package com.example.g607.data

import com.example.g607.R
import com.example.g607.data.model.Pictures

class Repository {


    fun loadPictures(): List<Pictures> {
        return listOf(
            Pictures(R.drawable.galery_1),
            Pictures(R.drawable.galery_2),
            Pictures(R.drawable.galery_3),
            Pictures(R.drawable.galery_4),
            Pictures(R.drawable.galery_5),
            Pictures(R.drawable.galery_6),
            Pictures(R.drawable.galery_7)

        )

    }
}