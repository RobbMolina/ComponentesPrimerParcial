package robb.stark.holamundo2.Parcial2.viewmodel

import androidx.lifecycle.ViewModel
import robb.stark.holamundo2.Parcial2.model.VuelosModel
import robb.stark.holamundo2.R

class VuelosViewModel : ViewModel() {

    fun getVuelos(): List<VuelosModel> {
        val Vuelo1 = VuelosModel(
            destino = "Cancun",
            tipo = "Ida y vuelta",
            extras = "No tiene extras",
            img = R.drawable.cancun
        )
        val Vuelo2 = VuelosModel(
            destino = "CDMx",
            tipo = "Sencillo",
            extras = "Incluye Alojamiento",
            img = R.drawable.cdmx
        )
        val Vuelo3 = VuelosModel(
            destino = "Monterrey",
            tipo = "Ida y vuelta",
            extras = "Alojamiento y desayunos",
            img = R.drawable.mty
        )
        return listOf(
            Vuelo1,Vuelo2,Vuelo3
        )
    }

    fun getVuelosInter(): List<VuelosModel> {
        val Vuelo1 = VuelosModel(
            destino = "Seul",
            tipo = "Ida y vuelta",
            extras = "Incluye alojamiento",
            img = R.drawable.seul
        )
        val Vuelo2 = VuelosModel(
            destino = "New York",
            tipo = "Sencillo",
            extras = "Alojamiento y desayunos",
            img = R.drawable.usa
        )
        val Vuelo3 = VuelosModel(
            destino = "Paris",
            tipo = "Semcillo",
            extras = "No inlcuye extras",
            img = R.drawable.paris
        )
        return listOf(
            Vuelo1,Vuelo2,Vuelo3
        )
    }
}
