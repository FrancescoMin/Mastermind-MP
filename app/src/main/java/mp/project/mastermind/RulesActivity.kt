package mp.project.mastermind

//Idea schermata delle regole di gioco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding


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
    Column {
        Text(
            text = "Rules",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = "Here we have the rules of the game",
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
