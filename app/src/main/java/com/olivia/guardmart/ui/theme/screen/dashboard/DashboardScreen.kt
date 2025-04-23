package com.olivia.guardmart.ui.theme.screen.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_ABOUT
import com.olivia.guardmart.ui.theme.navigation.ROUT_HOME
import com.olivia.guardmart.ui.theme.neworange
import com.olivia.guardmart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize().background(neworange)
           .verticalScroll(rememberScrollState())

    ){

        //Box
        Box (){
            //Card
            Card ( modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(newwhite)
            ){
                TopAppBar(
                    title = { Text(text ="Dashboard Section" ) },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }

                )

            }
            //End of Card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)

            ){
                //Add Card Contents
                Spacer(modifier = Modifier.height(100.dp))
                Text(text = "We at Guard mart are more than enthralled to Invite you to our mall.Below you can access a variety of our services,please,Click Away")



            }


        }
        //End of Box

        Spacer(modifier = Modifier.height(100.dp))

        //Row 1
        Row (modifier = Modifier.padding(start = 30.dp, end = 10.dp),
        ) {
            //Card1
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .padding(horizontal = 20.dp, vertical = 20.dp)
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
                        modifier = Modifier.size(200.dp)
                    )

                    Text(text = "Home", fontSize = 15.sp)

                }


            }

            Spacer(modifier = Modifier.height(30.dp))


            //End of card1




            //Card2
            Card(
                modifier = Modifier
                    .width(150.dp)
                    .height(180.dp)
                    .padding(horizontal = 20.dp, vertical = 20.dp)
                    .clickable { navController.navigate(ROUT_ABOUT) }

            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Image(
                        painter = painterResource(R.drawable.abt),
                        contentDescription = "abt",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(text = "About", fontSize = 15.sp)

                }

            }


            //End of card2



        }
        //End of Row 1





        //Row 2
        Row (modifier = Modifier.padding(start = 30.dp, end = 20.dp),
        )
        {
            //Card3
            Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                elevation = CardDefaults.cardElevation(10.dp)){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,



                ){
                    Image(
                        painter = painterResource(R.drawable.contact),
                        contentDescription = "contact",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(text = "Contact", fontSize = 15.sp)

                }

            }


            //End of card3

            Spacer(modifier = Modifier.height(100.dp))

            //Card4
            Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                elevation = CardDefaults.cardElevation(10.dp))

            {
                Column (
                    modifier = Modifier.fillMaxSize(),

                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                )
                {
                    Image(
                        painter = painterResource(R.drawable.item),
                        contentDescription = "Call",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(text = "items", fontSize = 15.sp)

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
