package com.mustafa.gonutsapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.mustafa.gonutsapp.screens.ItemDetailsScreen
import com.mustafa.gonutsapp.screens.LetsDonutsScreen
import com.mustafa.gonutsapp.ui.theme.GoNutsAppTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun GoNutsApp() {
    GoNutsAppTheme {
        Scaffold (contentWindowInsets = WindowInsets.systemBars){
            //SplashScreen()
            //LetsDonutsScreen()
            ItemDetailsScreen()
        }
    }
}