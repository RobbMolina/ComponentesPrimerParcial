package robb.stark.holamundo2.Parcial2.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import robb.stark.holamundo2.Parcial2.model.VuelosModel
import robb.stark.holamundo2.Parcial2.viewmodel.VuelosViewModel
import robb.stark.holamundo2.lazyrowcolum.views.CategoriasView
import robb.stark.holamundo2.lazyrowcolum.views.ProductosView

@Preview(showBackground = true)
@Composable
fun VuelosList() {

    val viewModel: VuelosViewModel = viewModel()
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth().padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "A donde deseas viajar?", fontSize = 30.sp, fontWeight = FontWeight.SemiBold)
        }
        Column(Modifier.fillMaxWidth()) {
            Text(text = "Vuelos Nacionales",fontSize = 30.sp)
            Spacer(Modifier.height(10.dp))
            LazyRow(Modifier.fillMaxWidth()) {items(viewModel.getVuelos()) { Vuelos ->
                VuelosView(Vuelos = Vuelos)
            }  }
            Spacer(Modifier.height(16.dp))
            Text(text = "Vuelos Internacionales",fontSize = 30.sp)
            Spacer(Modifier.height(10.dp))
            LazyRow(Modifier.fillMaxWidth()) {items(viewModel.getVuelosInter()) { Vuelos ->
                VuelosView(Vuelos = Vuelos)
            }  }
        }
    }
}