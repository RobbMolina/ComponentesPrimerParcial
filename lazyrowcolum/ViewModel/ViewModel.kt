package robb.stark.holamundo2.lazyrowcolum.ViewModel

import androidx.lifecycle.ViewModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.models.Productos

class ProductosViewModel : ViewModel() {

    fun obtenerProductos(): List<Productos> {
        val productoUno = Productos(
            idcat = 1,
            nombre = "Bose QuietComfort 35 II",
            descripcion = "Auriculares inalámbricos con cancelación de ruido.",
            precio = 349.99f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.bose
        )

        val productoDos = Productos(
            idcat = 1,
            nombre = "Sony WH-1000XM4",
            descripcion = "Auriculares con cancelación activa de ruido, ideales para viajes.",
            precio = 379.00f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.sony
        )

        val productoTres = Productos(
            idcat = 1,
            nombre = "JBL Flip 5",
            descripcion = "Altavoz bluetooth portátil resistente al agua.",
            precio = 119.00f,
            envio = "50.00 MXN",
            promo = "Descuento del 15%",
            img = R.drawable.jbl
        )

        val productoCuatro = Productos(
            idcat = 1,
            nombre = "Sennheiser Momentum 3",
            descripcion = "Auriculares inalámbricos de alta calidad con cancelación de ruido y sonido premium.",
            precio = 399.00f,
            envio = "Gratis",
            promo = "Descuento del 5%",
            img = R.drawable.senheiser
        )

        val productoCinco = Productos(
            idcat = 1,
            nombre = "Marshall Stanmore II",
            descripcion = "Altavoz bluetooth de alta calidad con un diseño clásico y sonido potente.",
            precio = 399.99f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.mashall
        )

        val productoSeis = Productos(
            idcat = 5,
            nombre = "Samsung Galaxy S23",
            descripcion = "El Samsung Galaxy S23 cuenta con un potente procesador y una cámara impresionante.",
            precio = 999.00f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.samsung_s23
        )
        val productoSiete = Productos(
            idcat = 5,

            nombre = "iPhone 14 Pro",
            descripcion = "El iPhone 14 Pro ofrece una pantalla Super Retina XDR y una increíble cámara de 48 MP.",
            precio = 1099.00f,
            envio = "1500.00 MXN",
            promo = "Descuento del 15%",
            img = R.drawable.iphone14
        )
        val productoOcho = Productos(
            idcat = 5,

            nombre = "Google Pixel 7",
            descripcion = "El Google Pixel 7 es conocido por su cámara líder en la industria y software limpio.",
            precio = 599.00f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.pixel7
        )
        val productoNueve = Productos(
            idcat = 5,

            nombre = "OnePlus 11",
            descripcion = "OnePlus 11 tiene un diseño elegante y es muy rápido con su procesador Snapdragon 8 Gen 2.",
            precio = 749.00f,
            envio = "499.00 MXN",
            promo = "Descuento del 20%",
            img = R.drawable.oneplus
        )
        val productoDiez = Productos(
            idcat = 5,

            nombre = "Xiaomi Mi 13",
            descripcion = "El Xiaomi Mi 13 ofrece un rendimiento increíble y una pantalla AMOLED de 120Hz.",
            precio = 650.00f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.xiaomi
        )
        val productoOnce = Productos(
            idcat = 3,
            nombre = "PlayStation 5",
            descripcion = "La consola más potente con soporte para juegos en 4K.",
            precio = 499.99f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.ps5
        )

        val productoDoce = Productos(
            idcat = 3,
            nombre = "Xbox Series X",
            descripcion = "Consola con gráficos de alta calidad y soporte para 120Hz.",
            precio = 499.00f,
            envio = "Gratis",
            promo = "Descuento del 5%",
            img = R.drawable.xbox
        )

        val productoTrece = Productos(
            idcat = 3,
            nombre = "Nintendo Switch",
            descripcion = "Consola híbrida con juegos portátiles y de sobremesa.",
            precio = 299.99f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.nintendo
        )

        val productoCatorce = Productos(
            idcat = 3,
            nombre = "The Legend of Zelda: Breath of the Wild",
            descripcion = "Juego de aventura épico para Nintendo Switch.",
            precio = 59.99f,
            envio = "Gratis",
            promo = "Descuento del 20%",
            img = R.drawable.zelda
        )

        val productoQuince = Productos(
            idcat = 3,
            nombre = "God of War Ragnarök",
            descripcion = "Juego de acción y aventura para PlayStation 5 con gráficos impresionantes.",
            precio = 69.99f,
            envio = "Gratis",
            promo = "Descuento del 15%",
            img = R.drawable.gow
        )
        val productoDieciséis = Productos(
            idcat = 2,
            nombre = "Laptop Dell XPS 13",
            descripcion = "Laptop ultradelgada, ideal para trabajo y entretenimiento.",
            precio = 1599.99f,
            envio = "Gratis",
            promo = "Descuento del 5%",
            img = R.drawable.lenovo
        )

        val productoDiecisiete = Productos(
            idcat = 2,
            nombre = "HP Pavilion 15",
            descripcion = "Laptop potente con procesador Intel Core i7 y 16GB de RAM.",
            precio = 999.00f,
            envio = "250.00 MXN",
            promo = "Descuento del 10%",
            img = R.drawable.pavillion
        )

        val productoDieciocho = Productos(
            idcat = 2,
            nombre = "Asus ROG Strix",
            descripcion = "Laptop gamer con gráfica NVIDIA RTX 3060.",
            precio = 1799.99f,
            envio = "Gratis",
            promo = "Descuento del 15%",
            img = R.drawable.asus
        )

        val productoDiecinueve = Productos(
            idcat = 2,
            nombre = "MacBook Pro 13",
            descripcion = "La nueva MacBook Pro con chip M1, rendimiento excepcional.",
            precio = 1299.00f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.macbook
        )

        val productoVeinte = Productos(
            idcat = 2,
            nombre = "Microsoft Surface Laptop 4",
            descripcion = "Laptop premium con pantalla táctil de 13.5\" y gran rendimiento.",
            precio = 1499.99f,
            envio = "Gratis",
            promo = "Descuento del 7%",
            img = R.drawable.computo
        )
        val productoVeintiuno = Productos(
            idcat = 4,
            nombre = "Samsung QLED 4K",
            descripcion = "Televisor 4K con tecnología QLED y sonido envolvente.",
            precio = 799.99f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.qled
        )

        val productoVeintidos = Productos(
            idcat = 4,
            nombre = "LG OLED 55\"",
            descripcion = "Televisor OLED 4K con HDR, ideal para cine en casa.",
            precio = 1599.00f,
            envio = "Gratis",
            promo = "Sin promociones vigentes",
            img = R.drawable.ld
        )

        val productoVeintitres = Productos(
            idcat = 4,
            nombre = "Sony Bravia 65\"",
            descripcion = "Televisor con tecnología OLED y sonido Dolby Atmos.",
            precio = 2199.00f,
            envio = "Gratis",
            promo = "Descuento del 5%",
            img = R.drawable.bravia
        )

        val productoVeinticuatro = Productos(
            idcat = 4,
            nombre = "Samsung The Frame 55\"",
            descripcion = "Televisor 4K que se convierte en una obra de arte cuando está apagado.",
            precio = 1799.00f,
            envio = "Gratis",
            promo = "Descuento del 15%",
            img = R.drawable.theframe
        )

        val productoVeinticinco = Productos(
            idcat = 4,
            nombre = "TCL 6-Series QLED 65\"",
            descripcion = "Televisor QLED con calidad de imagen 4K y tecnología de atenuación local.",
            precio = 899.99f,
            envio = "Gratis",
            promo = "Descuento del 10%",
            img = R.drawable.tcl
        )
        return listOf(
            productoUno, productoDos, productoTres, productoCuatro, productoCinco,
            productoSeis, productoSiete, productoOcho, productoNueve, productoDiez,
            productoOnce, productoDoce, productoTrece, productoCatorce, productoQuince,
            productoDieciséis, productoDiecisiete, productoDieciocho, productoDiecinueve, productoVeinte,
            productoVeintiuno, productoVeintidos, productoVeintitres, productoVeinticuatro, productoVeinticinco
        )

    }
}
