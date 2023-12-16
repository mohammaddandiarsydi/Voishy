package com.capstonebangkit.voishy.navigation

sealed class Screen(val route: String){
    object Home: Screen("home")
    object Voice: Screen("voice")
    object Materials: Screen("materials")
}