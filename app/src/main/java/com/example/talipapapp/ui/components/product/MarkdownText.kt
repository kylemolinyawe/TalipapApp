package com.example.talipapapp.ui.components.product

import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import android.widget.TextView
import io.noties.markwon.Markwon

@Composable
fun MarkdownText(content: String) {

    val context = LocalContext.current

    AndroidView(
        factory = {
            TextView(it).apply {
                val markwon = Markwon.create(context)
                markwon.setMarkdown(this, content)
            }
        },
        update = {
            val markwon = Markwon.create(context)
            markwon.setMarkdown(it, content)
        }
    )
}