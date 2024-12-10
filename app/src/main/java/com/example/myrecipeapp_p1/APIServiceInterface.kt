package com.example.myrecipeapp_p1


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit = Retrofit.Builder().baseUrl(
    "https://www.themealdb" +
            ".com/api/json/v1/1/"
)
    .addConverterFactory(GsonConverterFactory.create())
    .build()

val recipeService: APIServiceInterface = retrofit.create(APIServiceInterface::class.java)


interface APIServiceInterface {
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse
}