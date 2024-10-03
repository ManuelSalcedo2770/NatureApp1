package com.example.natureapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.natureapp.ui.components.CardImage
import com.example.natureapp.ui.theme.NatureAppTheme

@Composable
fun HomeScreen(innerPadding: PaddingValues){
    val images = listOf(
        "https://static.eldiario.es/clip/c9110a1b-bc8d-4ca7-a1da-316c9f4e068e_16-9-aspect-ratio_default_0.jpg",
        "https://denomades.s3.us-west-2.amazonaws.com/blog/wp-content/uploads/2016/02/18095926/laprensa.hn_-1024x707.jpe",
        "https://live.staticflickr.com/1843/44577078111_63af89fe86_b.jpg",
        "https://www.intermundial.es/blog/wp-content/uploads/2015/08/Lagos-plitvice.jpg",
        "https://viajarporescocia.com/contenido/uploads/foto_principal-18.jpg"
    )

    val titles = listOf(
        "Montañas Rocosas, Canadá",
        "Salar de Uyuni, Bolivia",
        "Bosque de Bambú, Japón",
        "Plitvice, Croacia",
        "Skye, Escocia"
    )

    val descriptions = listOf(
        "Grandes montañas con lagos cristalinos y bosques extensos.",
        "El mayor desierto de sal, reflejando el cielo como un espejo.",
        "Senderos rodeados de altos y serenos bambúes.",
        "Cascadas y lagos turquesa en un entorno de ensueño.",
        "Acantilados, colinas verdes y paisajes místicos, dignos de ser el Valhalla."
    )

    Box (
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(top = 25.dp)
    ){
        Column (
            modifier = Modifier.padding(10.dp)
        ){
            LazyColumn(){
                items(images.size){
                    CardImage(
                        image = images[it],
                        title = titles[it],
                        description = descriptions[it]
                    )
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun HomeScreenPreview(){
    NatureAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}