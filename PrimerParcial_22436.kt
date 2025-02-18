package robb.stark.primerparcial_22436

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview(showBackground = true)
@Composable

fun Tenis() {

    var cont1 by remember{
        mutableStateOf(value = 0)
    }


    var player1score by remember{
        mutableStateOf(value = 0)
    }

    var player2score by remember{
        mutableStateOf(value = 0)
    }



    Column(
        modifier = Modifier.background(color = Color.White).fillMaxSize().padding(20.dp)
    ) {
        Column(modifier = Modifier.background(Color.Gray).size(400.dp)) {
            Column(modifier = Modifier.background(Color.Green).weight(1f).fillMaxWidth()) {
                Row() {
                    Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {}
                    Column(modifier = Modifier.background(Color.Blue).weight(2.5f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {
                        Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxWidth().border(BorderStroke(2.dp, Color.White))) {}
                        Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxWidth().border(BorderStroke(2.dp, Color.White))) {}
                    }
                    Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {}
                }
            }
            HorizontalDivider(modifier = Modifier.fillMaxWidth().size(5.dp), color = Color.Gray)
            Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxWidth()) {
                Row() {
                    Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {}
                    Column(modifier = Modifier.background(Color.Blue).weight(2.5f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {
                        Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxWidth().border(BorderStroke(2.dp, Color.White))) {}
                        Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxWidth().border(BorderStroke(2.dp, Color.White))) {}
                    }
                    Column(modifier = Modifier.background(Color.Blue).weight(1f).fillMaxHeight().border(BorderStroke(2.dp, Color.White))) {}
                }
            }
            }
        Row(Modifier.fillMaxWidth(),
            horizontalArrangement =Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically){
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Image(painter = painterResource(id = R.drawable.player_one),
                contentDescription = "fondo",
                modifier = Modifier
                    .size(90.dp)
            )
                Text(text = "Jannik")
                Row(
                    horizontalArrangement =Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.resta),
                        contentDescription = "fondo",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {
                                if (player1score == 0) {
                                    player1score = 0
                                }else if(player1score == 15){
                                    player1score = player1score-15
                                }else if(player1score == 30){
                                    player1score = player1score-15
                                }else if(player1score == 40){
                                    player1score = player1score-10
                                }
                            }


                    )
                    Text(text = "$player1score")
                    Image(painter = painterResource(id = R.drawable.suma),
                        contentDescription = "fondo",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {

                                cont1 = cont1+1

                                if (cont1 == 1) {
                                    player1score = player1score+15
                                }else if(player1score == 15){
                                    player1score = player1score+15
                                }else if(player1score == 30){
                                    player1score = player1score+10
                                }else if(player1score == 40){

                                }
                            }
                    )
                }
            }

            Text(text = "VS", fontWeight = FontWeight.Bold)

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(painter = painterResource(id = R.drawable.player_two),
                    contentDescription = "fondo",
                    modifier = Modifier
                        .size(90.dp)
                )
                Text(text = "Minion")
                Row(
                    horizontalArrangement =Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.resta),
                        contentDescription = "fondo",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {
                                if (player2score == 0) {
                                    player2score = 0
                                }else if(player2score == 15){
                                    player2score = player2score-15
                                }else if(player2score == 30){
                                    player2score = player2score-15
                                }else if(player2score == 40){
                                    player2score = player2score-10
                                }
                            }
                    )
                    Text(text = "$player2score")
                    Image(painter = painterResource(id = R.drawable.suma),
                        contentDescription = "fondo",
                        modifier = Modifier
                            .size(40.dp)
                            .clickable {
                                if (player2score == 0) {
                                    player2score = player1score+15
                                }else if(player2score == 15){
                                    player2score = player2score+15
                                }else if(player2score == 30){
                                    player2score = player2score+10
                                }else if(player2score == 40){

                                }
                            }
                    )
                }
            }
        }
    }
}
