package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)

@Composable

fun Mayorque(){
    var n1 by remember{
        mutableStateOf(value = "")
    }
    var n2 by remember{
        mutableStateOf(value = "")
    }
    var n3 by remember{
        mutableStateOf(value = "")
    }

    var mayor by remember{
        mutableStateOf(value = 0)
    }

    var menor by remember{
        mutableStateOf(value = 0)
    }

    Column(Modifier.fillMaxSize()
        .background(color = Color.White)
    ) {

        Column(Modifier.fillMaxWidth()
            .background(color = Color(0xFFC70404))
            .weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly)    {
            Text(text = "Mayor que",fontSize = 50.sp, color = Color.White)
        }

        Column(Modifier.fillMaxWidth()
            .weight(8f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Ingresa el primer numero",fontSize = 25.sp)
            TextField(value = n1,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = { Text(text = "Primer numero")},
                onValueChange = {
                        textinsert ->
                    n1 = textinsert
                })
            Text(text = "Ingresa el segundo numero",fontSize = 25.sp)
            TextField(value = n2,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = { Text(text = "Segundo numero")},
                onValueChange = {
                        textinsert ->
                    n2 = textinsert
                })
            Text(text = "Ingresa el tercer numero",fontSize = 25.sp)
            TextField(value = n3,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = { Text(text = "Tercer numero")},
                onValueChange = {
                        textinsert ->
                    n3 = textinsert
                })

            Row(Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly){
                Button(onClick = {
                    if (n1 > n2 && n1 > n3) {
                        mayor = n1.toInt()
                        menor = if (n2 < n3) n2.toInt() else n3.toInt()
                    } else if (n2 > n1 && n2 > n3) {
                        mayor = n2.toInt()
                        menor = if (n1 < n3) n1.toInt() else n3.toInt()
                    } else {
                        mayor = n3.toInt()
                        menor = if (n1 < n2) n1.toInt() else n2.toInt()
                    }
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFC70404))){
                    Text(text = "Calcular numero mayor")}
            }


            Text(text = "Numero mayor: " + mayor, fontSize = 30.sp)
            Text(text = "Numero menor: " + menor, fontSize = 30.sp)



        }

    }


}

