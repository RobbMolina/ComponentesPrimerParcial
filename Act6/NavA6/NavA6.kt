package robb.stark.holamundo2.Act6.NavA6

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import robb.stark.holamundo2.Act6.views.ListProductViewA6

@Preview(showBackground = true)
@Composable
fun NavigationA6(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route= "inicio"){
            InicioA6(navController)
        }

        composable(route = "ListProductViewA6?nombre={nombre}&edad={edad}&altura={altura}&monedero={monedero}",
            arguments = listOf(
                navArgument("nombre"){
                    type = NavType.StringType
                    defaultValue = ""
                },
                navArgument("edad"){
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument("altura"){
                    type = NavType.FloatType
                    defaultValue = 0.00f
                },
                navArgument("monedero"){
                    type = NavType.FloatType
                    defaultValue = 0.00f
                })
        ){
                parametros ->
            val nombre = parametros.arguments?.getString("nombre") ?: ""
            val edad = parametros.arguments?.getInt("edad") ?: 0
            val altura = parametros.arguments?.getFloat("altura") ?: 0.00f
            val monedero = parametros.arguments?.getFloat("monedero") ?: 0.00f
            ListProductViewA6(navController,//nombre,edad,altura,monedero
            )
        }
    }
}