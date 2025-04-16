package com.example.sokoapp.ui.screens.assign

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.navigation.ROUT_HOME

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Contact") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.LightGray,
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Daterange") },
                    label = { Text("") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },
                    label = { Text("") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                //Main Contents of the page
                Text(
                    text = "Hi Samantha",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(top = 30.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Here are your projects",
                    fontSize = 16.sp
                )

                Row (
                    modifier = Modifier.fillMaxWidth().padding(top = 25.dp).horizontalScroll(
                        rememberScrollState()
                    ),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){

                    Card (
                        modifier = Modifier.width(135.dp).height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)
                    ){
                        Column (){
                            Text(
                                text = "Cryptocurrency"
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Landing Page"
                            )
                        }
                    }
                    Card (
                        modifier = Modifier.width(135.dp).height(180.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)
                    ){
                        Column (){
                            Text(
                                text = "Cryptocurrency",
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Landing Page"
                            )
                        }
                    }

                }

                Column (
                    modifier = Modifier.padding(top = 30.dp).verticalScroll(rememberScrollState())

                ){

                    Text(text = "Personal Tasks",
                        modifier = Modifier.padding(20.dp)
                    )

                    Card (
                        modifier = Modifier.width(300.dp).height(90.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)
                    ){
                        Column (){
                            Text(
                                text = "NDA Review for website project",
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Today-10pm"
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Card (
                        modifier = Modifier.width(300.dp).height(90.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)
                    ){
                        Column (){
                            Text(
                                text = "Email Reply for Green Project",
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Today-10pm"
                            )
                        }
                    }




                }



            }
        }
    )

    //End of scaffold


}

@Preview(showBackground = true)
@Composable
fun AssignScreenPreview(){
    AssignScreen(navController= rememberNavController())
}