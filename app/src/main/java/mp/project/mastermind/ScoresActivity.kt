package mp.project.mastermind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import mp.project.mastermind.ui.theme.ScoresScreen

class ScoresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoresScreen().AndroidLarge4(Modifier.fillMaxSize())
        }
    }
}