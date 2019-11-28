package com.peterfam.movieapp.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.peterfam.movieapp.MovieApplication
import com.peterfam.movieapp.di.ApplicationComponent

abstract class BaseActivity : AppCompatActivity(){

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (this.application as MovieApplication).appComponent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
    }
}