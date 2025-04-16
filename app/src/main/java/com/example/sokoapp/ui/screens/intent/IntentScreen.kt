package com.example.sokoapp.ui.screens.intent

import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.sokoapp.navigation.ROUT_MORE

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //Start Of Top bar
        TopAppBar(
            title = {
                Text(text = "Intents",
                      color = Color.Yellow)
                    },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.DarkGray,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.Yellow
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_MORE)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            },
        )
        //End Of Top bar


        Spacer(modifier = Modifier.height(20.dp))


        //M-PESA BUTTON
        Button(onClick = {
            val simToolKitLaunchIntent =
                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = "M-PESA",
                fontSize = 15.sp
            )
        }

        Spacer(modifier = Modifier.height(20.dp))


        //SMS BUTTON
        Button(onClick = {
            val smsIntent= Intent(Intent.ACTION_SENDTO)
            smsIntent.data="smsto:0792705999".toUri()
            smsIntent.putExtra("sms_body","Coding: The New Way of Life")
            mContext.startActivity(smsIntent)

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "SMS")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //CALL BUTTON
        Button(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0792705999".toUri()
            mContext.startActivity(callIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "CALL")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //SHARE BUTTON
        Button(onClick = {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Click to learn more")
            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "SHARE")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //CAMERA BUTTON
        Button(onClick = {
            val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                mContext.startActivity(cameraIntent)
            }else{
                println("Camera app is not available")
            }

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "CAMERA")
        }

        Spacer(modifier = Modifier.height(20.dp))


        //EMAIL BUTTON
        Button(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("muturisolomon2597@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Congrats!! Our New Software Engineer")
            mContext.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "EMAIL")
        }


    }

}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(navController = rememberNavController())
}