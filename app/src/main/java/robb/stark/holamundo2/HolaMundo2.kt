package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class MiObjeto(
    val esGrande: Boolean,
    val saludo:String,
    val colorText : Color,
    val fontSize: TextUnit,
    val limite: Int
)

@Preview(showBackground = true)
@Composable

fun HolamundoView(){

    //val es constante y var es para variable

    /*
    val saludo:String = "No me digas que vienes a apelar mi lado humano, mm no de hecho planeo amenazarte, necesitas tu armadura para eso, si esta muy maltratada y tu tienes la, linternita del destino"
    val redcolorText: Color = Color.Red
    val fontSizeText: TextUnit = 30.sp
    val maxLinesText: Int = 3
    */

    val MiObjeto: MiObjeto = MiObjeto(
        false,"Adios mundo",Color.Red,32.sp,2
    )
    Text(text = MiObjeto.saludo,
        color = MiObjeto.colorText,
        fontSize = MiObjeto.fontSize,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,
        //maxLines = maxLinesText,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Justify,
        //nueva sesion
        modifier = Modifier
            .border(width = 3.dp, color = Color.White)
            .background(color = Color(0xFF7C7C7C))
            .padding(26.dp)
            .background(color = Color.Black)
            .padding(horizontal = 20.dp)
            .background(color = Color.White)
            .padding(horizontal = 30.dp)
            .fillMaxSize()


        )

}
