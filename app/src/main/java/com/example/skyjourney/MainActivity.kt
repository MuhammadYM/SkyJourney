package com.example.skyjourney

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.skyjourney.ui.theme.SkyJourneyTheme
import net.skyscanner.backpack.compose.theme.BpkTheme
import net.skyscanner.backpack.compose.card.BpkCard
import net.skyscanner.backpack.compose.text.BpkText
import net.skyscanner.backpack.compose.tokens.BpkSpacing


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
                    FlightCard()
                }
            }
        }
    }
}


@Composable
fun FlightCard(modifier: Modifier = Modifier){
    BpkTheme(
    ) {
         Column (
             modifier = modifier.padding(BpkSpacing.Md),
                     horizontalAlignment = Alignment.CenterHorizontally
//             verticalArrangement = Arrangement.spacedBy(BpkSpacing.Xxl, Alignment.CenterVertically),
         ){
             BpkCard (
             ){
                Image(painter = painterResource(R.drawable.city), contentDescription = "city view",
                    modifier = modifier.fillMaxWidth().aspectRatio(1F), contentScale = ContentScale.FillWidth
                )
                 
//
//                 BpkText(text = "Journey Details",
//                         style = BpkTheme.typography.heading1
//                 )

                 Spacer(modifier = Modifier.height(BpkSpacing.Lg))

                 BpkText(
                     text = "Flight Information",
                     style = BpkTheme.typography.heading2)
                 BpkText(text = "Flight Number: JPN7HU")

                 Spacer(modifier = Modifier.height(BpkSpacing.Lg))

                 BpkText(
                     text = "Departures",
                     style = BpkTheme.typography.heading2)
                 Row {
                     Icon(imageVector = Icons.Default.Place, contentDescription = "calender")
                     BpkText(text = "JFK")

                     Spacer(modifier = Modifier.width(10.dp))
                     BpkText(text = "Sat, 22 Jul")
                 }


                 Spacer(modifier = Modifier.height(BpkSpacing.Lg))

                 BpkText(
                     text = "Arrival",
                     style = BpkTheme.typography.heading2)
                 Row {
                     Icon(imageVector = Icons.Default.Place, contentDescription = "calender")
                     BpkText(text = "SFO")
                     Spacer(modifier = Modifier.width(10.dp))
                     BpkText(text = "Sat, 23 Jul")
                 }

             }
             
//            BpkCard {
//                BpkText(
//                    text = "Departures",
//                    style = BpkTheme.typography.heading1)
//                BpkText(text = "JFK")
//                BpkText(text = "Sat, 22 Jul")
//                BpkSpacing.Base
//            }
//
//             BpkCard {
//                 BpkText(
//                     text = "Arrival",
//                     style = BpkTheme.typography.heading1)
//                 BpkText(text = "SFO")
//                 BpkText(text = "Sat, 23 Jul")
//             }
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
