package ezra.mit.navigation

import SplashScreen
import ezra.mit.ui.sale.SaleScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.about.AboutScreen
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.auth.LoginScreen
import ezra.mit.ui.auth.SignupScreen
import ezra.mit.ui.home.HomeScreen
import ezra.mit.ui.rent.RenScreen
import ezra.mit.ui.rent.RentScreen
import ezra.mit.ui.rent.houseeight
import ezra.mit.ui.rent.housefive
import ezra.mit.ui.rent.housefour
import ezra.mit.ui.rent.houseseven
import ezra.mit.ui.rent.housesix
import ezra.mit.ui.rent.housethree
import ezra.mit.ui.rentdetails.RentDetailScreen
import ezra.mit.ui.sale.salefive
import ezra.mit.ui.sale.salefour
import ezra.mit.ui.sale.saleseven
import ezra.mit.ui.sale.salesix
import ezra.mit.ui.sale.salethree
import ezra.mit.ui.sale.saletwo
import ezra.mit.ui.saledetails.SaleDetailScreen
import ezra.mit.ui.start.StartScreen

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(viewModel, navController)
        }
        composable(ROUTE_SALE) {
            SaleScreen(viewModel, navController)
        }
        composable(ROUTE_RENT) {
            RentScreen(viewModel, navController)
        }
        composable(ROUTE_SALEDETAILS) {
            SaleDetailScreen(viewModel, navController)
        }
        composable(ROUTE_RENTDETAILS) {
            RentDetailScreen(viewModel, navController)
        }
        composable(ROUTE_START) {
            StartScreen(viewModel, navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(viewModel, navController)
        }
        composable(ROUTE_Ren) {
           RenScreen(viewModel, navController)
        }
        composable(ROUTE_Ren2) {
            housethree(viewModel, navController)
        }
        composable(ROUTE_Ren4) {
            housefour(viewModel, navController)
        }
        composable(ROUTE_Ren5) {
            housefive(viewModel, navController)
        }
        composable(ROUTE_Ren6) {
            housesix(viewModel, navController)
        }
        composable(ROUTE_Ren7) {
            houseseven(viewModel, navController)
        }
        composable(ROUTE_Ren8) {
            houseeight(viewModel, navController)
        }
        composable(ROUTE_Sell2) {
            saletwo(viewModel, navController)
        }
        composable(ROUTE_Sell3) {
            salethree(viewModel, navController)
        }
        composable(ROUTE_Sell4) {
            salefour(viewModel, navController)
        }
        composable(ROUTE_Sell5) {
            salefive(viewModel, navController)
        }
        composable(ROUTE_Sell6) {
            salesix(viewModel, navController)
        }
        composable(ROUTE_Sell7) {
            saleseven(viewModel, navController)
        }


    }
}