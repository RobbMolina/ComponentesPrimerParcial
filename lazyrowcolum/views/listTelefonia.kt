package robb.stark.holamundo2.lazyrowcolum.views

import android.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import robb.stark.holamundo2.lazyrowcolum.models.Productos
import robb.stark.holamundo2.lazyrowcolum.ViewModel.ProductosViewModel
import androidx.navigation.NavController
import robb.stark.holamundo2.Preferencias.Preferencias

//@Preview(showBackground = true)
@Composable
fun ListProductos(navegar: NavController, idCat: Int) {
    val viewModel: ProductosViewModel = viewModel()
    val productosFiltrados = viewModel.obtenerProductos().filter { it.idcat == idCat }

    Column(Modifier.fillMaxSize()) {
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFCD36))
                .weight(1f)
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Mercado Libre", fontSize = 30.sp, fontWeight = FontWeight.SemiBold)
        }

        LazyColumn(Modifier.weight(8f)) {
            items(productosFiltrados) { producto ->
                ProductosView(productos = producto)
            }
        }

        Row(
            Modifier
                .fillMaxWidth()
                .background(Color(0xFFE1E1E1))
                .weight(1f)
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navegar.popBackStack()
            }, modifier = Modifier.padding(16.dp)) {
                Icon(imageVector = Icons.Filled.ExitToApp, contentDescription = "Regresar")
            }
        }
    }
}
