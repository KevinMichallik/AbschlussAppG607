package com.example.g607.ui

import androidx.lifecycle.ViewModel
import com.example.g607.data.model.Repository

class ViewModel : ViewModel() {

    // TODO: Kommentare richtig ausführen

    //laden unser repository
    private val repository = Repository()

    //wenn objekt von viewmodel erstellt wird, wird funktion loadvacations ausgeführt
    init {
        repository.loadPictures()
    }
}