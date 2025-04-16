package com.example.sokoapp.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.R
import com.example.sokoapp.navigation.ROUT_DASHBOARD
import com.example.sokoapp.navigation.ROUT_ITEM

@Composable
fun StartScreen(navController: NavController) {

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Dream Come True",
            fontSize = 30.sp
        )

        Image(
            painter = painterResource(R.drawable.shoe3),
            contentDescription = "Welcome",
            modifier = Modifier
                .size(400.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find your Order",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Magenta
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Found on online shop dealers countrywide",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {navController.navigate(ROUT_DASHBOARD)},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            ) { Text(text = "Claim")

        }
    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(navController = rememberNavController())
}