package mp.project.mastermind

//Idea schermata delle regole di gioco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment


class RulesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RulesScreen()
        }
    }
}

@Composable
fun RulesScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rules of Mastermind",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "The game consists of guessing a secret combination of colors. There are 8 colors to choose from, to be inserted into 5 holes with a maximum of 10 attempts. Next to the combination you entered, you will find holes that will be colored black or white depending on the condition that occurs: if the color is white, it means that a color present in the secret combination has been entered, but in an incorrect position; if the color is black it means that it is one of the colors entered and is present in the secret combination in the correct position. However the secret combination colors can be repeated, it's not as easy as it seems. Good fun!",
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(16.dp)
        )
    }
}



@Preview
@Composable
fun PreviewRulesScreen() {
    RulesScreen()
}
