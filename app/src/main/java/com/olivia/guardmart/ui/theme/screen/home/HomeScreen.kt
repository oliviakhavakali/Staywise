package com.olivia.guardmart.ui.theme.screen.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R


@Composable
fun HomeScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.img),contentScale = ContentScale.FillBounds)
    ) {
        Text(
            text = "GuardMart",
            fontSize = 30.sp,
            color = Color.Gray,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center

        )

        Image(
            painter = painterResource(R.drawable.home), contentScale = ContentScale.FillBounds,
            contentDescription = "b"
        )

        Text(
            text = "Welcome to my app",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic
        )

        Text(
            "lorem cfsshfsd sghfsdjga hdsagjsdkjsda sdgajksdagjkds  gahh",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold

        )


        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Cyan),
            shape = RoundedCornerShape(11.dp)
        ) {
            Text(text = "Add to Cart")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){

    HomeScreen(rememberNavController())
}