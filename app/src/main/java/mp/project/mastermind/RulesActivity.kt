package mp.project.mastermind

//Idea schermata delle regole di gioco

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun RulesScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF40CF92)) // Green background color
            .aspectRatio(9f / 16f) // 9:16 aspect ratio
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopAppBar(
                title = {
                    Text(text = "Rules of Mastermind")
                },
                backgroundColor = MaterialTheme.colors.primary
            )

            Text(
                text = "The game consists of guessing a secret combination of colors. There are 8 colors to choose from, to be inserted into 5 holes with a maximum of 10 attempts. Next to the combination you entered, you will find holes that will be colored black or white depending on the condition that occurs: if the color is white, it means that a color present in the secret combination has been entered, but in an incorrect position; if the color is black it means that it is one of the colors entered and is present in the secret combination in the correct position. However the secret combination colors can be repeated, it's not as easy as it seems. Good fun!",
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(16.dp)
            )

            ClickableTextWithLink(
                text = "Learn more about Mastermind",
                link = "https://en.wikipedia.org/wiki/Mastermind_(board_game)",
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Button(
                onClick = { /* Action when button is clicked */ },
                shape = RoundedCornerShape(4.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Text(text = "Back to Main Menu")
            }
        }
    }
}

@Composable
fun ClickableTextWithLink(text: String, link: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Text(
        text = text,
        modifier = modifier.clickable {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
            context.startActivity(intent)
        },
        style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.primary),
    )
}

@Preview
@Composable
fun PreviewRulesScreen() {
    RulesScreen()
}


