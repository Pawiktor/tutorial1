package com.example.tutorial1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable

@Composable
fun Conversation(messages: List<MainActivity.Message>){
    LazyColumn {
        items(messages) {message ->
            MainActivity().MessageCard(message)
        }
    }
}