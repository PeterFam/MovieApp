package com.peterfam.movieapp.ui

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.peterfam.movieapp.data.model.Movie

class MovieAdapter internal constructor(context: Context): RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {


    private var movieList = emptyList<Movie>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.MovieViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MovieAdapter.MovieViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    public class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

}