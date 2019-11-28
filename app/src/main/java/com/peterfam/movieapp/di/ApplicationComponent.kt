package com.peterfam.movieapp.di

import com.peterfam.movieapp.MovieApplication
import com.peterfam.movieapp.di.module.AppModule
import com.peterfam.movieapp.di.module.NetworkModule
import com.peterfam.movieapp.di.module.UseCaseModule
import com.peterfam.movieapp.di.module.ViewModelModule
import com.peterfam.movieapp.ui.BaseActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkModule::class, AppModule::class, UseCaseModule::class, ViewModelModule::class])
interface ApplicationComponent {
    fun inject(application: MovieApplication)
    fun inject(baseActivity: BaseActivity)
}