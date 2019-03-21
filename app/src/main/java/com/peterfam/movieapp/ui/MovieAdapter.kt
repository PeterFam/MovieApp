package com.peterfam.movieapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.peterfam.movieapp.data.model.Movie
import com.peterfam.movieapp.R

class MovieAdapter internal constructor(private val context: Context) :
    RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movieList = emptyList<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        return MovieViewHolder(LayoutInflater.from(context).inflate(R.layout.movie_item_list, parent, false))
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {

//        Glide.with(context)
//            .load("https://www.designyourway.net/blog/wp-content/uploads/2018/01/9xuYZ9H.jpg")
//            .into(holder.movieImg)

    }

    public class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImg: ImageView = itemView.findViewById(R.id.movie_img)
    }

}