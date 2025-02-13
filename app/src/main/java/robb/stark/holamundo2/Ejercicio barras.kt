package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable

fun Barras(){

    Column (Modifier.fillMaxSize()
        .background(Color.White)
        .padding(15.dp)
    )
    {
        Column (modifier = Modifier
            .weight(1f)
        ){
            Column (Modifier.fillMaxWidth()
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = Color(0xFF121B3B))
                .weight(1f)
            ){}
            Column (Modifier.fillMaxWidth()
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = Color(0xFF57DE77))
                .weight(1f)
            ){}
            Column (Modifier.fillMaxWidth()
                .padding(10.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(color = Color(0xFF121B3B))
                .weight(1f)
            ){}
        }

        Column (modifier = Modifier
            .weight(1f)
        ){
            Row (Modifier.fillMaxWidth()
                //.padding(10.dp)
                .background(color = Color(0xFFFFFFFF))
            ){
                Column (Modifier.fillMaxHeight()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color =Color(0xFF121B3B))
                    .weight(1f))
                {  }
                Column (Modifier.fillMaxHeight()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color =Color(0xFF4B67F2))
                    .weight(1f))
                {  }
                Column (Modifier.fillMaxHeight()
                    .padding(10.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(color =Color(0xFF121B3B))
                    .weight(1f))
                {  }

            }
        }

    }
}
