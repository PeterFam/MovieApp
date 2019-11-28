package com.peterfam.movieapp.data.remote

sealed class Failure {
    object NetworkConnection : Failure()
    object ServerError : Failure()
    object Unauthorized : Failure()
}