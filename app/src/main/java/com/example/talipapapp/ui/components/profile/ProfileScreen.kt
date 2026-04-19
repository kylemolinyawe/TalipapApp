package com.example.talipapapp.ui.components.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ProfileScreen() {

    Column(modifier = Modifier.fillMaxSize()) {

        // 🔒 STATIC HEADER (does NOT scroll)
        ProfileHeaderSection(
            onSettingsClick = { }
        )

        // 📜 SCROLLABLE CONTENT
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {

            ProfileTopSection(
                onViewProfileClick = {},
                onOrdersClick = {},
                onAddressesClick = {}
            )

            ProfileBalanceSection()

            ProfileGeneralSection(
                onHelpClick = {},
                onBusinessClick = {},
                onTermsClick = {}
            )

            // ProfileBottomSection.kt
            // 2 rows
            // 1st row - Log out button
            // 2nd row - text 'Version 0.0.1' (center align)
            ProfileBottomSection(
                onLogoutClick = {}
            )
        }
    }
}