package com.olivia.guardmart.ui.theme.screen.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.neworange
import java.text.Normalizer.Form

@Composable
fun FormScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    )

    {
        Image(
            painter = painterResource(R.drawable.homee),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )

        Text(text = "CREATE AN ACCOUNT ",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(20.dp))
        //variables
        var fullname by remember { mutableStateOf("") }
        var Username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var ConfirmPassword by remember { mutableStateOf("") }

    //Fullname
      OutlinedTextField(value = fullname,
           onValueChange = {fullname = it},
           modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
          leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = neworange) },
          label = { Text(text = "Fullname") },
          colors = OutlinedTextFieldDefaults.colors(

              unfocusedBorderColor = neworange,
              focusedBorderColor = Color.Gray
          ),


      )

        //end
        Spacer(modifier = Modifier.height(20.dp))


        //Username
        OutlinedTextField(value = Username,
            onValueChange = {Username = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = neworange) },
            label = { Text(text = "username") },
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Text),

            )

        //end
        Spacer(modifier = Modifier.height(20.dp))
        //email
        OutlinedTextField(value = email,
            onValueChange = {email= it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = neworange) },
            label = { Text(text = "Email") },
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Email),

            )

        //end
        Spacer(modifier = Modifier.height(20.dp))

        //password
        OutlinedTextField(value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = neworange) },
            label = { Text(text = "Password") },
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Gray
            ),

        keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation =PasswordVisualTransformation()

            )
        //password
        OutlinedTextField(value = ConfirmPassword,
            onValueChange = {ConfirmPassword = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = neworange) },
            label = { Text(text = "Confirmpassword") },
            colors = OutlinedTextFieldDefaults.colors(

                unfocusedBorderColor = neworange,
                focusedBorderColor = Color.Gray
            ),

            keyboardOptions =  KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation =PasswordVisualTransformation()

        )

        //end
        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(11.dp)
        ) {
            Text(text = "Register here")
        }


    }













}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview() {
    FormScreen(rememberNavController())

}
