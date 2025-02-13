package robb.stark.holamundo2.compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun TarjetaView(tipodebanco: String = "Banamex", colortext: Color = Color.White,background: Color = Color(0xFF02156C)){


        Card(
            colors = CardDefaults.cardColors(
                contentColor = colortext,
                containerColor = background
            )
        ){
            Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                Row() {
                    Text(text = tipodebanco)

                }
            }
        }
}
