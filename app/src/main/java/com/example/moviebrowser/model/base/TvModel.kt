package com.example.moviebrowser.model.base

import com.example.moviebrowser.model.results.TvResults

// data class for the base api response
data class TvModel (
    val page : Int? = null,
    val results: ArrayList<TvResults> = arrayListOf(),
    val total_page: Int? = null,
    val total_results: Int? = null
)