package ezra.mit.ui.start

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_RENT
import ezra.mit.navigation.ROUTE_START
import ezra.mit.ui.auth.AuthViewModel

@Composable
fun StartScreen(viewModel: AuthViewModel?, navController: NavHostController) {

    Box(modifier = Modifier
        .fillMaxSize()

    )
    {
        Image(painter = painterResource(id = R.drawable.ben), contentDescription = "start",
            modifier= Modifier
                .fillMaxHeight()
                .fillMaxSize(),

            contentScale = ContentScale.FillBounds
        )

    }
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color.Transparent,Color(0xFF010002)),
        startY = 0f,
        endY = Float.POSITIVE_INFINITY
    )
    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(brush = gradientBrush),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment=Alignment.Start
    ) {

        Text(text = "HouseHub",
            modifier=Modifier
                .padding(start = 15.dp)
            ,
            style = TextStyle(
                fontSize = 50.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal

            ),
            color= Color.White
        )
        Text(text = "Apartments",
            modifier=Modifier
                .padding(start = 15.dp)
            ,
            style = TextStyle(
                fontSize = 50.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Normal

            ),
            color= Color.White

        )
        Text(text ="A platform to find your dream home",
            modifier =Modifier.padding(start=15.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal

            ),

            color = Color.White,)
        Spacer(modifier = Modifier.height(50.dp))
        Row(
            modifier = Modifier
                .padding(start = 15.dp, bottom = 15.dp)
                .height(80.dp)
        ) {



            Button(
                onClick = {

                    viewModel?.logout()
                    navController.navigate(ROUTE_RENT) {
                        popUpTo(ROUTE_START) { inclusive = true }
                    }
                },
                modifier = Modifier

                    .fillMaxHeight(0.9f)
                    .padding(top=13.dp, start = 10.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color.White,
                    containerColor =  Color(0xFFFA8102).copy(alpha = 0.9f)
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
                        text = "Take Tour",

                        color = Color.White,style=TextStyle(fontSize = 20.sp , fontWeight = FontWeight.Bold),
                    )
                }



            }


        }

    }


}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun StartScreenPreviewLight() {
    StartScreen(null, rememberNavController())
}