package robb.stark.holamundo2.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import robb.stark.holamundo2.R

@Composable

fun Birth(navegar: NavController){

    var year by remember{
        mutableStateOf(value = 0)
    }

    var edad by remember{
        mutableStateOf(value = "")
    }

    var img by remember {
        mutableStateOf(value = R.drawable.kid)
    }

    var mensaje by remember {
        mutableStateOf(value = "")
    }

    Column(Modifier.fillMaxSize().background(Color(0xFFFFFFFF)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Column(Modifier.weight(.2f).background(Color(0xFF009688)).fillMaxWidth(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "LegallyWhere", fontSize = 50.sp, fontWeight = FontWeight.Bold, color = Color.White)
        }
        Column(Modifier.weight(.8f), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Ingresa tu año de nacimiento", fontSize = 40.sp)
            TextField(value = edad,onValueChange = { edad = it},
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {Text(text = "Año de nacimiento") })



            FloatingActionButton(onClick = {
                year = (2025 - edad.toInt())
                when (year) {
                    in 0..14 -> {
                        mensaje = "Menor de edad"
                        img = R.drawable.kid  // Asignar recurso de imagen
                    }
                    15 -> {
                        mensaje = "Mayor de edad en Indonesia pero no en México"
                        img = R.drawable.adulto
                    }
                    16 -> {
                        mensaje = "Mayor de edad en Cuba pero no en México"
                        img = R.drawable.adulto
                    }
                    17 -> {
                        mensaje = "Mayor de edad en Corea del Norte pero no en México"
                        img = R.drawable.adulto
                    }
                    18 -> {
                        mensaje = "Mayor de edad en México y gran parte de Latinoamérica"
                        img = R.drawable.adulto
                    }
                    19 -> {
                        mensaje = "Mayor de edad en Corea del Sur"
                        img = R.drawable.adulto
                    }
                    20 -> {
                        mensaje = "Mayor de edad en Japón"
                        img = R.drawable.adulto
                    }
                    in 21..59 -> {
                        mensaje = "Mayor de edad en USA y posiblemente en todo el mundo"
                        img = R.drawable.adulto
                    }
                    in 60..64 -> {
                        mensaje = "Es de la tercera edad"
                        img = R.drawable.terceraedad
                    }
                    in 65..70 -> {
                        mensaje = "Ya te puedes jubilar"
                        img = R.drawable.terceraedad
                    }
                }


                navegar.navigate("age?year=$year&img=$img&mensaje=$mensaje")}) {
                Text(text = "Comenzar")
            }
        }


    }
}