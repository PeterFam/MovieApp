package com.peterfam.movieapp.data.remote

import android.content.Context
import com.peterfam.movieapp.helpers.networkInfo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NetworkHandler @Inject constructor(private val context: Context) {
    val isConnected get() = context.networkInfo?.isConnected
}