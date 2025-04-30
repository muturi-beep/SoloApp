package com.example.sokoapp.ui.screens.form1

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Form1Screen(navController: NavController){
    Column (
        modifier = Modifier
    ){



    }


}

@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(navController= rememberNavController())
}