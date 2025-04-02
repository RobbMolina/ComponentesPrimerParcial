package robb.stark.holamundo2.lazyrowcolum.models

import androidx.annotation.DrawableRes

data class Categorias(
    val idCat: Int,
    val nombreCat: String,
    @DrawableRes val img: Int

)