package com.peterfam.movieapp.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.peterfam.movieapp.data.model.Movie

@Dao
interface MovieDAO {

    @Query("SELECT * FROM movie")
    fun getAllMovies(): LiveData<List<Movie>>

    @Insert
    fun addNewMoview(movie: Movie)

    @Delete
    fun deleteMovie(movie: Movie)

    @Update
    fun updateMovie(movie: Movie)

}