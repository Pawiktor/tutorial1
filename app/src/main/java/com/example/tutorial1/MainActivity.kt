package com.example.tutorial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial1.ui.theme.Tutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard(name = "Patrick")
        }
    }

    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name")
    }

    @Preview(showSystemUi = true)
    @Composable
    fun PreviewMassageCard(){
        MessageCard(name = "testyyy")
    }
}