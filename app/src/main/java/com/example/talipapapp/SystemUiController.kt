package com.example.talipapapp.ui.theme

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat

@Composable
fun SetStatusBarColor(
    backgroundColor: Color,
    darkIcons: Boolean
) {
    val view = LocalView.current
    val window = (view.context as Activity).window

    SideEffect {
        window.statusBarColor = android.graphics.Color.TRANSPARENT

        WindowInsetsControllerCompat(window, view).isAppearanceLightStatusBars = darkIcons
    }
}