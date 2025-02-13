package robb.stark.holamundo2

import android.graphics.Paint.Align
import android.text.Html.ImageGetter
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessibilityNew
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Numero(val valor: Int) {
    val esPar: Boolean
        get() = valor % 2 == 0
}

@Preview
@Composable

fun Puzzle(){

    Box(
        modifier = Modifier
            .background(Color.Black)
            .size(210.dp)
    ){
        Column()
        {
        Row(modifier = Modifier
                .weight(1f)) {
                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .background(if (Numero(1).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
                ){
                    val numero = Numero(1)
                    val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                    Text(
                        text = "${numero.valor}",
                        fontSize = 40.sp,
                        color = color,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .background(if (Numero(2).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
                ){
                    val numero = Numero(2)
                    val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                    Text(
                        text = "${numero.valor}",
                        fontSize = 40.sp,
                        color = color,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .background(if (Numero(3).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
                ){
                    val numero = Numero(3)
                    val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                    Text(
                        text = "${numero.valor}",
                        fontSize = 40.sp,
                        color = color,
                        modifier = Modifier.align(Alignment.Center))
                }
                Box(
                    modifier = Modifier
                        .padding(3.dp)
                        .background(if (Numero(4).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
                ){
                    val numero = Numero(4)
                    val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                    Text(
                        text = "${numero.valor}",
                        fontSize = 40.sp,
                        color = color,
                        modifier = Modifier.align(Alignment.Center))
                }
                }
        Row(modifier = Modifier
            .weight(1f)) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(6).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(6)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(9).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(9)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(11).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(11)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(5).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(5)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
        }
        Row(modifier = Modifier
            .weight(1f)) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(7).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(7)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(8).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(8)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(10).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(10)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(15).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(15)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
        }
        Row(modifier = Modifier
            .weight(1f)) {
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(13).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(13)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(14).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(14)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .weight(1f)
            ){
            }
            Box(
                modifier = Modifier
                    .padding(3.dp)
                    .background(if (Numero(12).esPar) Color(0xFFFFBB10) else Color(0xFF8C1414))                        .weight(1f)
            ){
                val numero = Numero(12)
                val color = if (numero.esPar) Color(0xFF8C1414) else Color(0xFFFFBB10)
                Text(
                    text = "${numero.valor}",
                    fontSize = 40.sp,
                    color = color,
                    modifier = Modifier.align(Alignment.Center))
            }
        }
        }
    }
}