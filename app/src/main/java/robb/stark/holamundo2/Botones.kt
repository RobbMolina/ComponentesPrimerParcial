package robb.stark.holamundo2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight

@Preview
@Composable

fun Botones(){

    var trol by remember {
        mutableStateOf( "Chicas a 10km!!")
    }
    var cambio by remember {
        mutableStateOf(false)
    }

    var trolcolor by remember {
        mutableStateOf(Color.Blue)
    }



    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.White)
    ){
        
    Column (Modifier.fillMaxHeight(),verticalArrangement = Arrangement.SpaceEvenly,
    ){
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        { Text(
            text = trol,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier= Modifier
                .background(trolcolor)
                .padding(10.dp)
        )
            Icon(imageVector = Icons.Default.AccessibilityNew,
                contentDescription = "icono",
                tint = Color.Red
            ) }

        Spacer(modifier = Modifier.height(80.dp))
        Button(onClick =  {
            if(!cambio){
                trol = "Haz sido hackeado!!"
                trolcolor   = Color.Red
            }
            else{
                trol = "Bromi"
            }
            cambio = !cambio

        } , modifier = Modifier.fillMaxWidth().padding(horizontal=16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            )
        )
        {
            Text(text = "Da click aqui para noviar")
        }
    }


    Text(text = "footer", color = Color.White,
        modifier = Modifier.align(Alignment.BottomCenter)
            .background(Color.Black)
            .fillMaxWidth()
    )

    Image(painter = painterResource(id = R.drawable.minion),
        contentDescription = "fondo",
        modifier = Modifier.align(Alignment.TopEnd)
            .size(80.dp)
    )


    }
}
