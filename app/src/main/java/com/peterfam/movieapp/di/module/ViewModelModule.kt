package com.peterfam.movieapp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.peterfam.movieapp.di.scope.ViewModelFactory
import com.peterfam.movieapp.di.scope.ViewModelKey
import com.peterfam.movieapp.ui.MovieViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory


    @Binds
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    abstract fun bindsMovieViewModel(movieViewModel: MovieViewModel): ViewModel
}