package robb.stark.holamundo2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import robb.stark.holamundo2.compartido.TarjetaView
import robb.stark.holamundo2.compartido.TerminalView

@Preview(showBackground = true)
@Composable
fun ListadoView(){
    Column(modifier = Modifier.fillMaxSize()) {
        TerminalView()
        TarjetaView()
        TarjetaView(colortext = Color.White, background = Color.Red, tipodebanco = "Santander!")
    }
    

}
