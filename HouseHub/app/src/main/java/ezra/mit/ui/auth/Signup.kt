package ezra.mit.ui.auth

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.data.Resource
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.navigation.ROUTE_START
import ezra.mit.ui.theme.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val signupFlow = viewModel?.signupFlow?.collectAsState()

    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF5988B6), Color(0xa8edea)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush)
    ) {
    }




    Column(

        modifier = Modifier
            .fillMaxSize()
            //           .background(Color.LightGray)

            .border(2.dp, Color.Black),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Image(painter = painterResource(id = R.drawable.user),

            contentDescription ="Sign up" ,
            modifier = Modifier
                .height(90.dp)
                .width(300.dp).absolutePadding(1.dp,)
                .paddingFromBaseline(100.dp,20.dp)
        )
        Text(text = "Sign up",
            modifier = Modifier
//                    .background(Color.LightGray)
//                    .padding(10.dp)
                .width(311.dp)
//                    .height(20.dp)
            ,
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,


                ),
            textAlign = TextAlign.Center,
        )


        OutlinedTextField(value = name,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)

            ,
            label = {Text(text = "Username")},
            onValueChange = { name=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.profile), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )



        OutlinedTextField(value = email,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
            ,
            label = {Text(text = "Email")},
            onValueChange = { email=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.mail), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )

        var pnumber by remember {
            mutableStateOf((""))
        }


        OutlinedTextField(value = pnumber,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)
            ,
            label = {Text(text = "Phone number")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { pnumber=it
            }
            ,
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.smartphone), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            })



        OutlinedTextField(value = password,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)


            ,
            label = {Text(text = "Password")},
            onValueChange = { password=it
            },keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.padlock), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }

        )


        Button(onClick = { viewModel?.signup(name, email, password)},
            modifier = Modifier
                .padding(10.dp)
                .width(330.dp)
                .clip(CircleShape)

                .border(0.dp, Color.Transparent,)
            ,
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)

        ) {
            Text(text = "Sign up!",
                modifier = Modifier

                ,
                color = Color.DarkGray,
                style = androidx.compose.ui.text.TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )



            )

        }
        Text(

            text = "Already have an account?")



        Button(
            onClick = {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_SIGNUP) { inclusive = true }
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

        )
        {



            Text(text = "Login",modifier =  Modifier

                ,
                color = Color.DarkGray,
                style = androidx.compose.ui.text.TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )


            )


        }
        signupFlow?.value?.let {
            when (it) {
                is Resource.Failure -> {
                    val context = LocalContext.current
                    Toast.makeText(context, it.exception.message, Toast.LENGTH_LONG).show()
                }

                is Resource.Success -> {
                    LaunchedEffect(Unit) {
                        navController.navigate(ROUTE_START) {
                            popUpTo(ROUTE_SIGNUP) { inclusive = true }
                        }
                    }
                }

                else -> {


                }
            }








        }}







}



@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun SignupScreenPreviewLight() {
    AppTheme {
        SignupScreen(null, rememberNavController())
    }
}


