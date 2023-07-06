package ezra.mit.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.getValue
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import androidx.compose.ui.text.style.TextAlign
import com.airbnb.lottie.compose.LottieConstants


import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SALE
import ezra.mit.ui.auth.AuthViewModel


@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController, ) {



    Column(modifier= Modifier
        .fillMaxSize()
        .background(Color(0xFFC4D8E2))) {
        
    }
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation( 10.dp,10.dp,10.dp,10.dp,10.dp,10.dp)

    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Row(modifier = Modifier.padding(10.dp)) {
                Spacer(modifier = Modifier.width(110.dp))


                Text(
                    text = "Hello",
                    modifier = Modifier,
                    color = Color.Black,
                    style = TextStyle(
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    ), textAlign = TextAlign.Center

                )
                Spacer(modifier = Modifier.width(4.dp))
                Image(
                    painter = painterResource(id = R.drawa),
                    contentDescription = "",
                    modifier = Modifier
                        .width(40.dp)
                        .height(40.dp)
                        .padding(top = 15.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))



            }




            Column(modifier= Modifier
                .fillMaxWidth()
                .height(670.dp)) {


//                    Box() {




                 //   }
                Box() {
                        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.homeprof))
                    var isPlaying by remember { mutableStateOf(true) }
                        val progress by animateLottieCompositionAsState(composition, iterations = LottieConstants.IterateForever, isPlaying =isPlaying, restartOnPlay = false )






                        LottieAnimation(modifier= Modifier
                            .size(800.dp)
                            .padding(bottom = 500.dp)
                            .width(600.dp)
                            .height(900.dp)
                            .fillMaxSize(),
                            composition =composition,
                            progress = progress





                        )



                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth().padding(start=20.dp,end=20.dp,top=150.dp)) {

                        Text(
                            text = viewModel?.currentUser?.displayName?: "",
                            modifier = Modifier.padding(start = 10.dp),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.SansSerif
                            )
                        )

                        Text(
                            text = viewModel?.currentUser?.email?:"",
                            modifier = Modifier.padding(start = 10.dp),
                            color = Color.Black,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.SansSerif
                            )
                        )
            Spacer(modifier = Modifier.height(70.dp))
            Button(
                onClick = {
                    viewModel?.logout()
                    navController.navigate(ROUTE_SALE) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                modifier = Modifier

                    .fillMaxHeight(0.2f)
                    .padding(top = 13.dp, start = 1.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor =  Color(0xFF000000).copy(alpha = 0.9f)
                )
            ) {
                Row {
                    Icon(
                        painter = painterResource(R.drawable.location),
                        contentDescription = "GPS",
                        tint = Color.White, modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Explore more houses ",

                        color = Color.White,style=TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                    )
                }



            }
            Spacer(modifier = Modifier.height(30.dp))



            Button(
                onClick = {
                    viewModel?.logout()
                    navController.navigate(ROUTE_LOGIN) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor =  Color(0xFFF78919).copy(alpha = 0.9f)
                )
            ) {
                Text(text = "Logout")
            }



                    }


                    
                }



                
            }

                

            Spacer(modifier = Modifier.height(10.dp))




            Text(
                text = viewModel?.currentUser?.email ?: "",
                modifier = Modifier.padding(start=70.dp),
                color = Color.Black,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif
                ),

            )
            Spacer(modifier = Modifier.height(10.dp))


            ////////
        }
    }














    }


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    HomeScreen(null, rememberNavController())
}



