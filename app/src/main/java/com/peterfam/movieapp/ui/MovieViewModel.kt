package com.peterfam.movieapp.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.peterfam.movieapp.data.DataRepository
import com.peterfam.movieapp.data.local.AppDatabase
import com.peterfam.movieapp.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MovieViewModel(application: Application) : AndroidViewModel(application) {

    private val dataRepository: DataRepository

    val allMovies: LiveData<List<Movie>>

    private var parentJob = Job()
    private val corotinesContext: CoroutineContext
        get() = parentJob + Dispatchers.Main

    private val scope = CoroutineScope(corotinesContext)

    init {
        val movieDAO = AppDatabase.getDatabase(application, scope).movieDAO()
        dataRepository = DataRepository(movieDAO)
        allMovies = dataRepository.allMovies
    }

    fun insert(movie: Movie) = scope.launch(Dispatchers.IO){
        dataRepository.insert(movie)
    }

    fun update(movie: Movie) = scope.launch(Dispatchers.IO){
        dataRepository.update(movie)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }

}