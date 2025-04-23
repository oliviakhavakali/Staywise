package com.olivia.guardmart.ui.theme.navigation




import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.olivia.guardmart.data.UserDatabase
import com.olivia.guardmart.model.product.AddProductScreen
import com.olivia.guardmart.model.product.EditProductScreen
import com.olivia.guardmart.model.product.ProductListScreen
import com.olivia.guardmart.repository.UserRepository
import com.olivia.guardmart.ui.theme.screen.about.AboutScreen
import com.olivia.guardmart.ui.theme.screen.auth.LoginScreen
import com.olivia.guardmart.ui.theme.screen.auth.RegisterScreen

import com.olivia.guardmart.ui.theme.screen.contact.ContactScreen
import com.olivia.guardmart.ui.theme.screen.dashboard.DashboardScreen
import com.olivia.guardmart.ui.theme.screen.form.FormScreen
import com.olivia.guardmart.ui.theme.screen.home.HomeScreen
import com.olivia.guardmart.ui.theme.screen.intent.IntentScreen
import com.olivia.guardmart.ui.theme.screen.item.ItemScreen
import com.olivia.guardmart.ui.theme.screen.service.ServiceScreen
import com.olivia.guardmart.ui.theme.screen.splash.SplashScreen
import com.olivia.guardmart.ui.theme.screen.start.StartScreen
import com.olivia.guardmart.viewmodel.AuthViewModel
import com.olivia.guardmart.viewmodel.ProductViewModel


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_ADD_PRODUCT,
    productViewModel:ProductViewModel = viewModel(),

) {  val context = LocalContext.current


    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {

            StartScreen(navController)
        }
        composable(ROUT_INTENT) {

            IntentScreen(navController)
        }

        composable(ROUT_DASHBOARD) {

            DashboardScreen(navController)
        }
        composable(ROUT_CONTACT) {

            ContactScreen(navController)
        }
        composable(ROUT_SERVICE) {

            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {

           SplashScreen(navController)
        }

        composable(ROUT_FORM) {

            FormScreen(navController,)
        }


        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
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


