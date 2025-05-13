package com.olivia.staywise.navigation


import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olivia.staywise.ui.theme.screen.home.HomeScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.olivia.guardmart.ui.theme.screen.auth.LoginScreen
import com.olivia.staywise.data.BookedDatabase
import com.olivia.staywise.repository.UserRepository
import com.olivia.staywise.data.UserDatabase
import com.olivia.staywise.repository.BookedRepository
import com.olivia.staywise.screens.splash.SplashScreen
import com.olivia.staywise.ui.screens.products.AddProductScreen
import com.olivia.staywise.ui.screens.products.EditProductScreen
import com.olivia.staywise.ui.screens.products.ProductListScreen
import com.olivia.staywise.ui.theme.screen.auth.RegisterScreen
import com.olivia.staywise.ui.theme.screen.booked.BookingScreen
import com.olivia.staywise.ui.theme.screen.dashboard.DashboardScreen
import com.olivia.staywise.ui.theme.screen.profile.ProfileScreen
import com.olivia.staywise.ui.theme.screen.roomdetails.RoomdetailsScreen
import com.olivia.staywise.ui.theme.screen.search.SearchScreen
import com.olivia.staywise.viewmodel.AuthViewModel
import com.olivia.staywise.viewmodel.BookedViewModel
import com.olivia.staywise.viewmodel.ProductViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH,
    productViewModel: ProductViewModel = viewModel(),
) {
    val context = LocalContext.current

    // Initialize AuthViewModel
    val appDatabase = UserDatabase.getDatabase(context)
    val authRepository = UserRepository(appDatabase.userDao())
    val authViewModel: AuthViewModel = AuthViewModel(authRepository)






    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) { HomeScreen(navController) }
        composable(ROUT_DASHBOARD) { DashboardScreen(navController) }
        composable(ROUT_SEARCH) { SearchScreen(navController) }
        composable(ROUT_SPLASH) { SplashScreen(navController) }
        composable(ROUT_BOOKING) { BookingScreen(navController) }
        composable(ROUT_ROOMDETAILS) { RoomdetailsScreen(navController) }
        composable(ROUT_PROFILE) { ProfileScreen(navController) }

        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }

        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }



    }
}