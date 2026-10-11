
package com.example.myfirstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MyFirstScreen()
            }
        }
    }
}

@Composable
fun MyFirstScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEAF2F8)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Halo, saya Muhammad Fadli!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF174A6E)
            )

            Text(
                text = "Ide aplikasi saya: Student Task Tracker.",
                modifier = Modifier.padding(top = 12.dp),
                fontSize = 16.sp
            )

            Image(
                painter = painterResource(
                    id = R.drawable.my_picture
                ),
                contentDescription = "Gambar saya",
                modifier = Modifier
                    .padding(top = 48.dp)
                    .size(180.dp)
            )
        }
    }
}
