package com.example.guitars.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.guitars.model.Guitar

@Dao
interface GuitarDao {

    @Query("SELECT * FROM GUITAR")
    fun getAllData(): LiveData<List<Guitar>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addGuitar (guitar: Guitar)

    @Update(onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateGuitar (guitar: Guitar)

    @Delete
    suspend fun deleteGuitar (guitar: Guitar)
}