package robb.stark.holamundo2.lazyrowcolum.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import robb.stark.holamundo2.lazyrowcolum.ViewModel.CategoriasViewModel
import robb.stark.holamundo2.lazyrowcolum.models.Categorias

//@Preview(showBackground = true)
@Composable
fun ListCategorias(navegar: NavController) {

    val viewModel: CategoriasViewModel = viewModel()
    Column(Modifier.fillMaxSize().background(Color(0xFFF6F6F6))) {
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

        LazyRow(Modifier.weight(8f).padding(top = 30.dp)) {
            items(viewModel.obtenerCategorias()) { categorias ->
                CategoriasView(navegar,categorias = categorias)
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
            IconButton(onClick = { }, modifier = Modifier.padding(16.dp)
            ) {
                Icon(imageVector = Icons.Filled.ExitToApp, contentDescription = "Regresar")
            }
        }
    }
}


