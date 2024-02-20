package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(head: String, body: String, modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
            Text(
                text = head,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = body,
                textAlign = TextAlign.Justify
            )
    }
}

@Composable
fun ComposeQuadrants(heading1: String, heading2: String, heading3: String, heading4: String, body1: String, body2: String, body3: String, body4: String, modifier: Modifier = Modifier
    ){
    Column (modifier.fillMaxSize()){
        Row (modifier.weight(1F)){
            ComposeQuadrant(
                head = heading1,
                body = body1,
                modifier = modifier
                    .background(Color(0xFFEADDFF))
                    .weight(1f)
            )
            ComposeQuadrant(
                head = heading2,
                body = body2,
                modifier = modifier
                    .background(Color(0xFFD0BCFF))
                    .weight(1f)
            ) }
            Column (modifier.weight(1F)) {
                Row (modifier.fillMaxSize()){
                    ComposeQuadrant(
                        head = heading3,
                        body = body3,
                        modifier = modifier
                            .background(Color(0xFFB69DF8))
                            .weight(1f)
                    )
                    ComposeQuadrant(
                        head = heading4,
                        body = body4,
                        modifier = modifier
                            .background(Color(0xFFF6EDFF))
                            .weight(1f)
                    )
                }
            }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrants(
            heading1 = stringResource(R.string.heading1),
            heading2 = stringResource(R.string.heading2),
            heading3 = stringResource(R.string.heading3),
            heading4 = stringResource(R.string.heading4),
            body1 = stringResource(R.string.body1),
            body2 = stringResource(R.string.body2),
            body3 = stringResource(R.string.body3),
            body4 = stringResource(R.string.body4)

        )
    }
}