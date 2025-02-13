package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun FilasView(){

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Primero")

            Column(
                modifier = Modifier.fillMaxWidth()
                    .background(Color.Blue),
                verticalArrangement = Arrangement.SpaceAround,
            ){
                Text(text = "Zuri")
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Lozano")
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Gerry")
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text = "Primero")

            Column(
                modifier = Modifier.fillMaxWidth()
                    .background(Color.Red),
                verticalArrangement = Arrangement.SpaceAround,
            ){
                Text(text = "David")
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Luis")
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "Memo")
            }
        }

    }



}

