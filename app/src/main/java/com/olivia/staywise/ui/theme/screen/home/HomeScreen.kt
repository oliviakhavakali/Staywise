package com.olivia.staywise.ui.theme.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.staywise.R
import com.olivia.staywise.navigation.ROUT_HOME
import com.olivia.staywise.navigation.ROUT_SEARCH
import com.olivia.staywise.ui.theme.Newgreen

data class Hotel(val name: String,
                 val imageRes: Int,
                 val price: String,        // Added price field
                 val phone: String         // Added phone field
)

val hotels = listOf(



        Hotel("Serena Hotel", R.drawable.img,  "KES 12,000", "0700 123 456"),
Hotel("FairMont Hotel", R.drawable.fair,  "KES 15,000", "0711 456 789"),
Hotel("JW Maasai Mara", R.drawable.jw,  "KES 20,000", "0722 789 123"),
Hotel("Ivory Park Hotel", R.drawable.iv,  "KES 8,000", "0733 222 333"),
Hotel("Giraffe Tour Hotel", R.drawable.gf,  "KES 10,500", "0744 555 666"),
Hotel("Kempinski Hotel", R.drawable.kem,  "KES 25,000", "0755 111 222"),
Hotel("Safari Park Hotel", R.drawable.img, "KES 13,500", "0766 333 444"),
Hotel("Sankara Hotel", R.drawable.saf, "KES 18,000", "0777 777 888"),
Hotel("PrideInn Hotel", R.drawable.pride,  "KES 9,000", "0788 999 000"),
Hotel("Hill Park Hotel", R.drawable.hill,  "KES 7,500", "0799 123 456")
)







@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("StayWise Hotels", fontWeight = FontWeight.Bold)
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Newgreen,
                    titleContentColor = Color.White
                )
            )
        },

        bottomBar = {
            NavigationBar(containerColor = Newgreen) {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = {
                        selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
                    label = { Text("Search") },
                    selected = selectedIndex == 1,
                    onClick = {
                        selectedIndex = 1
                        navController.navigate(ROUT_SEARCH)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountBox, contentDescription = "profile") },
                    label = { Text("Call") },
                    selected = selectedIndex == 2,
                    onClick = {
                        selectedIndex = 2
                        // Navigate or perform call action
                    }
                )
            }
        },

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Explore Top Hotels",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    items(hotels) { hotel ->
                        HotelCard(hotel)
                    }
                }
            }
        }
    )
}
@Composable
fun HotelCard(hotel: Hotel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),   // Increased height for better layout
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = hotel.imageRes),
                contentDescription = hotel.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = hotel.name,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 8.dp)
            )


            // Displaying Price
            Text(
                text = hotel.price,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Newgreen,
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            // Displaying Phone Number and Call Button
            Text(
                text = "Call: ${hotel.phone}",
                fontSize = 13.sp,
                color = Color.Gray,
                modifier = Modifier.padding(start = 8.dp, top = 4.dp)
            )

            // Button to simulate calling the hotel (In a real app, use Intent to dial)
            Button(
                onClick = {
                    // This would open the phone dialer
                    println("Calling ${hotel.phone}")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Newgreen),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Call Now", color = Color.White)
            }
        }
        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun HomeScreen(navController: NavController) {
            var selectedIndex by remember { mutableStateOf(0) }

            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text("StayWise Hotels", fontWeight = FontWeight.Bold)
                        },
                        colors = TopAppBarDefaults.topAppBarColors(
                            containerColor = Newgreen,
                            titleContentColor = Color.White
                        )
                    )
                },

                bottomBar = {
                    NavigationBar(containerColor = Newgreen) {
                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                            label = { Text("Home") },
                            selected = selectedIndex == 0,
                            onClick = {
                                selectedIndex = 0
                                navController.navigate(ROUT_HOME)
                            }
                        )

                        NavigationBarItem(
                            icon = { Icon(Icons.Default.Search, contentDescription = "Search") },
                            label = { Text("Search") },
                            selected = selectedIndex == 1,
                            onClick = {
                                selectedIndex = 1
                                navController.navigate(ROUT_SEARCH)
                            }
                        )

                        NavigationBarItem(
                            icon = { Icon(Icons.Default.AccountBox, contentDescription = "profile") },
                            label = { Text("Call") },
                            selected = selectedIndex == 2,
                            onClick = {
                                selectedIndex = 2
                                // Navigate or perform call action
                            }
                        )
                    }
                },

                content = { paddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(paddingValues)
                            .padding(16.dp)
                    ) {
                        Text(
                            text = "Explore Top Hotels",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )

                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.spacedBy(16.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(hotels) { hotel ->
                                HotelCard(hotel)
                            }
                        }
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}