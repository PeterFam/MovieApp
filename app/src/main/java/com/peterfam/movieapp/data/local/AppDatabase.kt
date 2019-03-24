package com.peterfam.movieapp.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.peterfam.movieapp.data.model.Movie
import kotlinx.coroutines.CoroutineScope

@Database(entities = [Movie::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun movieDAO(): MovieDAO

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context,
                        scope: CoroutineScope) : AppDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java,
                    "Movie_database").build()

                INSTANCE = instance
                return instance
            }

        }
    }
}
