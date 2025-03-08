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
fun NavigationT3(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "bienvenido") {
        composable(route= "bienvenido"){
            bienvenidot3(navController)
        }

        composable(route= "login"){
            studentid(navController)
        }

        composable(route = "inicio?name={name}&id={id}&mensaje={mensaje}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue = "-"
                },
                navArgument("mensaje"){
                    type = NavType.StringType
                    defaultValue = "-"
                },
                navArgument("id"){
                    type = NavType.StringType
                    defaultValue = "-"
                })
        ){
                parametros ->
            val name = parametros.arguments?.getString("name") ?: ""
            val mensaje = parametros.arguments?.getString("mensaje") ?: ""
            val id = parametros.arguments?.getString("id") ?: ""
            inicio3(navController,name,id,mensaje)
        }
    }
}