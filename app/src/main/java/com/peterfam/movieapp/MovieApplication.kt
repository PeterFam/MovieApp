package com.peterfam.movieapp

import android.app.Application
import com.peterfam.movieapp.di.ApplicationComponent
import com.peterfam.movieapp.di.DaggerApplicationComponent
import com.peterfam.movieapp.di.module.AppModule
import com.peterfam.movieapp.di.module.NetworkModule

class MovieApplication : Application() {

    val appComponent: ApplicationComponent by lazy (mode = LazyThreadSafetyMode.NONE){
        DaggerApplicationComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        injectMembers()
    }

    private fun injectMembers() = appComponent.inject(this)


}