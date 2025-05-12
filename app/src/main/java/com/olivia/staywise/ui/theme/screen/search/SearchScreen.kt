package com.olivia.staywise.ui.theme.screen.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.olivia.staywise.ui.theme.Newblue
import com.olivia.staywise.ui.theme.Newgreen

data class SearchHotel(
    val name: String,
    val imageRes: Int,
    val rating: Double,
    val reviewers: Int,
    val location: String
)

val hotelSearchList = listOf(
    SearchHotel("Serena Hotel", R.drawable.serena, 4.9, 1220, "Kenyatta Avenue, Nairobi"),
    SearchHotel("The Tribe", R.drawable.t, 4.7, 980, "Limuru Rd, Nairobi"),
    SearchHotel("ParkInn Hotel", R.drawable.pride, 4.2, 850, "Waiyaki Way, Nairobi"),
    SearchHotel("Sankara Hotel", R.drawable.san, 4.8, 1325, "Parklands, Nairobi"),
    SearchHotel("Sarova Stanley", R.drawable.saf, 4.6, 1130, "Kimathi Street, Nairobi"),
    SearchHotel("Era Hotel", R.drawable.a, 4.9, 1023, "Mombasa Rd, Nairobi"),
    SearchHotel("FairMont Hotel", R.drawable.fair, 4.5, 910, "Harry Thuku Rd, Nairobi"),
    SearchHotel("Jacarada Hotel", R.drawable.jaca, 4.3, 700, "Woodvale Cl, Nairobi"),
    SearchHotel("Lake Restore Hotel", R.drawable.rse, 4.4, 610, "Naivasha, Kenya"),
    SearchHotel("WaterBuck Hotel", R.drawable.img, 4.6, 880, "Nakuru, Kenya"),
    SearchHotel("Kempinski", R.drawable.kem, 5.0, 1450, "Chiromo Rd, Nairobi")
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Available Hotels Today",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        // Search Field
        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Search Hotels...") },
            leadingIcon = {
                Icon(Icons.Filled.Search, contentDescription = "Search Icon")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            shape = RoundedCornerShape(12.dp)
        )


        LazyColumn(verticalArrangement = Arrangement.spacedBy(16.dp)) {
            val filteredHotels = if (searchQuery.isBlank()) {
                hotelSearchList
            } else {
                hotelSearchList.filter {
                    it.name.contains(searchQuery, ignoreCase = true) ||
                            it.location.contains(searchQuery, ignoreCase = true)
                }
            }

            items(filteredHotels) { hotel ->
                HotelSearchCard(hotel = hotel, onViewDetails = {
                    // Navigate to details screen
                    navController.navigate("roomdetails") // or pass hotel ID
                })
            }
        }
    }
}

@Composable

fun HotelSearchCard(hotel: SearchHotel, onViewDetails: () -> Unit) {



    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .clickable { onViewDetails() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Image(
                painter = painterResource(hotel.imageRes),
                contentDescription = hotel.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = hotel.name,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Text(
                text = hotel.location,
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
            )

            Text(
                text = "${hotel.reviewers} reviewers",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Row(
                modifier = Modifier.padding(start = 16.dp, top = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(hotel.rating.toInt()) {
                    Icon(Icons.Filled.Star, contentDescription = null, tint = Newblue)
                }
                repeat(5 - hotel.rating.toInt()) {
                    Icon(Icons.Filled.Star, contentDescription = null, tint = Color.LightGray)
                }
                Spacer(modifier = Modifier.width(8.dp))
                Text("${hotel.rating}", fontSize = 14.sp, color = Color.Black)
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = onViewDetails,
                colors = ButtonDefaults.buttonColors(containerColor = Newgreen),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text("View Room Details")
            }

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchPreview() {
    SearchScreen(rememberNavController())
}