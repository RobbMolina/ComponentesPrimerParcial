package robb.stark.holamundo2.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Preview(showBackground = true)
@Composable
fun NavigationEj5(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route= "inicio"){
            Birth(navController)
        }

        composable(route = "age?year={year}&img={img}&mensaje={mensaje}",
            arguments = listOf(
                navArgument("year"){
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument("img"){
                    type = NavType.IntType
                    defaultValue = 0
                },
                navArgument("mensaje"){
                    type = NavType.StringType
                    defaultValue = "-"
                })
        ){
                parametros ->
            val year = parametros.arguments?.getInt("year") ?: 0
            val mensaje = parametros.arguments?.getString("mensaje") ?: ""
            val img = parametros.arguments?.getInt("img") ?: 0
            Age(navController,img,mensaje,year)
        }
    }
}