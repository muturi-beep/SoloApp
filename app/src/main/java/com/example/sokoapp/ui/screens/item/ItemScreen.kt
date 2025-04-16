package com.example.sokoapp.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.R
import com.example.sokoapp.navigation.ROUT_INTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //Start Of TopAppbar
        TopAppBar(
            title = {
                Text(text = "Nike Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Cyan,
                titleContentColor = Color.Blue,
                navigationIconContentColor = Color.Blue,
                actionIconContentColor = Color.Blue
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }

                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }

            }
        )
        //End Of TopAppbar


        //Start Of Image

        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            Image(
                painter = painterResource(R.drawable.shoe3),
                contentDescription = "item",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .verticalScroll(rememberScrollState()),
                contentScale = ContentScale.FillWidth
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        //End Of Image


        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "" )},
            placeholder = { Text(text = "Search....")}
        )

        //End Of Searchbar


        //Added a Column part to make the products scrollable after searchbar part

        Column(modifier = Modifier.verticalScroll(rememberScrollState())
        ) {

            //Row
            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(painter = painterResource(R.drawable.shoe1), contentDescription = "home",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .padding(top = 5.dp)
                        .clip(shape = RoundedCornerShape(150.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp),
                ) {
                    Text(
                        text = "Men's Shoes",
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Ksh: 1500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Ksh: 1000",
                        fontSize = 15.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(onClick = {  }) {
                        Text(
                            text = "Purchase",
                            fontSize = 15.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(painter = painterResource(R.drawable.shoe3), contentDescription = "home",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .padding(top = 5.dp)
                        .clip(shape = RoundedCornerShape(150.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp),
                ) {
                    Text(
                        text = "Men's Shoes",
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Ksh: 1500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Ksh: 1000",
                        fontSize = 15.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(onClick = {  }) {
                        Text(
                            text = "Purchase",
                            fontSize = 15.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(painter = painterResource(R.drawable.shoe2), contentDescription = "home",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .padding(top = 5.dp)
                        .clip(shape = RoundedCornerShape(150.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp),
                ) {
                    Text(
                        text = "Men's Shoes",
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Ksh: 1500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Ksh: 1000",
                        fontSize = 15.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(onClick = {  }) {
                        Text(
                            text = "Purchase",
                            fontSize = 15.sp
                        )
                    }
                }
            }

            Row (modifier = Modifier.padding(start = 20.dp)) {
                Image(painter = painterResource(R.drawable.shoe3), contentDescription = "home",
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .padding(top = 5.dp)
                        .clip(shape = RoundedCornerShape(150.dp)),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(20.dp))

                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp),
                ) {
                    Text(
                        text = "Men's Shoes",
                        fontWeight = FontWeight.ExtraBold
                    )
                    Text(
                        text = "Ksh: 1500",
                        fontSize = 15.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Text(
                        text = "Ksh: 1000",
                        fontSize = 15.sp
                    )
                    Row {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Red)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Gray)
                    }
                    Button(onClick = {  }) {
                        Text(
                            text = "Purchase",
                            fontSize = 15.sp
                        )
                    }
                }
            }

            //End Of Row

        }


    }

}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(navController = rememberNavController())
}