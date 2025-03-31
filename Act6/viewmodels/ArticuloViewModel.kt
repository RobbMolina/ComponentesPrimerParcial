package robb.stark.holamundo2.Act6.viewmodels


import androidx.lifecycle.ViewModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.Act6.models.ArticuloModelA6

class ProductViewModelA6(): ViewModel() {
    init {
        //obtenerProductos()
    }

    fun obtenerProductos(): List<ArticuloModelA6> {
        val productoUno = ArticuloModelA6(
            id = 1,
            nombre = "A song of ice and fire: game of thrones",
            descripcion = "Juego de mesa basado en la serie de libros 'Juego de Tronos'.",
            precio = 250.00f, // Ajustado a un precio más adecuado para un juego de mesa.
            img = R.drawable.got1
        )
        val productoDos = ArticuloModelA6(
            id = 2,
            nombre = "A song of ice and fire: clash of kings",
            descripcion = "Edición especial de la serie de libros 'Choque de Reyes'.",
            precio = 350.00f, // Ajustado para una edición especial.
            img = R.drawable.got2
        )
        val productoTres = ArticuloModelA6(
            id = 3,
            nombre = "A song of ice and fire: a fest of crows",
            descripcion = "Colección de relatos cortos de la saga 'Festín de Cuervos'.",
            precio = 180.00f, // Precio de un libro coleccionable.
            img = R.drawable.got3
        )
        val productoCuatro = ArticuloModelA6(
            id = 4,
            nombre = "A song of ice and fire: a storm of swords",
            descripcion = "Libro de la serie 'Tormenta de Espadas', parte clave de la saga.",
            precio = 450.00f, // Ajustado para un libro de gran demanda.
            img = R.drawable.got4
        )
        val productoCinco = ArticuloModelA6(
            id = 5,
            nombre = "A song of ice and fire: a dance with dragons",
            descripcion = "Edición de lujo del libro 'Danza con Dragones' de la saga.",
            precio = 500.00f, // Precio elevado por la edición de lujo.
            img = R.drawable.got5
        )
        val productoSeis = ArticuloModelA6(
            id = 6,
            nombre = "A good girl guide to murder",
            descripcion = "Libro de misterio de la serie 'Una buena chica con un plan de asesinato'.",
            precio = 200.00f, // Precio adecuado para un libro de misterio de buena calidad.
            img = R.drawable.goodgirl
        )
        val productoSiete = ArticuloModelA6(
            id = 7,
            nombre = "Fire and blood",
            descripcion = "Libro sobre la historia de la Casa Targaryen en el universo de 'Juego de Tronos'.",
            precio = 600.00f, // Un precio adecuado para una obra sobre la Casa Targaryen.
            img = R.drawable.fire_blood
        )
        val productoOcho = ArticuloModelA6(
            id = 8,
            nombre = "Percy Jackson and the olympians",
            descripcion = "Primera novela de la serie sobre Percy Jackson, el semidiós griego.",
            precio = 180.00f, // Precio estándar para un libro juvenil popular.
            img = R.drawable.percy1
        )
        val productoNueve = ArticuloModelA6(
            id = 9,
            nombre = "Percy Jackson and the olympians 2",
            descripcion = "Segundo libro de la serie de Percy Jackson, 'El mar de los monstruos'.",
            precio = 180.00f, // Similar al precio del primer libro.
            img = R.drawable.percy2
        )
        val productoDiez = ArticuloModelA6(
            id = 10,
            nombre = "Harry potter and the order of fenix",
            descripcion = "Quinto libro de la saga de Harry Potter, 'La orden del Fénix'.",
            precio = 450.00f, // Precio adecuado para un libro popular de la saga.
            img = R.drawable.hp5
        )

    val productList = listOf<ArticuloModelA6>(
            productoUno, productoDos, productoTres, productoCuatro, productoCinco,
            productoSeis, productoSiete, productoOcho, productoNueve, productoDiez
        )
        return productList

    }
}