package com.peterfam.movieapp.data.local

import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {

    override fun onOpen(db: SupportSQLiteDatabase) {
        super.onOpen(db)

//        INSTANCE?.let{
//    database -> scope.launch(Dispatchers.IO){
//            populateDatabase(database.wordDao())
//        }
//
//        }
    }
}