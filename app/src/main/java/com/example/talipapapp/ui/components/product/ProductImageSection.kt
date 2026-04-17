package com.example.talipapapp.ui.components.product

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.talipapapp.data.ProductDataSource
import com.example.talipapapp.data.SellerDataSource
import com.example.talipapapp.data.ProductRepository

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun ProductImageSection(
    productId: Int?,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    val product = ProductRepository.getProductById(productId)
    val imageUrl = product?.imageUrl


    BoxWithConstraints(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(0.35f)
    ) {

        // IMAGE (full bleed)
        if (imageUrl.isNullOrEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
            )
        } else {
            AsyncImage(
                model = imageUrl,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        IconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(
                    top = WindowInsets.statusBars
                        .asPaddingValues()
                        .calculateTopPadding() + 8.dp,
                    start = 16.dp
                )
                .size(40.dp)
                .background(
                    color = Color.White,
                    shape = androidx.compose.foundation.shape.CircleShape
                )
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black
            )
        }    }}