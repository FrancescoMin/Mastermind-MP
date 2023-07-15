package mp.project.mastermind

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mp.project.mastermind.database.DBStorico
import mp.project.mastermind.database.Storico
import mp.project.mastermind.ui.theme.MastermindTheme
import mp.project.mastermind.models.Tassello
import mp.project.mastermind.models.Tassello.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Example usage of Tassello Class
        val tmp = Tassello()
        tmp.setColor(Color.BROWN)
        tmp.getColor()

        setContent {
            MastermindTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MastermindTheme {
        Greeting("Android")
    }
}