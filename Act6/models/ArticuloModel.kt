package robb.stark.holamundo2.Act6.models

import androidx.annotation.DrawableRes

data class ArticuloModelA6(
    val id: Int,
    val nombre: String,
    val descripcion: String?,
    val precio: Float,
    @DrawableRes val img: Int

)
