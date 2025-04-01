package robb.stark.holamundo2.Parcial2

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import robb.stark.holamundo2.Act6.views.ListProductViewA6
import robb.stark.holamundo2.Parcial2.views.VuelosList
import robb.stark.holamundo2.Parcial2.views.VuelosView

@Preview(showBackground = true)
@Composable
fun NavigationA6(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route= "inicio"){
            VuelosList()
        }

        composable(route= "aerolineas"){
            VuelosView()
        }

    }
}