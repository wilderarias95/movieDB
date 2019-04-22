package com.example.moviedb.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoviesAdapter {

    class MoviesViewHolder : RecyclerView.ViewHolder {

        private lateinit var tName: TextView

        constructor(itemView: View) : super(itemView) {

        }
    }

}