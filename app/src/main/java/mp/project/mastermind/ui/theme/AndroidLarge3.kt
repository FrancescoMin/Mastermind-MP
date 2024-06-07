package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import mp.project.mastermind.MainActivity
import mp.project.mastermind.R

class AndroidLarge3 {
    val Typography.headlineSmall: TextStyle
        get() = TextStyle(
            // Imposta qui gli attributi dello stile di testo desiderato
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            /* Altri attributi come fontFamily, lineHeight, etc. */
        )

    @SuppressLint("NotConstructor")
    @Composable
    @Preview
    fun AndroidLarge3(modifier: Modifier = Modifier) {
        val context = LocalContext.current
        var showPopup by remember { mutableStateOf(false) }

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
                        y = 529.dp // Modifica l'offset per posizionare il nuovo bottone sopra il bottone "OK"
                    )
                    .requiredWidth(width = 203.dp)
                    .requiredHeight(height = 59.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffb62fcc))
            ) {
                Button(
                    onClick = { showPopup = true },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(stringResource(id = R.string.show_game_ui), color = Color.White)
                }
            }

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
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("OK", color = Color.White)
                }
            }

            Text(
                text = stringResource(id = R.string.explained_rules),
                color = Color.White,
                textAlign = TextAlign.Center,
                lineHeight = 1.38.em,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 78.dp,
                        y = 142.dp
                    )
                    .requiredWidth(width = 245.dp)
                    .requiredHeight(height = 436.dp)
            )
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
                    .background(color = Color(0xffd9d9d9))
            )
            Text(
                text = stringResource(id = R.string.rules),
                color = Color(0xff7b24bf),
                textAlign = TextAlign.Center,
                lineHeight = 6.25.em,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier

                    .offset(
                        x = 96.dp,
                        y = 61.dp
                    )
                    .requiredWidth(width = 208.dp)
            )

            if (showPopup) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Black.copy(alpha = 0.8f))
                        //.clickable { showPopup = false }
                ) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .clip(RoundedCornerShape(18.dp))
                            .background(Color.White)
                            .padding(16.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            // Sostituisci 'your_image' con il tuo drawable
                            Image(
                                painter = painterResource(id = R.drawable.spiega_regole),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(500.dp)
                                    .width(330.dp)
                            )
                            Spacer(modifier = Modifier.height(1.dp))
                            Button(
                                onClick = { showPopup = false }
                            ) {
                                Text(stringResource(id = R.string.close))
                            }
                        }
                    }
                }
            }
        }
    }
}


