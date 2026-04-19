package com.example.talipapapp.ui.components.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun HomeAdSection(
    ads: List<String>
) {

    val adList = ads.take(3)

    // Get screen width
    val screenWidth = LocalConfiguration.current.screenWidthDp.dp

    // Subtract horizontal padding (16dp left + 16dp right)
    val cardWidth = screenWidth - 32.dp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp) // ✅ top padding added
    ) {

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {

            items(adList) { imageUrl ->

                Box(
                    modifier = Modifier
                        .width(cardWidth) // ✅ full width minus padding
                        .height(200.dp)
                        .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp))
                        .clip(RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.Center
                ) {

                    if (imageUrl.isNotEmpty()) {
                        AsyncImage(
                            model = imageUrl,
                            contentDescription = "Advertisement",
                            modifier = Modifier.fillMaxSize()
                        )
                    } else {
                        Text(
                            text = "Your Ad Here",
                            style = MaterialTheme.typography.bodyMedium,
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}