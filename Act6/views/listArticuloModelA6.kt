package robb.stark.holamundo2.Act6.views

import android.app.AlertDialog
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import robb.stark.holamundo2.Act6.models.ArticuloModelA6
import robb.stark.holamundo2.Act6.viewmodels.ProductViewModelA6
import androidx.navigation.NavController
import robb.stark.holamundo2.Act6.savedData
import robb.stark.holamundo2.Preferencias.Preferencias


//@Preview(showBackground = true)
@Composable
fun ListProductViewA6(navegar: NavController) {
    val context = LocalContext.current
    val preferencias = savedData(context)
    val corroutine = rememberCoroutineScope()

    val savedAge = preferencias.edad.collectAsState(initial = 0)
    val savedNombre = preferencias.nombre.collectAsState(initial = "jg")
    val savedAltura = preferencias.altura.collectAsState(initial = 0.00f)
    val savedMonedero = preferencias.monedero.collectAsState(initial = 0.00f)

    val productViewModel: ProductViewModelA6 = ProductViewModelA6()

    var total by remember { mutableStateOf(0f) }

    // Controlar la visibilidad del AlertDialog para ver datos
    val showDialog = remember { mutableStateOf(false) }

    // Controlar la visibilidad del AlertDialog para el error de dinero insuficiente
    val showErrorDialog = remember { mutableStateOf(false) }

    val builder: AlertDialog.Builder = AlertDialog.Builder(context)
    builder
        .setTitle("Informacion personal")
        .setMessage("Nombre: ${savedNombre.value}\n Edad: ${savedAge.value}\n Altura: ${savedAltura.value}")

    val dialog: AlertDialog = builder.create()

    // AlertDialog de error
    val errorDialog: AlertDialog.Builder = AlertDialog.Builder(context)
    errorDialog
        .setTitle("Error")
        .setMessage("No tienes suficiente dinero para comprar este artículo.")
        .setPositiveButton("OK") { _, _ -> showErrorDialog.value = false }

    val errorDialogInstance: AlertDialog = errorDialog.create()

    // Solo mostrar el AlertDialog de error si se solicita
    if (showErrorDialog.value) {
        errorDialogInstance.show()
    }

    Column(Modifier.fillMaxSize()) {
        Row(Modifier.fillMaxWidth().background(Color(0xFF1B945C)).weight(1f).padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Text(text = "DATA STORE", color = Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)

            FloatingActionButton(onClick = {
                showDialog.value = true
                if (showDialog.value) {
                    dialog.show()
                }
            }) {
                Text(text = "Ver datos")
            }
        }

        LazyColumn(Modifier.weight(8f)) {
            items(productViewModel.obtenerProductos()) { product ->
                val dineroRestante = savedMonedero.value - total

                // Enviar precio al onComprar solo si el dinero restante es suficiente
                ArticuloView(producto = product, onComprar = { precio ->
                    if (dineroRestante >= precio) {
                        total += precio  // Si hay suficiente dinero, sumar el precio al total
                    } else {
                        showErrorDialog.value = true  // Si no hay suficiente dinero, mostrar el error
                    }
                })
            }
        }

        Row(Modifier.fillMaxWidth().background(Color(0xFFE1E1E1)).weight(1f).padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            val dineroRestante = savedMonedero.value - total
            Text(text = "Dinero Restante: $dineroRestante MXN", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "Total: $total MXN", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }
}
