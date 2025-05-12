package com.olivia.staywise.ui.theme.screen.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Settings
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Profile Picture and Info
Column (modifier = Modifier
    .width(800.dp).height(200.dp)
    .padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally){



    Image(
        painter = painterResource(id = R.drawable.people), // Add your drawable
        contentDescription = "Profile Image",
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )

    Spacer(modifier = Modifier.width(16.dp))

    Column {
        Text("Olivia Khavakali", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("olivia@example.com", fontSize = 14.sp, color = Color.Gray)
    }


}


        Spacer(modifier = Modifier.height(24.dp))

        // Option Cards
        ProfileOption(
            icon = Icons.Default.ArrowDropDown,
            title = "My Bookings",
            onClick = { /* Navigate to bookings screen */ }
        )

        ProfileOption(
            icon = Icons.Default.Settings,
            title = "Saved Hotels",
            onClick = { /* Navigate to saved hotels screen */ }
        )

        ProfileOption(
            icon = Icons.Default.Edit,
            title = "Edit Profile",
            onClick = { /* Navigate to edit profile screen */ }
        )

        Spacer(modifier = Modifier.weight(1f))

        // Logout Button
        ProfileOption(
            icon = Icons.Default.ExitToApp,
            title = "Logout",
            onClick = { /* Handle logout */ },
            iconTint = Color.Red,
            textColor = Color.Red
        )
    }
}

@Composable
fun ProfileOption(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    onClick: () -> Unit,
    iconTint: Color = Color.Black,
    textColor: Color = Color.Black
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = iconTint,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(title, fontSize = 16.sp, color = textColor)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen(navController = rememberNavController())
}
