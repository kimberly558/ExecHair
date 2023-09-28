package com.example.exechair.ui.theme.screen.product

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.exechair.R

@Composable
fun Kinyozi(navController: NavHostController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(id = R.drawable.kinyozi),
            contentDescription = "Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()

        )

    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var context = LocalContext.current
        Text(text = "Schedule Kinyozi Appointment",
            fontSize = 30.sp,
            modifier = Modifier.padding(20.dp),
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        Text(text = "Set Date")
        Spacer(modifier = Modifier.padding(30.dp))
        Text(text = "Set Time")
        Spacer(modifier = Modifier.padding(30.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Book Now")
        }
////        var selectedDate by remember { mutableStateOf(null) }
//        val Year: Int
//        val Month: Int
//        val Day: Int
//        val Calender= Calender.getInstance
//        Text(text = "Schedule Kinyozi Appointment",
//            fontSize = 30.sp,
//            modifier = Modifier.padding(20.dp),
//            color = Color.Magenta,
//            fontWeight = FontWeight.Bold)
//        Button(onClick = {
//            DatePickerDialog.show()
//        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)) ) {
//            Text(text = "Open Date Picker", color = Color.White)
//        }
//
//        // Adding a space of 100dp height
//        Spacer(modifier = Modifier.size(100.dp))
//
//        // Displaying the mDate value in the Text
//        Text(text = "Selected Date: ${Date.value}", fontSize = 30.sp, textAlign = TextAlign.Center)
//    }
//}


//        DatePicker(
//            modifier= Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//            selectedDate=selectedDate,
//            onDateChange={
//
//                selectedDate=it
//            },
//            label={
//                Text("Select a Date")
//            }
//        )


    }
}
@Preview
@Composable
fun KinyoziScreen(){
    Kinyozi(rememberNavController())
}