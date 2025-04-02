package robb.stark.holamundo2.lazyrowcolum.views

import robb.stark.holamundo2.lazyrowcolum.models.Categorias
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import robb.stark.holamundo2.R


//@Preview(showBackground = true)
@Composable
fun CategoriasView(navegar: NavController,categorias: Categorias = Categorias(1,"Categoria", R.drawable.computo)) {

    val idCat = categorias.idCat
        Column(Modifier.width(200.dp).height(300.dp).padding(10.dp).background(Color.White),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
            Row(Modifier.fillMaxWidth().weight(1f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Text(text = categorias.nombreCat, fontSize = 25.sp)
            }
            Row(Modifier.fillMaxWidth().weight(7f),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = categorias.img),
                    contentDescription = "",
                    contentScale = ContentScale.Fit
                )
            }
            Row(Modifier.fillMaxWidth().weight(2f),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Button( onClick = {
                    navegar.navigate("ListProductos/$idCat")
                }, colors = ButtonDefaults.buttonColors(Color(0xFFFFCD36))) {
                    Text(text = "Ir a la categoria", color = Color.Black)
                }
            }



        }
    }

