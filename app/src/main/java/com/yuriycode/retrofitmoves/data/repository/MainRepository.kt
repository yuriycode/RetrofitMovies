package com.yuriycode.retrofitmoves.data.repository

import com.yuriycode.retrofitmoves.data.api.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}