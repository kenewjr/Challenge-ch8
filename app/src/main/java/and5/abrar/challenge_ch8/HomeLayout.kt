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
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class HomeLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Challengech8Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {
    val mcontext = LocalContext.current
    Column(modifier = Modifier.padding(15.dp)) {
        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .padding(5.dp)
                .clickable { mcontext.startActivity(Intent(mcontext, DetailLayout::class.java)) }
        ) {

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start) {
                Image( painter = painterResource(R.drawable.ic_launcher_background), contentDescription = "ini gambar" )
               Column(modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 10.dp)) {
                   Text(
                       text = "Judul : " ,
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
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview3() {
    Challengech8Theme {
        Greeting3("Android")
    }
}