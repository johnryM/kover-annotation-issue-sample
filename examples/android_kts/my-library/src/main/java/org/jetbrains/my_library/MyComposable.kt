package org.jetbrains.my_library

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyComposable(name: String, showLongText: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        val text = if (showLongText) {
            "Hi $name! How are you doing?"
        } else {
            "Hi $name"
        }
        Text(text = text)
    }
}

@Preview
@Composable
fun Preview() {
    MyComposable(name = "John", showLongText = true)
}