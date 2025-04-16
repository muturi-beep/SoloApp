package com.example.sokoapp.ui.screens.form


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.R

@Composable
fun FormScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().paint(painter = painterResource(R.drawable.shoe1), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

        ){

        Image(
            painter = painterResource(R.drawable.icon1),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp).size(200.dp),


            )

        Text(
            text = "CREATE AN ACCOUNT",
            fontSize = 30.sp,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(10.dp))

        //VARAIBLES
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        //fullname
        TextField(
            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = Color.Blue) },
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color.Black,
                unfocusedTextColor = Color.DarkGray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end of fullname
        Spacer(modifier = Modifier.height(10.dp))
        //Username
        TextField(
            value = username,
            onValueChange = {username = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = Color.Blue) },
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color.Black,
                unfocusedTextColor = Color.DarkGray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end of username
        Spacer(modifier = Modifier.height(10.dp))

        //EMAIL
        TextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = Color.Blue) },
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color.Black,
                unfocusedTextColor = Color.DarkGray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        //end of email
        Spacer(modifier = Modifier.height(10.dp))

        //Password
        TextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Blue) },
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = Color.Black,
                unfocusedTextColor = Color.DarkGray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
        )
        //end of password
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "Register")
        }


    }


}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(navController= rememberNavController())
}