package and5.abrar.challenge_ch8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import and5.abrar.challenge_ch8.ui.theme.Challengech8Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class DetailLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challengech8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    Column(modifier = Modifier.padding(15.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "ini gambar" )
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.3f)
            .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Judul : " ,
                color = Color.DarkGray,
                fontWeight = FontWeight.Normal,
            )
            Text(
                text = "Jadwal : " ,
                color = Color.DarkGray,
                fontWeight = FontWeight.Normal,
            )
            Text(
                text = "Sutradara : " ,
                color = Color.DarkGray,
                fontWeight = FontWeight.Normal,
            )
        }
        
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview4() {
    Challengech8Theme {
        Greeting4("Android")
    }
}