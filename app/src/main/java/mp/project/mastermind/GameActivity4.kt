package mp.project.mastermind


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import mp.project.mastermind.ui.theme.AndroidLarge5

class GameActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {        //bundle è una classe di mappatura basata su coppie
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLarge5().AndroidLarge5(Modifier.fillMaxSize())
        }
    }

}
