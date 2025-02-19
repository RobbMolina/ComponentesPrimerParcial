import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import robb.stark.holamundo2.R
import kotlin.random.Random

@Preview(showBackground = true)
@Composable

fun Tabla() {
    val I1 = 2000
    val I2 = 2500
    val I3 = 3000
    val I4 = 4000
    val I5 = 4500
    val I6 = 4000
    val I7 = 1800
    val I8 = 9000
    val I9 = 800
    val I10 = 100
    val I11 = 1200
    val I12 = 2500

    val E1 = 500
    val E2 = 100
    val E3 = 3500
    val E4 = 4500
    val E5 = 1200
    val E6 = 300
    val E7 = 5000
    val E8 = 450
    val E9 = 500
    val E10 = 600
    val E11 = 600
    val E12 = 7000

    var resta1 by remember { mutableStateOf("") }
    var resta2 by remember { mutableStateOf("") }
    var resta3 by remember { mutableStateOf("") }
    var resta4 by remember { mutableStateOf("") }
    var resta5 by remember { mutableStateOf("") }
    var resta6 by remember { mutableStateOf("") }
    var resta7 by remember { mutableStateOf("") }
    var resta8 by remember { mutableStateOf("") }
    var resta9 by remember { mutableStateOf("") }
    var resta10 by remember { mutableStateOf("") }
    var resta11 by remember { mutableStateOf("") }
    var resta12 by remember { mutableStateOf("") }

    var cambio by remember {
        mutableStateOf(false)
    }

    var resaltarIngresos by remember { mutableStateOf(false) }


    Column(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
            Image(
                painter = painterResource(id = if (cambio) R.drawable.mexico else R.drawable.alemania),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp),
                alpha = 0.8f
            )
            Row(modifier = Modifier.fillMaxWidth().padding(20.dp), horizontalArrangement = Arrangement.Center) {
                Text(text = "Contabilidad alfonso estudiante", fontSize = 25.sp)
            }
        }
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Text(text = "", color = Color.Blue, fontSize = 20.sp, modifier = Modifier.width(110.dp))
                Text(
                    text = "Ingresos", color = Color.White,fontSize = 20.sp,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
                Text(
                    text = "Egresos", color = Color.White,fontSize = 20.sp,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
                Text(
                    text = "Neto", color = Color.White,fontSize = 20.sp,
                    modifier = Modifier.width(100.dp).background(color = Color(0xFF17911F))
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1.2f)) {
                Text(text = "Enero", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Febrero", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Marzo", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Abril", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Mayo", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Junio", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Julio", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Agosto", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Septiembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Octubre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Noviembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
                Text(text = "Diciembre", modifier = Modifier.background(color = Color(0xFF17911F)).fillMaxWidth(),fontSize = 20.sp, color = Color.White)
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "$I1", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp,fontWeight = if (resaltarIngresos) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I2", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I3", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I4", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp,fontWeight = if (resaltarIngresos) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I5", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I6", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I7", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp,fontWeight = if (resaltarIngresos) FontWeight.Bold else FontWeight.Normal)
                Text(text = "$I8", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I9", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I10", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I11", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$I12", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp,color = if (resaltarIngresos) Color.Blue else Color.Black,fontWeight = if (resaltarIngresos) FontWeight.Bold else FontWeight.Normal)
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "$E1", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E2", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E3", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E4", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E5", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E6", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E7", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E8", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E9", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E10", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E11", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
                Text(text = "$E12", modifier = Modifier.fillMaxWidth(),fontSize = 20.sp)
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = resta1,fontSize = 20.sp,
                    color = if (resta1.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta2,fontSize = 20.sp,
                    color = if (resta2.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta3,fontSize = 20.sp,
                    color = if (resta3.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta4,fontSize = 20.sp,
                    color = if (resta4.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta5,fontSize = 20.sp,
                    color = if (resta5.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta6,fontSize = 20.sp,
                    color = if (resta6.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta7,fontSize = 20.sp,
                    color = if (resta7.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta8,fontSize = 20.sp,
                    color = if (resta8.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta9,fontSize = 20.sp,
                    color = if (resta9.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta10,fontSize = 20.sp,
                    color = if (resta10.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta11,fontSize = 20.sp,
                    color = if (resta11.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )
                Text(
                    text = resta12,fontSize = 20.sp,
                    color = if (resta12.toIntOrNull() ?: 0 < 0) Color.Red else Color.Black
                )

            }
        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = {
                    resta1 = (I1 - E1).toString()
                    resta2 = (I2 - E2).toString()
                    resta3 = (I3 - E3).toString()
                    resta4 = (I4 - E4).toString()
                    resta5 = (I5 - E5).toString()
                    resta6 = (I6 - E6).toString()
                    resta7 = (I7 - E7).toString()
                    resta8 = (I8 - E8).toString()
                    resta9 = (I9 - E9).toString()
                    resta10 = (I10 - E10).toString()
                    resta11 = (I11 - E11).toString()
                    resta12 = (I12 - E12).toString()
                    cambio = !cambio
                    resaltarIngresos = !resaltarIngresos},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF17911F))) {
                    Text(text = "Calcular utilidad")
                }

                Text(text = "Servicio ofrecido por ", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
                Text(text = "Roberto Molina ISND", fontSize = 25.sp, textDecoration = TextDecoration.Underline)

            }
        }
    }
}