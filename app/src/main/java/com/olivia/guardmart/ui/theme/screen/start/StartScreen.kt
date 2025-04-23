package com.olivia.guardmart.ui.theme.screen.start


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_DASHBOARD
import com.olivia.guardmart.ui.theme.navigation.ROUT_ITEM
import com.olivia.guardmart.ui.theme.neworange


@Composable
fun StartScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Guard Mart",
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        //Circular image
        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(20.dp))
        //End

        Text(text = "Find Your Order!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = neworange

        )

        Text(
            text = "It's not everyday you get a good chance to buy products of such quality,go ahead,press the button below.",
            textAlign = TextAlign.Center,
            fontSize = 18.sp)

        Button(
            onClick = {
                navController.navigate(ROUT_DASHBOARD)
            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(11.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text(text = "Add to Cart")
        }






    }


}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())
}