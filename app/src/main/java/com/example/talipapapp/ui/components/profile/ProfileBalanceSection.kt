package com.example.talipapapp.ui.components.profile

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
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
fun ProfileBalanceSection() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {

        // 1st row: Title
        Text(
            text = "Balance",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        // 2nd row: bordered container
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    1.dp,
                    Color.LightGray,
                    RoundedCornerShape(12.dp)
                )
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            // 1st column: icon
            Icon(
                imageVector = Icons.Default.AccountBalanceWallet,
                contentDescription = "Wallet"
            )

            Spacer(modifier = Modifier.width(8.dp))

            // 2nd column: wallet name
            Text(
                text = "eWallet",
                modifier = Modifier.weight(1f)
            )

            // 3rd column: balance (right aligned)
            Text(
                text = "₱ 1 250.00",
                fontWeight = FontWeight.Bold,
                textAlign = androidx.compose.ui.text.style.TextAlign.End
            )
        }
    }
}