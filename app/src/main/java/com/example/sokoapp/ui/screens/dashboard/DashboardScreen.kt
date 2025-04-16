package com.example.sokoapp.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.R
import com.example.sokoapp.navigation.ROUT_ABOUT
import com.example.sokoapp.navigation.ROUT_HOME
import com.example.sokoapp.navigation.ROUT_INTENT
import com.example.sokoapp.navigation.ROUT_ITEM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){



        //Start Of TopAppbar
        TopAppBar(
            title = {
                Text(text = "Dashboard") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Yellow,
                titleContentColor = Color.Blue,
                navigationIconContentColor = Color.Blue,
                actionIconContentColor = Color.Blue
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }

                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }

            }
        )
        //End Of TopAppbar

        Spacer(modifier = Modifier.height(10.dp))

        //CARD
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(
                    start = 10.dp,
                    end = 10.dp
                ),
            shape = RoundedCornerShape(
                bottomStart = 40.dp,
                bottomEnd = 40.dp,
                topStart = 40.dp,
                topEnd = 40.dp,
            ),
            colors = CardDefaults.cardColors(Color.Blue)
        ){
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(R.drawable.icon1),
                    contentDescription = "Home",
                    modifier = Modifier.size(150.dp)
                )

                Text(
                    text = "SokoMart",
                    fontSize = 40.sp,
                    color = Color.Yellow,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold

                )
            }

        }
        //END CARD

        Spacer(modifier = Modifier.height(30.dp))

        //SEARCHBAR
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 10.dp,
                    end = 10.dp
                ),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "")},
            placeholder = { Text(text = "Search for more products...") }
        )
        //END OF SEARCHBAR

        Spacer(modifier = Modifier.height(30.dp))

        //Row
        Row (modifier = Modifier
            .padding(start = 10.dp, end = 10.dp)
        ){

            //CARD
            Card (
                modifier = Modifier
                    .width(180.dp)
                    .height(100.dp)
                    .clickable{navController.navigate(ROUT_HOME)},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Yellow)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.iconhome1),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(
                        text = "Home",
                        fontSize = 15.sp
                    )
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp).clickable{navController.navigate(ROUT_ABOUT)})

            Card (
                modifier = Modifier
                    .width(180.dp)
                    .height(100.dp)
                    .padding(start = 15.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Yellow))
            {

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about1),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "About",
                        fontSize = 15.sp)
                }
            }

        }
        //END ROW

        Spacer(modifier = Modifier.height(10.dp))

        //Row
        Row (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){

            //CARD
            Card (
                modifier = Modifier
                    .width(180.dp)
                    .height(100.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Yellow)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contact1),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Contact", fontSize = 15.sp)
                }
            }
            //END CARD

            Spacer(modifier = Modifier.height(10.dp))

            Card (
                modifier = Modifier
                    .width(180.dp)
                    .height(100.dp)
                    .padding(start = 20.dp)
                    .clickable{navController.navigate(
                    ROUT_ITEM
                )},
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(Color.Yellow)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.product1),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)                   )

                    Text(text = "Products", fontSize = 15.sp)
                }
            }

        }
        //END ROW

        


    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController= rememberNavController())
}