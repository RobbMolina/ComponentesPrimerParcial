package robb.stark.holamundo2.Parcial2.views

import robb.stark.holamundo2.lazyrowcolum.models.Categorias
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import robb.stark.holamundo2.Parcial2.model.AerolineaModel
import robb.stark.holamundo2.Parcial2.model.VuelosModel
import robb.stark.holamundo2.R
import robb.stark.holamundo2.lazyrowcolum.ViewModel.AerolineaViewModel
import robb.stark.holamundo2.lazyrowcolum.ViewModel.CategoriasViewModel
import robb.stark.holamundo2.lazyrowcolum.ViewModel.ProductosViewModelVideojuegos
import robb.stark.holamundo2.lazyrowcolum.views.CategoriasView
import robb.stark.holamundo2.lazyrowcolum.views.ProductosView



@Preview(showBackground = true)

@Composable
fun VuelosView(Vuelos: VuelosModel = VuelosModel("Cancun", "Ida y vuelta","Alojamiento", R.drawable.cancun)) {

    Card(Modifier.width(300.dp).height(200.dp).padding(horizontal = 16.dp)) {
        Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
            Column(Modifier.weight(1f)) {Image(
                painter = painterResource(id = Vuelos.img),
                contentDescription = "",
                contentScale = ContentScale.FillHeight
            ) }
            Column(Modifier.weight(1f), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = Vuelos.tipo, fontSize = 15.sp)
                Text(text = Vuelos.destino, fontSize = 25.sp)
                Text(text = Vuelos.extras, fontSize = 15.sp)  }
        }

        }

}

