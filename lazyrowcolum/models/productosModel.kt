package robb.stark.holamundo2.lazyrowcolum.models

import androidx.annotation.DrawableRes

data class Productos(
    val idcat: Int,
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val envio: String,
    val promo: String,
    @DrawableRes val img: Int

)