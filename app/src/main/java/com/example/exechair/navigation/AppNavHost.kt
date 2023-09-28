package com.example.exechair.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.exechair.ui.theme.screen.Contact.ContactUs
import com.example.exechair.ui.theme.screen.SignUp.RegisterScreen
import com.example.exechair.ui.theme.screen.home.HomeScreen
import com.example.exechair.ui.theme.screen.login.LoginScreen
import com.example.exechair.ui.theme.screen.product.Hair
import com.example.exechair.ui.theme.screen.product.Kinyozi
import com.example.exechair.ui.theme.screen.splashscreen.Splash

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination ){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP){
            RegisterScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_SPLASH){
            Splash(navController)
        }
        composable(ROUTE_HAIR){
            Hair(navController)
        }
        composable(ROUTE_KINYOZI){
            Kinyozi(navController)
        }
        composable(ROUTE_CONTACTUS){
            ContactUs(navController)
        }


    }
}




