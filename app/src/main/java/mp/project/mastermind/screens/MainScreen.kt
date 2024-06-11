package mp.project.mastermind.screens



import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import mp.project.mastermind.GameActivity
import mp.project.mastermind.R
import mp.project.mastermind.RulesActivity
import mp.project.mastermind.ScoresActivity

val Typography.headlineSmall: TextStyle
    get() = TextStyle(

        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,

    )

class MainScreen {

    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge1(modifier: Modifier = Modifier) {
        val context = LocalContext.current
        var showPopup by remember { mutableStateOf(false) }
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            val image: Painter = painterResource(R.drawable.logo2)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .requiredHeight(300.dp)
                    .align(Alignment.TopStart)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Logo",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop // O ContentScale.Fit, se preferisci
                )
            }

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 73.dp,
                        y = 366.dp
                    )
                    .requiredWidth(width = 271.dp)
                    .requiredHeight(height = 180.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 271.dp)
                        .requiredHeight(height = 86.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xffb62fcc))
                ) {
                    Button(
                        onClick = {
                            showPopup = true
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(stringResource(id = R.string.play), color = Color.White)
                    }
                    if (showPopup) {
                        Popup(
                            onDismissRequest = { showPopup = false }
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(200.dp)
                                    .background(Color.White)
                                    .padding(16.dp)
                            ) {
                                Column {
                                    Button(
                                        onClick = {
                                            showPopup = false
                                            val intent = Intent(context, GameActivity::class.java).apply{
                                                putExtra("number", 5)
                                            }
                                            context.startActivity(intent)
                                        }
                                    ) {
                                        Text(stringResource(id = R.string.play_5))
                                    }
                                    Button(
                                        onClick = {
                                            showPopup = false
                                            val intent = Intent(context, GameActivity::class.java).apply{
                                                putExtra("number", 4)
                                            }
                                            context.startActivity(intent)
                                        }
                                    ) {
                                        Text(stringResource(id = R.string.play_4))
                                    }
                                }
                            }
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 16.086761474609375.dp,
                            y = 118.5714111328125.dp
                        )
                        .requiredWidth(width = 238.dp)
                        .requiredHeight(height = 61.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xffb62fcc))
                ) {
                    Button(
                        onClick = {
                            val intent = Intent(context, RulesActivity::class.java)
                            context.startActivity(intent)
                        },
                        modifier = Modifier
                            .fillMaxSize()
                        ,
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent) ) {
                        Text(stringResource(id = R.string.rules), color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 6.dp,
                            y = 32.dp
                        )
                        .requiredWidth(width = 257.dp)
                        .requiredHeight(height = 34.dp)
                        .fillMaxSize()
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 15.dp,
                            y = 213.dp
                        )
                        .requiredWidth(width = 238.dp)
                        .requiredHeight(height = 61.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xffb62fcc))
                ){



                    Button(
                        onClick = {val intent = Intent(context, ScoresActivity::class.java)
                            context.startActivity(intent)
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                        modifier = Modifier

                            .fillMaxSize()                ) { Text(stringResource(id = R.string.match_history), color = Color.White) }
                }
            }
        }
    }



    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge1Preview() {
        AndroidLarge1(Modifier)
    }
}