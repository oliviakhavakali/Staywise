package com.olivia.guardmart.ui.theme.screen.splash


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_LOGIN
import com.olivia.guardmart.ui.theme.navigation.ROUT_START
import com.olivia.guardmart.ui.theme.neworange
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
        //Navigation
    val coroutine = rememberCoroutineScope()
    coroutine.launch {

       delay(2000)
        navController.navigate(ROUT_LOGIN)




    }




    Column (modifier = Modifier.fillMaxSize()
              .background(neworange),
              horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = Arrangement.Center,
    ){

        Image(
            painter = painterResource(R.drawable.item),
            contentDescription = "home",
            modifier = Modifier.size(300.dp))



    }















}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(rememberNavController())

}
