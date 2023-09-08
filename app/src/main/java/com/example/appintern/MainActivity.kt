//package com.example.appintern
//
//import android.os.Bundle
//import android.util.Log
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.draw.shadow
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.ColorFilter
//import androidx.compose.ui.graphics.Shape
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.appintern.ui.theme.AppInternTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            previewfn()
//        }
//    }
//}
//
////@Preview(showSystemUi = true)
////@Composable
////private fun previewfn() {
////    Column {
////        ListeViewItem(R.drawable.demo,"Rishav","Employee",)
////        ListeViewItem(R.drawable.demo,"Dhruv","Naukar",)
////        ListeViewItem(R.drawable.demo, "Shashank", "Majak",)
////        ListeViewItem(R.drawable.demo,"Kamli","Chal rha hai",)
////    }
////}
////@Composable
////private fun PreviewFunction() {
////    Text(
////        text = "kya hal chal",
////        fontStyle = FontStyle.Italic,
////        fontWeight = FontWeight.ExtraBold,
////        color = Color.Green,
////        fontSize = 36.sp,
////        textAlign = TextAlign.Center
////    )
////    Image(
////        painter = painterResource(id = R.drawable.demo),
////        contentDescription = "demo image",
////        contentScale = ContentScale.Inside
////    )
////
////    Button(
////        onClick = { },
////        colors = ButtonDefaults.buttonColors(contentColor = Color.White),
////        enabled = false,
////        shape = ButtonDefaults.shape,
////        modifier = Modifier
////            .width(50.dp)
////            .height(20.dp)
////    ) {
////        Text(text = "Google")
////        Image(painter = painterResource(id = R.drawable.demo), contentDescription = "demo")
////    }
//
//
////    val state = remember {
////        mutableStateOf("")
////    }
////    TextField(
////        value = state.value,
////        onValueChange = {
////            state.value = it
////        },
////        label = { Text(text = "Enter message") },
////        placeholder = {}
////    )
//
////}
//
//@Composable
//fun ListeViewItem(imgId: Int, name: String, occupation: String, modifier: Modifier) {
//    Row(modifier.padding(8.dp)) {
//        Image(
//            painter = painterResource(id = imgId),
//            contentDescription = "",
//            Modifier.size(40.dp)
//        )
//        Column {
//            Text(
//                text = name,
//                fontWeight = FontWeight.Bold
//            )
//            Text(
//                text = occupation,
//                fontWeight = FontWeight.Light,
//                fontSize = 12.sp
//            )
//        }
//    }
//}
//
//@Preview(showBackground = true, widthDp = 300, heightDp = 500)
//@Composable
//fun circularimg() {
//    Image(
//        painter = painterResource(id = R.drawable.logo),
//        contentScale = ContentScale.Crop,
//        modifier = Modifier.size(80.dp)
//            .clip(CircleShape)
//            .border(2.dp, Color.Black, CircleShape),
//        contentDescription = ""
//    )
//}


package com.example.appintern

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import kotlin.random.Random



class MainActivity : ComponentActivity() {

    private lateinit var rollButton: Button
    private lateinit var img: ImageView

    private val imageResources = intArrayOf(
        R.drawable.dice1,
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.button)
        img = findViewById(R.id.img)

        rollButton.setOnClickListener(View.OnClickListener {

            val randomIndex = Random.nextInt(imageResources.size)

            img.setImageResource(imageResources[randomIndex])
        })


    }
}

