package com.example.moviebrowser.model.base

import com.example.moviebrowser.model.results.MovieResults

data class MovieModel(
    val page : Int? = null,
    val results: ArrayList<MovieResults> = arrayListOf(),
    val total_page: Int? = null,
    val total_results: Int? = null
)
