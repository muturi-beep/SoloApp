package com.example.sokoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.data.UserDatabase
import com.example.sokoapp.repository.UserRepository
import com.example.sokoapp.ui.screens.about.AboutScreen
import com.example.sokoapp.ui.screens.assign.AssignScreen
import com.example.sokoapp.ui.screens.auth.LoginScreen
import com.example.sokoapp.ui.screens.auth.RegisterScreen
import com.example.sokoapp.ui.screens.dashboard.DashboardScreen
import com.example.sokoapp.ui.screens.form.FormScreen
import com.example.sokoapp.ui.screens.home.HomeScreen
import com.example.sokoapp.ui.screens.intent.IntentScreen
import com.example.sokoapp.ui.screens.item.ItemScreen
import com.example.sokoapp.ui.screens.more.MoreScreen
import com.example.sokoapp.ui.screens.service.ServiceScreen
import com.example.sokoapp.ui.screens.splash.SplashScreen
import com.example.sokoapp.ui.screens.start.StartScreen
import com.example.sokoapp.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
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
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_ASSIGN) {
            AssignScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        composable(ROUT_LOGIN) {
            FormScreen(navController)
        }
        composable(ROUT_REGISTER) {
            FormScreen(navController)
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