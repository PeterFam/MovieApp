package com.peterfam.movieapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.peterfam.movieapp.data.model.Movie

@Database(entities = [Movie::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun movieDAO() : MovieDAO
}