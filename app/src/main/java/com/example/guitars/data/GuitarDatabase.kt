package com.example.guitars.data

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.guitars.model.Guitar

@Database(entities = [Guitar::class], version=1, exportSchema=false)
abstract class GuitarDatabase: RoomDatabase() {
abstract fun guitarDao() : GuitarDao

companion object{
    @Volatile
    private var INSTANCE: GuitarDatabase? = null

    fun getDatabase(context: android.content.Context): GuitarDatabase{
        val tempInstance = INSTANCE
        if (tempInstance != null){
            return tempInstance
        }
        synchronized(this){
            val instance = Room.databaseBuilder(
                context.applicationContext,
                GuitarDatabase::class.java,
                "guitar_database"
            ).build()
            INSTANCE = instance
            return instance
        }
    }
}
}