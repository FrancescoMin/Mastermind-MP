package mp.project.mastermind

//Idea schermata delle regole di gioco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import mp.project.mastermind.screens.RulesScreen


class RulesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RulesScreen().AndroidLarge3(Modifier.fillMaxSize())
        }
    }
}







