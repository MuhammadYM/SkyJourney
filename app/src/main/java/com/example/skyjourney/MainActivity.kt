package com.example.skyjourney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.skyjourney.ui.theme.SkyJourneyTheme
import net.skyscanner.backpack.compose.theme.BpkTheme
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.text.BpkText


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SkyJourneyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FlightDetailsCard()
                }
            }
        }
    }
}


@Composable
fun FlightDetailsCard(){
    BpkTheme {
         Column {
            BpkCard {
                BpkText(
                    text = "Departures",
                    style = BpkTheme.typography.heading1)
                BpkText(text = "JFK")
                BpkText(text = "Sat, 22 Jul")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SkyJourneyTheme {
        BpkText("Hello")
    }
}
