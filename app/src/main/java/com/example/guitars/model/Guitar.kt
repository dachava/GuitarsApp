package com.example.guitars.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "guitar")
data class Guitar(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name = "marca")
    val marca: String,
    @ColumnInfo(name = "modelo")
    val modelo: String,
    @ColumnInfo(name = "precio")
    val precio: String?,
    @ColumnInfo(name = "correo")
    val correo: String?,
    @ColumnInfo(name = "telefono")
    val telefono: String?,
    @ColumnInfo(name = "rutaAudio")
    val rutaAudio: String?,
    @ColumnInfo(name = "rutaImagen")
    val rutaImagen: String?,
):Parcelable


