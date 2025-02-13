package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun ColumnasView(){
    //el column funciona para que no se empalmen los renglones
    Column (

        modifier = Modifier
            .padding(20.dp)
            .background(Color.LightGray)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally


    ){
        Text(text = "Beto",
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .background(Color.Blue)
                .fillMaxWidth()
                .padding(10.dp)
            )
        Text(text = "Zuri",
            color = Color.Yellow,
            modifier = Modifier
                .padding(10.dp)
                .background(Color.Black)
                .padding(10.dp)

            )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(color = Color(0xFF560383))
                .fillMaxSize()
        ){
            Text(
                text = "Juan Pablo",
                color = Color.White,
                textAlign = TextAlign.Center
            )

        }

        }
}

@Preview(showBackground = true)
@Composable
fun ColumnasSeparadas(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "1")
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "2")
        Spacer(modifier = Modifier.height(20.dp))
        HorizontalDivider()
        Text(text = "3")
    }
}
