package com.example.talipapapp.ui.components.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Description
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun ProfileTopSection(
    onViewProfileClick: () -> Unit,
    onOrdersClick: () -> Unit,
    onAddressesClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 24.dp, 16.dp, 16.dp)
    ) {

        // Name
        Text(
            text = "Juan Dela Cruz",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(2.dp))

        // View profile
        Text(
            text = "View profile",
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.clickable {
                onViewProfileClick()
            }
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            // ORDERS CARD
            Surface(
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, Color.LightGray),
                color = Color.White, // ✅ FORCE WHITE BACKGROUND
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp)
                    .clickable { onOrdersClick() }
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Description,
                        contentDescription = "Orders"
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Orders")
                }
            }

            // ADDRESSES CARD
            Surface(
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(1.dp, Color.LightGray),
                color = Color.White, // ✅ FORCE WHITE BACKGROUND
                modifier = Modifier
                    .weight(1f)
                    .clickable { onOrdersClick() }
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        contentDescription = "Addresses"
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text = "Addresses")
                }
            }
        }
    }
}