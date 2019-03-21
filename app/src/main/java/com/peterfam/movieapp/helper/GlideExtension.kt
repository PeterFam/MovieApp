package com.peterfam.movieapp.helper

import android.content.Context
import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import android.util.DisplayMetrics
import androidx.annotation.NonNull
import com.bumptech.glide.annotation.GlideOption
import com.bumptech.glide.request.RequestOptions



//@GlideExtension
//class GlideExtension {
//
//    @NonNull
//    @GlideOption
//    fun roundedCorners(options: RequestOptions, context: Context, cornerRadius: Int): RequestOptions {
//        val px =
//            Math.round(cornerRadius * (context.getResources().getDisplayMetrics().xdpi / DisplayMetrics.DENSITY_DEFAULT))
//        return options.transform(RoundedCorners(px))
//    }
//
//}