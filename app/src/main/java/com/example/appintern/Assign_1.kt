package com.example.appintern

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun simpleText() {

    Text(
        text = "WELCOME", modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.titleMedium,
        fontStyle = FontStyle.Italic

    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun simpleTextField() {

    var text by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    Column {
        TextField(
            value = text,
            onValueChange = { it -> text = it },
            label = { Text(text = "User Name") })
        TextField(value = text2,
            onValueChange = { it -> text2 = it },
            label = { Text(text = "Password") })
    }
}


@Composable
fun simpleButton() {

    Button(modifier = Modifier.padding(16.dp), onClick = { /*TODO*/ }) {
        Text(text = "SUBMIT")
    }


}


@Preview(showSystemUi = true)
@Composable
fun simpleTextPreview() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        simpleText()

        simpleTextField()

        simpleButton()
    }
}
