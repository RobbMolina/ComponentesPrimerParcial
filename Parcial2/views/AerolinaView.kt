package robb.stark.holamundo2.Parcial2.views

import robb.stark.holamundo2.lazyrowcolum.models.Categorias
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import robb.stark.holamundo2.Parcial2.model.AerolineaModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.ViewModel.AerolineaViewModel
import robb.stark.holamundo2.lazyrowcolum.ViewModel.CategoriasViewModel
import robb.stark.holamundo2.lazyrowcolum.views.CategoriasView

@Preview(showBackground = true)
@Composable
fun ListAerolineas() {

    val viewModel: AerolineaViewModel = viewModel()
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(
                value = "",
                onValueChange = { },
                label = { Text("Ingrese texto") },
                placeholder = { Text("Escribe algo...") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )
            Text(text = "Selecciona tu aerolinea", fontSize = 20.sp)
        }

        LazyColumn(
            Modifier.padding(top = 30.dp)){
            items(viewModel.getAerolinea()) { Aerolinea ->
                AerolineaView(Aerolinea = Aerolinea)
            }
        }

        Row(Modifier.fillMaxWidth().padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween){
            Button(onClick = {
                //navegar.navigate("ListVuelos")
            },
                modifier = Modifier.width(120.dp)){
                Text(text = "Regresar", fontSize = 15.sp)}

            Button(onClick = {
                //navegar.navigate("ListProductViewA6")
                //?nombre=$nombre&edad=$edad&altura=$altura&monedero=$monedero
            },
                modifier = Modifier.width(120.dp)){
                Text(text = "Reservar", fontSize = 15.sp)}

        }


    }
}
@Composable
fun AerolineaView(Aerolinea: AerolineaModel = AerolineaModel(1,"Aerolinea", R.drawable.computo)) {
    Card(Modifier.padding(16.dp)) {
        Column(
            Modifier
                .width(150.dp)
                .height(150.dp),horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(2f),verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Image(
                    painter = painterResource(id = Aerolinea.img),
                    contentDescription = "",
                    contentScale = ContentScale.Fit
                )
            }
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(1f), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                Text(text = Aerolinea.nombre, fontSize = 25.sp)
            }
        }
    }
}

