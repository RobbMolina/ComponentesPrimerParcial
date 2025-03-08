package robb.stark.holamundo2.navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import robb.stark.holamundo2.R


@Composable

fun bienvenidot3(navegar: NavController){

    Column(Modifier.fillMaxSize().background(Color(0xFFFF5A01)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Column(Modifier.weight(.3f), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "IEST DESK", fontSize = 60.sp, color = Color.White, fontWeight = FontWeight.Bold, )
            Text(text = "MOVIL", fontSize = 60.sp, color = Color.White, fontWeight = FontWeight.Bold, )
        }
        Image(
            painter = painterResource(id = R.drawable.iestlogo),
            contentDescription = "Imagen de perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
        )
        Column(Modifier.weight(.7f), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {


            ExtendedFloatingActionButton(onClick = {navegar.navigate("login")}) {
                Text(text = "Iniciar sesion")
            }
        }


    }
}