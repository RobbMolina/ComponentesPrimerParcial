package robb.stark.holamundo2.lazyrowcolum.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.models.Productos

@Preview(showBackground = true)
@Composable
fun ProductosView(productos: Productos = Productos(
        idcat = 1,
        nombre = "Producto Ejemplo",
        descripcion = "Descripción del producto",
        precio = 299.99f,
        envio = "Gratis",
        promo = "10% de descuento",
        img = R.drawable.computo
    )
) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = productos.img),
                contentDescription = "",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )

            Column(
                Modifier.padding(10.dp).height(150.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text(text = productos.nombre, fontSize = 18.sp)
                Text(text = productos.descripcion ?: "", fontSize = 12.sp, color = Color.Gray)
                Text(text = "Envio: ${productos.envio}" ?: "", fontSize = 12.sp, color = Color(0xFF16A400))
                Text(text = productos.promo ?: "", fontSize = 12.sp)

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "${productos.precio} MXN", fontSize = 18.sp, fontWeight = FontWeight.Bold)

                    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color(0xFFFFCD36))) {
                        Text(text = "Comprar", color = Color.Black)
                    }
                }
            }
        }
    }
}
