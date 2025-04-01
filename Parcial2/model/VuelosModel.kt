package robb.stark.holamundo2.Parcial2.model

import androidx.annotation.DrawableRes

data class VuelosModel(
    val destino: String,
    val tipo: String,
    val extras: String,
    @DrawableRes val img: Int

)
