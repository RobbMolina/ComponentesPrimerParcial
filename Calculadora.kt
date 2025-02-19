package robb.stark.holamundo2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Calculate
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun Calculadora(){
    var n1 by remember{
        mutableStateOf(value = "")
    }
    var n2 by remember{
        mutableStateOf(value = "")
    }

    var resultado by remember{
        mutableStateOf(value = 0)
    }


    Column(Modifier.fillMaxSize()
        .background(color = Color.White)
    ) {

        Column(Modifier.fillMaxWidth()
            .background(color = Color(0xFF1F4ABB))
            .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly)    {
            Text(text = "Calculadora",fontSize = 50.sp, color = Color.White)
        }

        Column(Modifier.fillMaxWidth()
            .weight(8f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Ingresa el primer numero",fontSize = 30.sp)
            TextField(value = n1,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = { Text(text = "Primer numero")},
                onValueChange = {
                        textinsert ->
                    n1 = textinsert
                })
            Text(text = "Ingresa el segundo numero",fontSize = 30.sp)
            TextField(value = n2,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = { Text(text = "Segundo numero")},
                onValueChange = {
                        textinsert ->
                    n2 = textinsert
                })

            Row(Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly){
                Button(onClick = {resultado = n1.toInt() + n2.toInt()},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF1F4ABB))){
                    Text(text = "Suma")}

                OutlinedButton(onClick =  { resultado = n1.toInt() - n2.toInt()},
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color(0xFF1F4ABB))){
                    Text(text = "Resta")
                }
                IconButton(onClick =  { resultado = n1.toInt() * n2.toInt()}){
                    Icon(imageVector = Icons.Default.Calculate,
                        contentDescription = "icono",
                        tint = Color(0xFF1F4ABB),
                        modifier = Modifier.size(80.dp))
                }
                Image(painter = painterResource(id = R.drawable.divi),
                    contentDescription = "fondo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(35.dp)
                        .clickable { resultado = n1.toInt() / n2.toInt() })

            }


            Text(text = "Resultado: " + resultado, fontSize = 30.sp)



        }

    }


}


