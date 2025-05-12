package com.olivia.staywise.ui.theme.screen.roomdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
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
import com.olivia.staywise.ui.theme.Newgreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoomdetailsScreen(navController: NavController) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)

    ) {
        Spacer(modifier = Modifier.height(20.dp))

        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_3), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("Sankara Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.ic_pool, label = "Gym")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("Booking") //navigate to booking screen
                              },
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }

        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_11), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("Serena Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)




        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.bar, label = "bar")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("30,000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }

        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_13), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("Sankara Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.gym, label = "Gym")
            AmenityItem(icon = R.drawable.res, label = "Restu")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }


        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_10), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("TribeInn Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.ic_pool, label = "Gym")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }


        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_15), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("FairMount Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.gym, label = "Gym")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }




        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_4), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("Pride Inn Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.gym, label = "Gym")
            AmenityItem(icon = R.drawable.bar, label = "bar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("35000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }


        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.image18), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("kempinski Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.ic_pool, label = "Gym")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29500/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }


        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_13), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("FairMount Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.gym, label = "Gym")
            AmenityItem(icon = R.drawable.bar, label = "bar")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("35000/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }


        // Room Image Banner
        Image(
            painter = painterResource(id = R.drawable.img_6), // Add image to drawable
            contentDescription = "Room Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Room Info
        Text("Sankara Hotel", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text("Room with a sea-facing view, king bed, and private balcony", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        // Amenities Section
        Text("Amenities", fontSize = 18.sp, fontWeight = FontWeight.Medium)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            AmenityItem(icon = R.drawable.ic_wifi, label = "Free WiFi")
            AmenityItem(icon = R.drawable.ic_breakfast, label = "Breakfast")
            AmenityItem(icon = R.drawable.bar, label = "bar")
            AmenityItem(icon = R.drawable.ic_tv, label = "Smart TV")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Price and Booking Button
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF5F5F5)),
            shape = RoundedCornerShape(12.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text("29550/= / night", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Newgreen)
                    Text("Includes taxes & fees", fontSize = 12.sp, color = Color.Gray)
                }

                Button(
                    onClick = { navController.navigate("booking") }, // Navigate to BookingScreen
                    colors = ButtonDefaults.buttonColors(containerColor = Newgreen)
                ) {
                    Text("Book Now")
                }
            }

        }

    }


}

@Composable
fun AmenityItem(icon: Int, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.width(70.dp)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = label,
            modifier = Modifier
                .size(32.dp)
                .padding(bottom = 4.dp)
        )
        Text(label, fontSize = 12.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun RoomdetailsPreview() {
    RoomdetailsScreen(rememberNavController())
}
