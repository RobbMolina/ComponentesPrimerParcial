package robb.stark.holamundo2.Parcial2.model

import androidx.annotation.DrawableRes

data class AerolineaModel(
    val id: Int,
    val nombre: String,
    @DrawableRes val img: Int

)