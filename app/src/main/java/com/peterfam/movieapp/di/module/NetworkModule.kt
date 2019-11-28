package com.peterfam.movieapp.di.module

import android.app.Application
import android.content.Context
import com.peterfam.movieapp.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class NetworkModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = application

    @Provides
    @Singleton
    fun provideClient(): OkHttpClient {
        val okHttpClient: OkHttpClient.Builder =
            OkHttpClient.Builder().readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS).callTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
        if (BuildConfig.DEBUG) {
            val loggingInterceptor =
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
            okHttpClient.addInterceptor(loggingInterceptor)
        }
        okHttpClient.addInterceptor { chain ->
            var request = chain.request()
            val url = request.url().newBuilder().addQueryParameter("api_key", BuildConfig.API_KEY).build()
            request = request.newBuilder().url(url).build()
            chain.proceed(request)
        }

        return okHttpClient.build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

}