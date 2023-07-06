import android.content.res.Configuration
import android.os.Handler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import ezra.mit.R
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SPLASH
import ezra.mit.ui.auth.AuthViewModel

@Composable
fun SplashScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.realestate))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(modifier=Modifier.size(400.dp),composition =composition)
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "HouseHub",style= TextStyle(fontSize = 30.sp, fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif), color = Color.Black)
    }


    val handler = Handler()
    handler.postDelayed({
        viewModel?.logout()
        navController.navigate(ROUTE_LOGIN) {
            popUpTo(ROUTE_SPLASH) { inclusive = true }
        }
    }, 5300)
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SplashScreenPreviewLight() {
    SplashScreen(null, rememberNavController())
}
