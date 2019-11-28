package com.peterfam.movieapp.di.module

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import javax.inject.Named
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext


@Module
class UseCaseModule {

    @Named("UseCaseScope")
    @Provides
    @Singleton
    fun provideCorotinesScope(): CoroutineScope = object : CoroutineScope {
        private val job = Job()
        override val coroutineContext: CoroutineContext
            get() = job + Dispatchers.IO
    }

    @Provides
    @Singleton
    fun provideCorotinesDispatcher(): CoroutineDispatcher = Dispatchers.Main
}