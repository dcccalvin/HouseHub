package ezra.mit.ui.sale

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_RENT
import ezra.mit.navigation.ROUTE_SALE
import ezra.mit.navigation.ROUTE_SALEDETAILS
import ezra.mit.navigation.ROUTE_Sell2
import ezra.mit.navigation.ROUTE_Sell3
import ezra.mit.navigation.ROUTE_Sell4
import ezra.mit.navigation.ROUTE_Sell5
import ezra.mit.navigation.ROUTE_Sell6
import ezra.mit.navigation.ROUTE_Sell7
import ezra.mit.ui.auth.AuthViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SaleScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFFB899F0), Color(0xFFB798EF), Color(0xFFB798EF)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_RENT) {
                            popUpTo(ROUTE_SALE) { inclusive = true }
                        }
                    }) {
                        Icon(Icons.Filled.ArrowBack, "backIcon",tint = Color.White,)
                    }
                },

                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color((0xFFFF8400))
                ),


                )
        },
        content = {

            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFC4D8E2))

                ,
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Spacer(modifier = Modifier.height(90.dp))
                Row() {

                    Spacer(modifier = Modifier.width(35.dp))


                    Card(onClick = {viewModel?.logout()
                        navController.navigate(ROUTE_RENT) {
                            popUpTo(ROUTE_SALE) { inclusive = true }
                        }},
                        modifier= Modifier
                            .width(80.dp)
                            .height(80.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Black.copy(alpha = 0.75f),
                        ),
                        elevation = CardDefaults.cardElevation( 20.dp,10.dp,10.dp,10.dp,10.dp,10.dp)
                        ,

                        ) {
                        Icon(
                            painter = painterResource(R.drawable.apartment),
                            contentDescription = "Profile",
                            tint = Color.White,

                            modifier = Modifier
                                .size(60.dp)
                                .padding(start = 20.dp, top = 10.dp)
                        )
                        Text(text = "Rentals",
                            modifier = Modifier
                                .padding(start = 20.dp,),
                            color= Color.White

                        )

                    }
                    Spacer(modifier = Modifier.width(30.dp))



                    Card(onClick = {},
                        modifier= Modifier
                            .width(80.dp)
                            .height(80.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Black.copy(alpha = 0.8f),

                            ),
                        elevation = CardDefaults.cardElevation( 40.dp,10.dp,10.dp,10.dp,10.dp,10.dp)
                        ,
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.sign),
                            contentDescription = "Profile",
                            tint = Color(0xFFFF9800),
                            modifier = Modifier
                                .size(60.dp)
                                .padding(start = 20.dp, top = 10.dp)
                        )
                        Text(text = "On Sale",
                            modifier = Modifier
                                .padding(start = 20.dp,),
                            color= Color(0xFFFF9800)

                        )

                    }

                    Spacer(modifier = Modifier.width(30.dp))



                    Card(onClick = {

                        viewModel?.logout()
                        navController.navigate(ROUTE_HOME) {
                            popUpTo(ROUTE_SALE) { inclusive = true }
                    }},

                        modifier= Modifier
                            .width(80.dp)
                            .height(80.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Black.copy(alpha = 0.75f),
                        ),
                        elevation = CardDefaults.cardElevation( 20.dp,10.dp,10.dp,10.dp,10.dp,10.dp)
                        ,
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.profile),
                            contentDescription = "Profile",
                            tint = Color.White,
                            modifier = Modifier
                                .size(60.dp)
                                .padding(start = 20.dp, top = 10.dp)
                        )
                        Text(text = "Profile",
                            modifier = Modifier
                                .padding(start = 20.dp,),
                            color= Color.White

                        )

                    }

                    Spacer(modifier = Modifier.width(30.dp))

                }
                Spacer(modifier = Modifier.height(20.dp))
                LazyColumn() {

                    item {
                        Spacer(modifier = Modifier.height(10.dp))
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.interior), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "MK Housing",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "2 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3.552M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = {
                                        viewModel?.logout()
                                        navController.navigate(ROUTE_SALEDETAILS) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        }},
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sa), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "Kalit Villa",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3.5 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4.68M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = { viewModel?.logout()
                                        navController.navigate(ROUTE_Sell2) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        } },
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sar), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "Calcol",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "2 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3.8M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                var details = LocalContext.current
                                Button(
                                    onClick = {
                                        viewModel?.logout()
                                        navController.navigate(ROUTE_Sell3) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        }
                                    },
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sart), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "Stufer",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "5 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "5.43M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = { viewModel?.logout()
                                        navController.navigate(ROUTE_Sell4) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        }},
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sarta), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "RiverSide",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "3.999M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = {viewModel?.logout()
                                        navController.navigate(ROUTE_Sell5) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        } },
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sarth), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "Ontour Villa",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "2 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4.52M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = { viewModel?.logout()
                                        navController.navigate(ROUTE_Sell6) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        } },
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    item {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth(0.88f)
                                .height(300.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White.copy(alpha = 0.3f),
                            )
                        ) {
                            Box(modifier= Modifier
                                .fillMaxSize()
                                ,

                                ) {
                                Image(painter = painterResource(R.drawable.sarthe), contentDescription ="interior", contentScale = ContentScale.FillBounds,
                                    modifier= Modifier
                                        .fillMaxSize()
                                        .alpha(0.99f)
                                    ,)
                                Text(text = "Hifer World",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 40.dp),
                                    style= TextStyle(
                                        fontSize = 40.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White
                                )
                                Text(text = "Westlands,Nairobi",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 90.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "5 Bedrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 130.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "4.5 Bathrooms",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 150.dp),
                                    style= TextStyle(
                                        fontSize = 20.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )
                                Text(text = "5.62M",
                                    modifier = Modifier

                                        .padding(start=10.dp, top = 190.dp),
                                    style= TextStyle(
                                        fontSize = 30.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight.Bold
                                    ),
                                    color= Color.White

                                )

                                Button(
                                    onClick = {
                                        viewModel?.logout()
                                        navController.navigate(ROUTE_Sell7) {
                                            popUpTo(ROUTE_SALE) { inclusive = true }
                                        }
                                    },
                                    modifier = Modifier


                                        .padding(top=240.dp, start = 20.dp),
                                    shape = RoundedCornerShape(8.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        contentColor = Color.White,
                                        containerColor =  Color(0xFFFF8400).copy(alpha = 0.9f)
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
                                            text = "Take a look",

                                            color = Color.White,style= TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                                        )
                                    }



                                }


                            }





                        }


                        Spacer(modifier = Modifier.height(30.dp))
                    }



                }
                 }})





}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SaleScreenPreviewLight() {
    SaleScreen(null, rememberNavController())
}

