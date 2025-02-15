package robb.stark.holamundo2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun Posiciones() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Column(
            Modifier.fillMaxWidth()
                .weight(.5f)
                .background(color = Color(0xffffffff))
        ) {
            Row {
                Column(Modifier.fillMaxHeight()
                        .weight(1f)
                ) {
                    Box(Modifier.fillMaxWidth()
                        .weight(.1f)
                        .background(color = Color.Red)
                    ) {
                        Text(text = "Top start", color = Color.White,
                            modifier = Modifier.align(Alignment.TopStart)
                        )
                    }
                    Column(Modifier.fillMaxWidth()
                        .weight(1f)
                    ) {}
                }
                Box(Modifier.fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFF002CFF))
                ) {
                    Text(text = "Top", color = Color.White,
                        modifier = Modifier.align(Alignment.TopCenter)
                    )
                }
                Column(Modifier.fillMaxHeight()
                    .weight(1f)
                ) {
                    Box(Modifier.fillMaxWidth()
                        .weight(.3f)
                        .background(color = Color(0xFFE600F6))
                    ) {
                        Text(text = "Top end", color = Color.White,
                            modifier = Modifier.align(Alignment.TopEnd)
                        )
                    }
                    Column(Modifier.fillMaxWidth()
                        .weight(1f)
                    ) {}
                }
            }
        }
            Column(
                Modifier.fillMaxWidth()
                    .weight(1f)) {
                Row(){
                    Column(Modifier.fillMaxHeight()
                        .weight(1.5f)){
                        Box(Modifier.fillMaxWidth()
                            .weight(.7f)
                            .background(color = Color(0xFF59FF00))){
                            Text(text = "Center start", color = Color.Black,
                                modifier = Modifier.align(Alignment.CenterStart)
                            )
                        }
                        Column(Modifier.fillMaxWidth()
                            .weight(1f)){}
                    }
                    Box(Modifier.fillMaxHeight()
                        .weight(.8f)
                        .background(color = Color(0xFF797979))){
                        Text(text = "Center", color = Color.Black,
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                    Column(Modifier.fillMaxHeight()
                        .weight(1.5f)){
                        Box(Modifier.fillMaxWidth()
                            .weight(.1f)
                            .background(color = Color(0xFF000000))){
                            Text(text = "Center end", color = Color.White,
                                modifier = Modifier.align(Alignment.CenterEnd)
                            )
                        }
                        Column(Modifier.fillMaxWidth()
                            .weight(1.5f)){}
                    }
                }
            }
            Column(
                Modifier.fillMaxWidth()
                    .weight(.5f)) {
                Row {
                    Box(Modifier.fillMaxHeight()
                        .weight(.6f)
                        .background(color = Color(0xFF00FFF3))){
                        Text(text = "Bottom start", color = Color.Black,
                            modifier = Modifier.align(Alignment.BottomStart)
                        )
                    }
                    Box(Modifier.fillMaxHeight()
                        .weight(1f)
                        .background(color = Color(0xFF343434))){
                        Text(text = "Bottom center", color = Color.White,
                            modifier = Modifier.align(Alignment.BottomCenter)
                        )
                    }
                    Box(Modifier.fillMaxHeight()
                        .weight(.6f)
                        .background(color = Color(0xFFFFFB00))){
                        Text(text = "Bottom end", color = Color.Black,
                            modifier = Modifier.align(Alignment.BottomEnd)
                        )
                    }

                }
            }
        }
    }
