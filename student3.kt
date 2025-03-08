package robb.stark.holamundo2.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExtendedFloatingActionButton
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


@Composable

fun studentid(navegar: NavController){

    var name by remember{
        mutableStateOf(value = "")
    }

    var id by remember{
        mutableStateOf(value = "")
    }

    var mensaje by remember {
        mutableStateOf(value = "")
    }

    Column(Modifier.fillMaxSize().background(Color(0xFFFF5A01)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Column(Modifier.weight(.2f), verticalArrangement = Arrangement.Center){
            Text(text = "Inicia sesion", fontSize = 50.sp, color = Color.White, fontWeight = FontWeight.Bold)
        }
        Column(Modifier.weight(.8f), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value = name,onValueChange = { name = it},
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Nombre del alumno")
                    }
                })

            TextField(value = id,onValueChange = { id = it},
                shape = RoundedCornerShape(12.dp),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "ID del alumno")
                    }
                })

            ExtendedFloatingActionButton(onClick = {
                if (id.toInt() > 0 && id.toInt() < 11){
                    mensaje = "Bienvenido al Laboratorio de ISND estimado Coordinador $name"
                }else if (id.toInt() >= 11 && id.toInt() < 101){
                    mensaje = "Permiso autorizado para el profesor $name"
                }else if (id.toInt() >= 101 && id.toInt() <= 19000){
                    mensaje = "Acceso denegado a egresados que no son de sistemas."
                }else if (id.toInt() >= 19001 && id.toInt() <= 22210 && id.toInt() != 22180){
                    mensaje = "Bievenido $name es un gusto verlo por aquí."
                }else if (id.toInt() == 22180){
                    mensaje = "Alumno en intercambio no es posible esté presente en el I.E.ST."
                }else if (id.toInt() == 22436 || id.toInt() == 19327 || id.toInt() == 22789 ){
                    mensaje = "Alumno $name autorizado para uso del laboratorio."
                }else
                    mensaje = "Este laboratorio es de uso exclusivo para la carrera ISND"

                navegar.navigate("inicio?name=$name&id=$id&mensaje=$mensaje")}) {
                Text(text = "Comenzar")
            }
        }


    }
}