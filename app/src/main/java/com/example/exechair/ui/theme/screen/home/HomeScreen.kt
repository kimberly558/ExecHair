package com.example.exechair.ui.theme.screen.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.exechair.R
import com.example.exechair.navigation.ROUTE_CONTACTUS
import com.example.exechair.navigation.ROUTE_HAIR
import com.example.exechair.navigation.ROUTE_KINYOZI
import com.example.exechair.navigation.ROUTE_SIGNUP

@Composable
fun HomeScreen(navController: NavHostController){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.backgroung),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()

        )

    }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        var context= LocalContext.current

        Text(
            text = "HAIR EXEC",
            color = Color.White,
            fontSize = 40.sp,
            modifier = Modifier.padding(20.dp))
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_HAIR)

        }) {
            Text(text = "Hair Appointment")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_KINYOZI) }) {
            Text(text = "Kinyozi Appointment")
        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_CONTACTUS)
        }) {
            Text(text = "Contact Us")
        }
    }
}

@Preview
@Composable
fun Homepage(){
    HomeScreen(rememberNavController())
}