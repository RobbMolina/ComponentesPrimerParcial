package robb.stark.holamundo2.Act6.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import robb.stark.holamundo2.Act6.models.ArticuloModelA6
import robb.stark.holamundo2.R

//@Preview(showBackground = true)

@Composable
fun ArticuloView(producto: ArticuloModelA6, onComprar: (Float) -> Unit) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = producto.img),
                contentDescription = "",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit)

            Column(Modifier.padding(10.dp).height(150.dp), verticalArrangement = Arrangement.SpaceEvenly) {

                Text(text = producto.nombre, fontSize = 18.sp)
                Text(text = producto.descripcion ?: "", fontSize = 12.sp, color = Color.Gray)
                Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "${producto.precio} MXN", fontSize = 18.sp, fontWeight = FontWeight.Bold)

                    Button(onClick = { onComprar(producto.precio)}, colors = ButtonDefaults.buttonColors(Color(0xFFFFCD36))) {
                        Text(text = "Comprar", color = Color.Black)
                    }
                }
            }
        }
    }
}
