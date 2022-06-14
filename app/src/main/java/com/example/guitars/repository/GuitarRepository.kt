package com.example.guitars.repository

import androidx.lifecycle.LiveData
import com.example.guitars.data.GuitarDao
import com.example.guitars.model.Guitar

class GuitarRepository(private val guitarDao: GuitarDao) {
    val getAllData: LiveData<List<Guitar>> = guitarDao.getAllData()

    suspend fun addGuitar(guitar: Guitar){
        guitarDao.addGuitar(guitar)

    }

    suspend fun updateGuitar(guitar: Guitar){
        guitarDao.addGuitar(guitar)

    }

    suspend fun deleteGuitar(guitar: Guitar){
        guitarDao.addGuitar(guitar)

    }
}