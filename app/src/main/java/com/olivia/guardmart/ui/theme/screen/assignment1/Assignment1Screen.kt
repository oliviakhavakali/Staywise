package com.olivia.guardmart.ui.theme.screen.assignment1

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_HOME
import com.olivia.guardmart.ui.theme.neworange



import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignmentScreen(navController:NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = neworange
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Search, contentDescription = "Home") },
                    label = { Text("Search") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Info, contentDescription = "Info") },
                    label = { Text("Info") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = neworange
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {

                Spacer(modifier = Modifier.width(20.dp))


                Text(text = "hi Samantha",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 20.sp,

                    )
                Spacer(modifier = Modifier.height(20.dp))

                //Row 2
                Row (modifier = Modifier.padding(start = 30.dp, end = 20.dp)
                    .horizontalScroll(rememberScrollState()))

                {
                    //Card3
                    Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)){
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center

                        ){
                            Image(
                                painter = painterResource(R.drawable.img_4),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp)
                            )





                        }

                    }


                    //End of card3

                    Spacer(modifier = Modifier.height(100.dp))

                    //Card4
                    Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)){
                        Column (
                            modifier = Modifier.fillMaxSize(),

                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center

                        )
                        {
                            Image(
                                painter = painterResource(R.drawable.img_5),
                                contentDescription = "Call",
                                modifier = Modifier.size(100.dp)
                            )

                            Text(text = "Products", fontSize = 15.sp)

                        }


                        //Card3
                        Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                            elevation = CardDefaults.cardElevation(10.dp)){
                            Column (
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center

                            ){
                                Image(
                                    painter = painterResource(R.drawable.img_4),
                                    contentDescription = "home",
                                    modifier = Modifier.size(100.dp)
                                )

                                Text(text = "Contact", fontSize = 15.sp)

                            }

                        }


                        //End of card3

                        Spacer(modifier = Modifier.height(100.dp))


                    }


                    //End of card4
             //card5
                    Card (modifier = Modifier.width(150.dp).height( 180.dp).padding(horizontal = 20.dp, vertical = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)){
                        Column (
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center

                        ){
                            Image(
                                painter = painterResource(R.drawable.img_5),
                                contentDescription = "home",
                                modifier = Modifier.size(100.dp)
                            )

                            Text(text = "Contact", fontSize = 15.sp)

                        }

                    }



                    //End of Row 2
                }
                Row (modifier = Modifier.padding(start = 30.dp, end = 20.dp)){

                    Image(
                        painter = painterResource(R.drawable.img_6),
                        contentDescription = "home",
                        modifier = Modifier.size(50.dp)
                    )


                    Text(
                        text = "NDA Reviewer for website project",
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Today -10pm",
                        fontWeight = FontWeight.SemiBold
                    )
                }
                }







        }
    )

    //End of scaffold


}


@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview() {
    AssignmentScreen(rememberNavController())

}


