
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.olivia.guardmart.R
import com.olivia.guardmart.ui.theme.navigation.ROUT_ITEM
import com.olivia.guardmart.ui.theme.neworange

@Composable
fun MartScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()
        , horizontalAlignment = Alignment.CenterHorizontally

    )
    {

        
            //card

            Card(
                modifier = Modifier.width(800.dp).height(400.dp),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp),
                colors = CardDefaults.cardColors(Color.Blue)

            )

            {
                     Row(Modifier.padding(horizontal = 20.dp, vertical = 0.1.dp)) {

                         Image(painter = painterResource(id = R.drawable.img_3), contentDescription = "",
                             modifier = Modifier.height(50.dp).width(50.dp))



                         Text(text = "Logo App",
                             fontWeight = FontWeight.Bold,
                             color = Color.White,
                             fontSize = 40.sp,
                             modifier = Modifier.padding(start = 80.dp)
                         )


                     }








                Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                    modifier = Modifier.size(400.dp)
                        .clip(RoundedCornerShape(16.dp))
                )

            }




        //End of row
        Spacer(modifier = Modifier.height(100.dp))

        Row(modifier = Modifier.fillMaxSize(),
        ) {
            //Row

            Card(
                modifier = Modifier.fillMaxWidth().height(800.dp),
                shape = RoundedCornerShape( topStart = 20.dp, topEnd = 20.dp, bottomStart = 50.dp, bottomEnd = 50.dp ) ,
                colors = CardDefaults.cardColors(Color.White),


                ) {



                Text(text = "The Most Worthy  Grocery App",
                    fontWeight = FontWeight.Bold,
                    color = neworange,
                    fontSize = 40.sp,
                    modifier = Modifier.padding(start = 30.dp)





                )



                Spacer(modifier = Modifier.height(20.dp))


                //variables
                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }




                Spacer(modifier = Modifier.height(20.dp))

                OutlinedTextField(
                    value = username,
                    onValueChange = {username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),

                    label = { Text(text = "Username")
                        TextAlign.Center
                    },
                    colors = OutlinedTextFieldDefaults.colors(

                        unfocusedBorderColor = Color.Black,
                        focusedBorderColor = Color.Gray
                    )


                )

                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = username,
                    onValueChange = {username = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                    shape = RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp, bottomEnd = 10.dp),

                    label = { Text(text = "password")
                        TextAlign.Center
                    },
                    colors = OutlinedTextFieldDefaults.colors(

                        unfocusedBorderColor = Color.Black,
                        focusedBorderColor = Color.Yellow
                    )


                )


                Spacer(modifier = Modifier.height(40.dp))


                Button(
                    onClick = {
                        navController.navigate(ROUT_ITEM)
                    },
                    colors = ButtonDefaults.buttonColors(neworange),
                    shape = RoundedCornerShape(11.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

                ) {
                    Text(text = "sign up")
                }


                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Already are member? Log in",
                    modifier = Modifier.padding(start = 60.dp))



                Spacer(modifier = Modifier.height(80.dp))

            }


        }







    }




}


@Preview(showBackground = true)
@Composable
fun MartScreenPreview() {
    MartScreen(rememberNavController())
}