package com.example.catalift

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.catalift.ui.screens.login.LoginScreen
import com.example.catalift.ui.screens.personal_details.PersonalDetailScreen
import com.example.catalift.ui.theme.CataliftTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CataliftTheme {
                val navController: NavHostController = rememberNavController()

                NavHost(navController = navController, startDestination = "login") {
                    composable("login") {
                        LoginScreen(
                            onSignInClick = {
                                navController.navigate("personal_details")
                            }
                        )
                    }
                    composable("personal_details") {
                        PersonalDetailScreen()
                    }
                }
            }
        }
    }
}
