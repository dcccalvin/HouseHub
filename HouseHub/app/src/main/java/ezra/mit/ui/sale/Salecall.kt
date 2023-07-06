package ezra.mit.ui.sale


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_SALE
import ezra.mit.navigation.ROUTE_SALEDETAILS
import ezra.mit.ui.auth.AuthViewModel


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun saletwo(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "Kalit Villa",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "3.5 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 4.68M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }


        })

}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun salethree(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "Calol Villa",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "3.5 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 3.8M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }


        })

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun salefour(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "Stufer",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "5 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 5.43M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }



        })

}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun salefive(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "RiverSide",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "3 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 3.999M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }


        })

}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun salesix(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "Ontour Villa",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "2 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 4.52M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }


        })

}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun saleseven(viewModel: AuthViewModel?, navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HouseHub Apartments", style = TextStyle(fontSize = 25.sp), color = Color.White)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        viewModel?.logout()
                        navController.navigate(ROUTE_SALE) {
                            popUpTo(ROUTE_SALEDETAILS) { inclusive = true }
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
            LazyColumn(){
                item {
                    Spacer(modifier = Modifier.height(65.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                        ,
                        verticalArrangement = Arrangement.Top
                        ,
                        horizontalAlignment = Alignment.Start
                    )

                    {
                        LazyRow()

                        {
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp, end = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),


                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.interior),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }
                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inter),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }

                            item {
                                Card(

                                    modifier = Modifier
                                        // .fillMaxWidth(0.9f)
                                        .width(370.dp)
                                        .height(500.dp)
                                        .padding(top = 10.dp, start = 10.dp),
                                    colors = CardDefaults.cardColors(
                                        containerColor = Color.White.copy(alpha = 0.3f),

                                        )
                                ) {
                                    Box(modifier=Modifier
                                        .fillMaxSize()
                                        ,

                                        ) {
                                        Image(
                                            painter = painterResource(R.drawable.inte),
                                            contentDescription = "interior",
                                            contentScale = ContentScale.FillBounds,
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .alpha(1f),
                                        )
                                    }

                                }
                            }



                        }




                        Text(text = "Hifer World",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 40.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Row() {
                            Spacer(modifier = Modifier.width(20.dp))
                            Icon(
                                painter = painterResource(R.drawable.location),
                                contentDescription = "GPS",
                                tint = Color.Gray, modifier = Modifier
                                    .size(20.dp)


                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(text = "Westlands,Nairobi",
                                color= Color.Gray,style= TextStyle(fontSize = 15.sp)
                            )



                        }
                        Spacer(modifier = Modifier.height(30.dp))
                        Row( modifier=Modifier.padding(start=20.dp)) {
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.bed),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "5 Beds")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.shower),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "4.5 Bath")

                                }





                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Card(shape = RoundedCornerShape(10),
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(30.dp)
                                    .background(Color.LightGray)

                            ) {
                                Row(modifier=Modifier.padding(start=15.dp,top=5.dp)) {
                                    Icon(
                                        painter = painterResource(R.drawable.wide),
                                        contentDescription = "GPS",
                                        tint = Color.Black, modifier = Modifier
                                            .size(20.dp)


                                    )
                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(text = "300 sqm")

                                }





                            }

                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Ksh 5.62M",
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),
                            color= Color.Black
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Details"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Elegant, spacious house immersed in nature's embrace. Open-plan design, abundant natural light, luxurious finishes. Serenity, comfort, and timeless beauty await in this dream abode."
                            ,modifier=Modifier.padding(20.dp))
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(text = "Contacts"
                            ,
                            modifier = Modifier

                                .padding(start=20.dp,),
                            style= TextStyle(
                                fontSize = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold
                            ),)
                        Text(text = "Email:   mkhousinng@gmail.com"
                            ,modifier=Modifier.padding(start=20.dp, bottom = 5.dp))
                        Text(text = "Phone no:+254173920102"
                            ,modifier=Modifier.padding(start=20.dp,bottom=5.dp))





                    }
                }

            }


        })

}