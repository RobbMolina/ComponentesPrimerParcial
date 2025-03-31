package robb.stark.holamundo2.Act6.NavA6
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import kotlinx.coroutines.launch
import robb.stark.holamundo2.Act6.savedData
import robb.stark.holamundo2.Preferencias.Preferencias
import robb.stark.holamundo2.R

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true)
@Composable


fun InicioA6(navegar: NavController){
    var nombre by remember{
        mutableStateOf(value = "")
    }
    var edad by remember{
        mutableStateOf(value = "")
    }
    var altura by remember{
        mutableStateOf(value = "")
    }
    var monedero by remember{
        mutableStateOf(value = "")
    }

    var password by remember{
        mutableStateOf(value = "")
    }

    var checked by remember { mutableStateOf(false) }

    val context = LocalContext.current
    val savedDataA6 = savedData(context)
    val corroutine = rememberCoroutineScope()

    Column(Modifier.fillMaxSize().background(Color.White), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Column(Modifier.fillMaxWidth()
            .weight(.5f), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                Text(text = "Data Store ", fontSize = 50.sp, fontWeight = FontWeight.Bold, color = Color(0xFF1B945C))
            }
        }
        Column(Modifier.fillMaxWidth().weight(1.5f),
            verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

            Text(text = "Nombre ", fontSize = 30.sp)

            TextField(value = nombre,onValueChange = { nombre = it},
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFEEEEEE),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {})

            Text(text = "Edad ", fontSize = 30.sp)

            TextField(value = edad,onValueChange = { edad = it},
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFEEEEEE),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {})

            Text(text = "Altura ", fontSize = 30.sp)

            TextField(value = altura,onValueChange = { altura = it},
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFEEEEEE),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {})

            Text(text = "Monedero ", fontSize = 30.sp)

            TextField(value = monedero,onValueChange = { monedero = it},
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xFFEEEEEE),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent),
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {})

            Switch(
                checked = checked,
                onCheckedChange = { newChecked ->
                    checked = newChecked
                    // Solo guardar los datos si el switch está activado (checked == true)
                    if (newChecked) {
                        corroutine.launch {
                            // Guardar los datos solo si el switch está activado
                            savedDataA6.savePersonData(nombre, edad.toInt(), altura.toFloat(), monedero.toFloat())
                        }
                    } else {
                        // Si el switch está apagado, no guardar nada
                        println("El switch está apagado, no se guardan los datos")
                    }
                }
            )




        }
        Column(Modifier.fillMaxWidth().weight(.5f),verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                navegar.navigate("ListProductViewA6")
                //?nombre=$nombre&edad=$edad&altura=$altura&monedero=$monedero
            },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1B945C)),
                modifier = Modifier.width(250.dp)){
                Text(text = "Inicia sesion", fontSize = 25.sp, modifier = Modifier.padding(vertical = 8.dp))}
        }
    }
}