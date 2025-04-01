package robb.stark.holamundo2.lazyrowcolum.ViewModel

import androidx.lifecycle.ViewModel
import robb.stark.holamundo2.Parcial2.model.AerolineaModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.models.Productos

class AerolineaViewModel : ViewModel() {

    fun getAerolinea(): List<AerolineaModel> {
        val Aerolinea1 = AerolineaModel(
            id = 1,
            nombre = "AeroMexico",
            img = R.drawable.aeromexico
        )
        val Aerolinea2 = AerolineaModel(
            id = 1,
            nombre = "Volaris",
            img = R.drawable.volaris
        )
        val Aerolinea3 = AerolineaModel(
            id = 1,
            nombre = "Viva",
            img = R.drawable.viva
        )
        return listOf(
            Aerolinea1,Aerolinea2,Aerolinea3
        )
    }
}

