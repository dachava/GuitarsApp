package com.example.guitars.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.guitars.data.GuitarDao
import com.example.guitars.data.GuitarDatabase
import com.example.guitars.model.Guitar
import com.example.guitars.repository.GuitarRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GuitarViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData: LiveData<List<Guitar>>

    private val repository: GuitarRepository

    init{
        val guitarDao= GuitarDatabase.getDatabase(application).guitarDao()
        repository = GuitarRepository(guitarDao)
        getAllData = repository.getAllData
    }

    fun addGuitar (guitar: Guitar){
        viewModelScope.launch(Dispatchers.IO) { repository.addGuitar(guitar) }
    }

    fun updateGuitar (guitar: Guitar){
        viewModelScope.launch(Dispatchers.IO) { repository.updateGuitar(guitar) }
    }
    fun deleteGuitar (guitar: Guitar){
        viewModelScope.launch(Dispatchers.IO) { repository.deleteGuitar(guitar) }
    }



}