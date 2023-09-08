package com.example.appintern

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun previewfn() {
    LazyColumn(content = {
        items(CategoryList()){item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)

        }
    })
}
@Composable
fun BlogCategory(img : Int, title: String, subtitle: String){
    Card ( modifier = Modifier.padding(8.dp))
    {
        Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = img),
                contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            extracted(title, subtitle, Modifier.weight(.8f))
        }

    }
}

@Composable
fun extracted(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = subtitle,
            fontWeight = FontWeight.Light,
            style = MaterialTheme.typography.bodySmall
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)
fun CategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))
    list.add(Category(R.drawable.logo, "programmer", "employee"))
    list.add(Category(R.drawable.demo, "programmer", "employee"))

    return list
}