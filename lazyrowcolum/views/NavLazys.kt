package robb.stark.holamundo2.lazyrowcolum.views

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
fun NavigationLazys(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "inicio") {
        composable(route= "inicio"){
            ListCategorias(navController)
        }

        composable(
            route = "ListProductos/{idCat}",
            arguments = listOf(navArgument("idCat") { type = NavType.IntType })
        ) { backStackEntry ->
            val idCat = backStackEntry.arguments?.getInt("idCat") ?: 0
            ListProductos(navController, idCat)
        }

    }
}