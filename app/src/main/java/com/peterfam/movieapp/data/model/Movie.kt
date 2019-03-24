package com.peterfam.movieapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Movie (

@PrimaryKey(autoGenerate = true)
val id: Int,

@ColumnInfo(name = "movieTitle")
val movieTitle: String,

@ColumnInfo(name = "movieCategory")
val movieCategory: String,

@ColumnInfo(name = "moviePoster")
val moviePoster: String
): Serializable