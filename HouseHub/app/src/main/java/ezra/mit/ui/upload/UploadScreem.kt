package ezra.mit.ui.upload

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.auth.AuthViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UploadScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val context = LocalContext.current
    val houseName = remember { mutableStateOf("") }
    val location = remember { mutableStateOf("") }
    val bedrooms = remember { mutableStateOf("") }
    val bathrooms = remember { mutableStateOf("") }
    val floorArea = remember { mutableStateOf("") }
    val details = remember { mutableStateOf("") }
    val imageUrls = remember { mutableStateListOf<String>() }
    Column(modifier = Modifier.background(Color(0xFFF4FBFF)).fillMaxSize()) {
        Spacer(modifier = Modifier.height(50.dp))
        LazyColumn(Modifier.padding(start=60.dp,top=30.dp, end = 20.dp).fillMaxSize()) {
            item {
                OutlinedTextField(
                    value = houseName.value,
                    onValueChange = { houseName.value = it },
                    label = { Text("House Name") }
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = location.value,
                    onValueChange = { location.value = it },
                    label = { Text("Location") }
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = bedrooms.value,
                    onValueChange = { bedrooms.value = it },
                    label = { Text("Number of Bedrooms") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = bathrooms.value,
                    onValueChange = { bathrooms.value = it },
                    label = { Text("Number of Bathrooms") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = floorArea.value,
                    onValueChange = { floorArea.value = it },
                    label = { Text("Floor Area (sqm)") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(
                    value = details.value,
                    onValueChange = { details.value = it },
                    label = { Text("Details") },
                    modifier = Modifier.height(200.dp)
                )
//                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { /* Upload logic */ }) {
                    Text("Upload")
                }
            }
        }




    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun UploadScreenPreviewLight() {
    UploadScreen(null, rememberNavController())
}