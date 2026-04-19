package com.example.talipapapp.ui.components.profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Business
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ProfileGeneralSection(
    onHelpClick: () -> Unit,
    onBusinessClick: () -> Unit,
    onTermsClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        // Header
        Text(
            text = "General",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 1. Help Center
        GeneralRowItem(
            icon = {
                Icon(Icons.Default.HelpOutline, contentDescription = "Help")
            },
            text = "Help center",
            onClick = onHelpClick
        )

        Divider(color = Color.LightGray)

        // 2. Business
        GeneralRowItem(
            icon = {
                Icon(Icons.Default.Business, contentDescription = "Business")
            },
            text = "TalipapApp for business",
            onClick = onBusinessClick
        )

        Divider(color = Color.LightGray)

        // 3. Terms
        GeneralRowItem(
            icon = {
                Icon(Icons.Default.Description, contentDescription = "Terms")
            },
            text = "Terms & policies",
            onClick = onTermsClick
        )
    }
}