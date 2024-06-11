package mp.project.mastermind

//import mp.project.mastermind.models.Pawn.Color
//import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import mp.project.mastermind.screens.MainScreen
import mp.project.mastermind.ui.theme.MastermindTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            MastermindTheme {

                MainScreen().AndroidLarge1(Modifier.fillMaxSize())

            }
        }
    }
}
