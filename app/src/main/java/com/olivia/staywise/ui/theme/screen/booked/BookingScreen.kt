package com.olivia.staywise.ui.theme.screen.booked

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.staywise.navigation.ROUT_HOME
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookingScreen(navController: NavController) {

    val context = LocalContext.current
    var guestName by remember { mutableStateOf("") }
    var guestsCount by remember { mutableStateOf("") }
    var hoteltype by remember { mutableStateOf("") }

    var checkInDate by remember { mutableStateOf("") }
    var checkOutDate by remember { mutableStateOf("") }

    val calendar = Calendar.getInstance()

    val showDatePicker: (onDateSelected: (String) -> Unit) -> Unit = { onDateSelected ->
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(context, { _: DatePicker, y, m, d ->
            onDateSelected("${d}/${m + 1}/$y")
        }, year, month, day).show()
    }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Book Your Stay",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth().height(800.dp)
                    .padding(8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    OutlinedTextField(
                        value = guestName,
                        onValueChange = { guestName = it },
                        label = { Text("Guest Name") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))


                    OutlinedTextField(
                        value = guestsCount,
                        onValueChange = { guestsCount = it },
                        label = { Text("Number of Guests") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))


                    OutlinedTextField(
                        value = hoteltype,
                        onValueChange = { hoteltype = it },
                        label = { Text("Hotel Name") },
                        placeholder = { Text("") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))


                    OutlinedTextField(
                        value = checkInDate,
                        onValueChange = {},
                        label = { Text("Check-in Date") },
                        readOnly = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { showDatePicker { checkInDate = it } }
                    )
                    Spacer(modifier = Modifier.height(16.dp))



                    Button(
                        onClick = {
                             navController.navigate(ROUT_HOME)
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Book Now")
                    }
                }
            }



        }

}

@Preview(showBackground = true)
@Composable
fun BookingPreview() {
    BookingScreen(rememberNavController())
}