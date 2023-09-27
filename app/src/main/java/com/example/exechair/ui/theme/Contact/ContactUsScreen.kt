package com.example.exechair.ui.theme.Contact

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactUs(navController: NavHostController){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Get in Touch", color = Color.White, fontSize = 50.sp)
        var context = LocalContext.current
        Button(onClick = { 
            val uri = Uri.parse("sms to 0769695480")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body","")
            context.startActivity(intent)
        }) {
            Text(text = "SMS", color = Color.White, fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.width(150.dp))
        Text(text = "Location: Kimathi House.", color = Color.White,textAlign = TextAlign.Center, fontSize = 30.sp)
    }

}
@Preview
@Composable
fun ContactUsScreen (){
    ContactUs(rememberNavController())
}