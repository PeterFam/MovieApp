package com.peterfam.movieapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.peterfam.movieapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView(){
        movieRecyclerView.layoutManager = GridLayoutManager(this, 2)
        var movieAdapter = MovieAdapter(this)
        movieRecyclerView.adapter = movieAdapter
    }
}
