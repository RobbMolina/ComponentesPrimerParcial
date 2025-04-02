package robb.stark.holamundo2.lazyrowcolum.ViewModel


import androidx.lifecycle.ViewModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.models.Categorias

class CategoriasViewModel : ViewModel() {

    fun obtenerCategorias(): List<Categorias> {
        val cat5 = Categorias(
            idCat = 1,
            nombreCat = "Audio",
            img = R.drawable.audios
        )
        val cat4 = Categorias(
            idCat = 2,
            nombreCat = "Computo",
            img = R.drawable.computo
        )
        val cat2 = Categorias(
            idCat = 3,
            nombreCat = "Videojuegos",
            img = R.drawable.videojuegos
        )
        val cat3 = Categorias(
            idCat = 4,
            nombreCat = "Televisores",
            img = R.drawable.televisores
        )


        val cat1 = Categorias(
            idCat = 5,
            nombreCat = "Telefonia",
            img = R.drawable.telefonia
        )

        return listOf(
            cat1,cat2,cat3,cat4,cat5
        )
    }
}
