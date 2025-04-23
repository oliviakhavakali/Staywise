package com.olivia.guardmart.ui.theme.screen.service


import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_HOME
import com.olivia.guardmart.ui.theme.neworange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController){

    val mContext= LocalContext.current

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Service") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = neworange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

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
                    .verticalScroll(rememberScrollState())
            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(20.dp))

                //SearchBar

                var search by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = search,
                    onValueChange = {search = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
                    placeholder = { Text(text = "Search here,mate") }
                )

                //End of SearchBar
                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = painterResource(R.drawable.shoe),
                    contentDescription = "home",
                    modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillWidth,

                    )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Service Available",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )



                //Row
                Row (modifier = Modifier.padding()){
                    Image(
                        painter = painterResource(R.drawable.shoe),
                        contentDescription = "home",
                        modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.FillWidth
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Column {
                        Text(
                            text = "Unisex Shoe",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Text(
                            text = "Ksh. 2900",
                            fontSize = 15.sp,
                            textDecoration = TextDecoration.LineThrough
                        )
                        Text(
                            text = "Price : Ksh. !900",
                            fontSize = 15.sp,

                            )
                        Row{
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint =neworange)
                            Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                        }
                        Button(
                            onClick = {
                                val callIntent= Intent(Intent.ACTION_DIAL)
                                callIntent.data="tel:0720245837".toUri()

                                mContext.startActivity(callIntent)

                            },
                            colors = ButtonDefaults.buttonColors(Color.Cyan),
                            shape = RoundedCornerShape(10.dp)
                        ){
                            Text(text = "Contact moi")
                        }

                    }




                }
                //End of row











            }
        }
    )

    //End of scaffold



}

@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview() {
    ServiceScreen(rememberNavController())

}


