package com.peterfam.movieapp.data.remote

import retrofit2.Retrofit
import javax.inject.Inject

class MovieAPIServices @Inject constructor(retrofit: Retrofit) : MovieAPI {

    private val movieAPI by lazy {
        retrofit.create(MovieAPI::class.java)
    }
}