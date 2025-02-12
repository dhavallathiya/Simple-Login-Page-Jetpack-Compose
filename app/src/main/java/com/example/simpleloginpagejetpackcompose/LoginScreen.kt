package com.example.simpleloginpagejetpackcompose

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
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen() {

    var Email by remember {
        mutableStateOf("")
    }
    var Password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.login), contentDescription = "login",
            Modifier.size(200.dp)
        )

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))

        Text("Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(Email, onValueChange = {
            Email = it
        }, label = { Text("Email address") })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(Password, onValueChange = {
            Password = it
        }, label = { Text("Password") }, visualTransformation = PasswordVisualTransformation())

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}) {
            Text("Login")
        }

        Spacer(modifier = Modifier.height(32.dp))


        Text("Forgot password?", Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(32.dp))

        Text("Or Login With")

        Row(
            Modifier
                .fillMaxWidth()
                .padding(40.dp),
            Arrangement.SpaceEvenly
        ) {
            Image(
                painterResource(R.drawable.instagram),
                contentDescription = "instagram",
                Modifier
                    .size(50.dp)
                    .clickable {

                    })

            Image(
                painterResource(R.drawable.facebook),
                contentDescription = "facebook",
                Modifier
                    .size(50.dp)
                    .clickable {

                    })

            Image(
                painterResource(R.drawable.twitter),
                contentDescription = "twitter",
                Modifier
                    .size(50.dp)
                    .clickable {

                    })
        }
    }


}