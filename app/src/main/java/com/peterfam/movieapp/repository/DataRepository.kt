package com.peterfam.movieapp.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.peterfam.movieapp.data.local.MovieDAO
import com.peterfam.movieapp.data.model.Movie

class DataRepository(private val movieDAO: MovieDAO) {

    val allMovies: LiveData<List<Movie>> = movieDAO.getAllMovies()

    @WorkerThread
    suspend fun insert(movie: Movie) {
        movieDAO.addNewMoview(movie)
    }

    @WorkerThread
    suspend fun update(movie: Movie) {
        movieDAO.updateMovie(movie)
    }
}