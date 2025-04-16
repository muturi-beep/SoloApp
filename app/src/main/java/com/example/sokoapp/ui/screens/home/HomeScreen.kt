package com.example.sokoapp.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.R

@Composable
fun HomeScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()) {
        Text(
            text = "SokoAPP",
            fontSize = 20.sp,
            color = Color.DarkGray,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center
        )

        Image(
            painter = painterResource(R.drawable.shoe1),
            contentDescription = "Home"

        )



        Text(
            text = "An Ecommerce App",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,


            )
        Text(
            text = "What do you think of a site that allows you to buy and sell products and services online?",
            fontSize = 15.sp
        )
        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue)
        )
        {
            Text(text = "See More")

        }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(navController= rememberNavController())
}