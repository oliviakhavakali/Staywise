package com.olivia.staywise.ui.theme.screen.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.staywise.R
import com.olivia.staywise.navigation.ROUT_HOME
import com.olivia.staywise.ui.theme.Newgreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().background(Newgreen)
            .verticalScroll(rememberScrollState())

    ) {
        Card(
            modifier = Modifier
                .width(500.dp)
                .height(300.dp),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(30.dp)

        ) {
            Column(
                modifier = Modifier.fillMaxSize().paint(
                    painter = painterResource(R.drawable.a),
                    contentScale = ContentScale.FillBounds
                ),

                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {

            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        //Row 1
        Row(
            modifier = Modifier.padding(start = 30.dp, end = 10.dp),
        ) {
            //Card1
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .padding(start = 5.dp, end = 5.dp)
                    .clickable { navController.navigate(ROUT_HOME) },

                ) {
                Column(
                    modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.homee),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(text = "Home", fontSize = 15.sp)

                }


            }

            Spacer(modifier = Modifier.height(10.dp))


            //End of card1


            //Card2
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .padding(start = 10.dp)
                    .clickable { navController.navigate(ROUT_HOME) }

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.search),
                        contentDescription = "abt",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(text = "search", fontSize = 15.sp)

                }

            }


            //End of card2


        }
        //End of Row 1

        Spacer(modifier = Modifier.height(10.dp))


        //Row 2
        Row(
            modifier = Modifier.padding(start = 30.dp, end = 10.dp)
        )
        {
            //Card3
            Card(
                modifier = Modifier.width(150.dp).height(200.dp)
                    .padding(start = 10.dp, end = 10.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,


                    ) {
                    Image(
                        painter = painterResource(R.drawable.booking),
                        contentDescription = "contact",
                        modifier = Modifier.size(100.dp)
                    )

                    Text(text = "Booking Section", fontSize = 15.sp)

                }

            }


            //End of card3

            Spacer(modifier = Modifier.height(100.dp))

            //Card4
            Card(
                modifier = Modifier.width(150.dp).height(200.dp).padding(start = 10.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )

            {
                Column(
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                )
                {
                    Image(
                        painter = painterResource(R.drawable.details),
                        contentDescription = "DETAILS",
                        modifier = Modifier.size(50.dp)
                    )

                    Text(text = "Room details", fontSize = 15.sp)

                }

            }


            //End of card4

            //End of Row 2
        }


    }

}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())

}
