package com.example.customtext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.customtext.ui.theme.CustomTextTheme
import com.example.customtext.ui.theme.Purple700

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomTextTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    customTextFiled()
                }
            }
        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun customTextFiled(){

    val GradientColors = listOf(Cyan, Gray, Purple700)

    Column(modifier = Modifier.fillMaxSize().padding(5.dp)) {

        Text(
            "This is custom brush text field." +
                    "Do not allow people to dim your shine." +
                    "Because they are blined.Tell them to put glasses."+
            "Brush is linear ",
            fontSize = 25.sp,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = GradientColors)
            )
        )

        Text(
            "This is custom brush text field." +
                    "Do not allow people to dim your shine." +
                    "Because they are blined.Tell them to put glasses",
            fontSize = 25.sp,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = GradientColors)
            )
        )


        Text(

            text = "This is text with custom brush size" +
                ".Do not allow people to dim your shine." +
                           "Because they are blined.Tell them to put glasses ",
            fontSize = 25.sp,
        style = TextStyle(
            brush = CustomBrush(Brush.linearGradient(
                colors = GradientColors,
                tileMode = TileMode.Repeated
            ) as ShaderBrush)
        ))
    }


}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CustomTextTheme {
        Greeting("Android")
    }
}