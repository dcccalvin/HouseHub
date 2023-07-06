package ezra.mit.ui.auth

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import ezra.mit.R
import ezra.mit.data.Resource
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.navigation.ROUTE_START
import kotlinx.coroutines.InternalCoroutinesApi

@OptIn(ExperimentalMaterial3Api::class, InternalCoroutinesApi::class)
@Composable
fun LoginScreen(viewModel: AuthViewModel?, navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val loginFlow = viewModel?.loginFlow?.collectAsState()




    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF5988B6), Color(0xa8edea)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = gradientBrush)
    )


    Column(

        modifier = Modifier
            .fillMaxSize()
            //           .background(Color.LightGray)

            .border(2.dp, Color.Black),
        verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){


        Image(painter = painterResource(id = R.drawable.user),

            contentDescription ="login" ,
            modifier = Modifier
                .height(90.dp)
                .width(300.dp)
                .absolutePadding(1.dp,)
                .paddingFromBaseline(100.dp, 20.dp)
        )

        Text(text = "Login",
            modifier = Modifier

                .width(311.dp)

            ,
            style = TextStyle(
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                textDecoration = TextDecoration.None


            ),
            textAlign = TextAlign.Center,
        )


        OutlinedTextField(value = email,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)

            ,
            label = { Text(text = "Email") },
            onValueChange = { email=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.profile), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "Username Icon"
                )
            }
        )



        OutlinedTextField(value = password,
            modifier = Modifier
                .width(350.dp)
                .padding(10.dp)


            ,
            label = { Text(text = "Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            onValueChange = { password=it
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.padlock), modifier = Modifier .height(20.dp).width(20.dp),
                    contentDescription = "pword Icon"
                )
            }



        )
        Button(onClick = { viewModel?.login(email, password)},
            modifier = Modifier
                .padding(10.dp)
                .width(330.dp)
                .clip(CircleShape)
            ,
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)

        ) {
            Text(text = "Login",
                modifier =  Modifier

                ,
                color = Color.DarkGray,
                style = TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )



            )

        }


        loginFlow?.value?.let {
                when (it) {
                    is Resource.Failure -> {
                        val context = LocalContext.current
                        Toast.makeText(context, it.exception.message, Toast.LENGTH_LONG).show()
                    }


                    is Resource.Success -> {
                        LaunchedEffect(Unit) {
                            navController.navigate(ROUTE_START) {
                                popUpTo(ROUTE_LOGIN) { inclusive = true }
                            }
                        }
                    }

                    else -> {}
                }}
          Text(

            text = "Don't have an account?" ,
            modifier = Modifier
                .padding(10.dp),





        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)

        )

        {
            Text(text = "Sign up",modifier =  Modifier
                .clickable {
                    navController.navigate(ROUTE_SIGNUP) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    }
                }

                ,
                color = Color.DarkGray,
                style = TextStyle(

                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )


            )


        }



    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
//    AppTheme {
//        LoginScreen(null, rememberNavController())
//    }
}

