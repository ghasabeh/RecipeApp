package com.ghasabeie.recipeapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

interface ApiService {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}

val recipeService = retrofit.create(ApiService::class.java)