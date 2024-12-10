package com.example.myrecipeapp_p1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class RecipeState(
    val loading: Boolean = true,
    val list: List<Category> = emptyList(),
    val error: String? = null
)

data class CategoriesResponse(
    val categories: List<Category>
)

@Parcelize
data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
) : Parcelable