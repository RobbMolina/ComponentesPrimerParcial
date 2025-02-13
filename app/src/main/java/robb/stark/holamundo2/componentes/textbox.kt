package robb.stark.holamundo2.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun TextBoxView(){

    var firstNumber by remember{
        mutableStateOf(value = "")
    }
    var secondNumber by remember{
        mutableStateOf(value = "")
    }
    var suma by remember{
        mutableStateOf(value = 0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Text(text = "Primer numero")
        TextField(value = firstNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            placeholder = { Text(text = "Escribe el primero")},
            onValueChange = {
            textinsert ->
            firstNumber = textinsert
        })
        Text(text = "Segundo numero")
        TextField(value = secondNumber,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            placeholder = { Text(text = "Escribe el segundo")},
            onValueChange = {
                textinsert2 ->
                secondNumber = textinsert2
            })

        Button(onClick = {
            suma = firstNumber.toInt() + secondNumber.toInt()

        }
        ) {
            Text(text = "Suma")
        }
        Text(text = "resultado es igual a " + suma)
    }
}