package com.example.tutorial1

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tutorial1.ui.theme.Tutorial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial1Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MessageCard(Message("Patryk", "testyyy"))
                }
                Text(text = "asdasd")
            }
        }
    }

    data class Message(val author: String, val body: String)

    @Composable
    fun MessageCard(msg: Message) {
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "test icon",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(2.dp, MaterialTheme.colors.primary, CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = "Hello ${msg.author}",
                    color = MaterialTheme.colors.secondary,
                    style = MaterialTheme.typography.body1
                )
                Spacer(modifier = Modifier.width(4.dp))
                Surface(shape = MaterialTheme.shapes.medium, elevation = 10.dp) {
                    Text(text = msg.body, modifier = Modifier.padding(all = 4.dp), style = MaterialTheme.typography.h6)
                }
            }
        }

    }

    @Preview(showSystemUi = true, showBackground = true, uiMode = UI_MODE_NIGHT_YES, )
    @Composable
    fun PreviewMassageCard() {
        MessageCard(
            msg = Message("Patryk", "testyyy")
        )
        Text(text = "test")
    }
}