package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import mp.project.mastermind.MainActivity

class AndroidLarge4 {
    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge4(modifier: Modifier = Modifier) {
        val context = LocalContext.current
        Box(
            modifier = modifier
                .requiredWidth(width = 400.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.Black)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 99.dp,
                        y = 589.dp
                    )
                    .requiredWidth(width = 203.dp)
                    .requiredHeight(height = 59.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffb62fcc))
            ) {
                Button(
                    onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text("OK", color = Color.White)
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 91.dp,
                        y = 47.dp
                    )
                    .requiredWidth(width = 219.dp)
                    .requiredHeight(height = 65.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color.White)
            )
            Text(
                text = "SCORES",
                color = Color(0xff7b24bf),
                textAlign = TextAlign.Center,
                lineHeight = 6.25.em,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 96.dp,
                        y = 61.dp
                    )
                    .requiredWidth(width = 208.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 49.dp,
                        y = 132.dp
                    )
                    .requiredWidth(width = 302.dp)
                    .requiredHeight(height = 437.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
            )
        }
    }

    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge4Preview() {
        AndroidLarge4(Modifier)
    }
}