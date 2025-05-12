package com.olivia.staywise.navigation


import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olivia.staywise.ui.theme.screen.home.HomeScreen




import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.olivia.guardmart.ui.theme.screen.auth.LoginScreen

import com.olivia.staywise.repository.UserRepository
import com.olivia.staywise.data.UserDatabase
import com.olivia.staywise.screens.splash.SplashScreen
import com.olivia.staywise.ui.theme.screen.auth.RegisterScreen
import com.olivia.staywise.ui.theme.screen.booked.BookingScreen
import com.olivia.staywise.ui.theme.screen.dashboard.DashboardScreen
import com.olivia.staywise.ui.theme.screen.profile.ProfileScreen
import com.olivia.staywise.ui.theme.screen.roomdetails.RoomdetailsScreen
import com.olivia.staywise.ui.theme.screen.search.SearchScreen
import com.olivia.staywise.viewmodel.AuthViewModel



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH,


    ) {
    val context = LocalContext.current


    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)

        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)

        }

        composable(ROUT_SEARCH) {
            SearchScreen(navController)

        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
        composable(ROUT_BOOKING) {
            BookingScreen(navController)

        }
        composable(ROUT_ROOMDETAILS) {
            RoomdetailsScreen(navController)

        }
        composable(ROUT_PROFILE) {
            ProfileScreen(navController)

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



    }
}