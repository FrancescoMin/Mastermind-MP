package mp.project.mastermind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mp.project.mastermind.ui.theme.MastermindTheme
import mp.project.mastermind.models.Pawn
//import mp.project.mastermind.models.Pawn.Color
import androidx.compose.ui.unit.sp
import android.content.Intent
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
//import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.em
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight as FontWeight1



val Typography.headlineSmall: TextStyle
    get() = TextStyle(
        // Imposta qui gli attributi dello stile di testo desiderato
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        /* Altri attributi come fontFamily, lineHeight, etc. */
    )

        class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Example usage of Tassello Class
        val tmp = Pawn()
        //tmp.setColor(Color.BROWN)
        //tmp.getColor()

        setContent {
            MastermindTheme {
                // A surface container using the 'background' color from the theme
                AndroidLarge1()

                //Greeting("Android")
            }
        }
    }
}


@Composable
fun AndroidLarge1(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Box(
        modifier = modifier
            .requiredWidth(width = 400.dp)
            .requiredHeight(height = 800.dp)
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(width = 400.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color(0xffb62fcc))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 0.dp,
                    y = 198.dp
                )
                .requiredWidth(width = 400.dp)
                .requiredHeight(height = 800.dp)
                .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(color = Color(0xff7b24bf))
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 52.dp,
                    y = 51.dp
                )
                .requiredWidth(width = 311.dp)
                .requiredHeight(height = 170.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 311.dp)
                    .requiredHeight(height = 170.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffd9d9d9))
            )
            Property1Default2(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 143.4542236328125.dp,
                        y = 125.0574951171875.dp
                    )
            )
            Property1Default(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 7.dp,
                        y = 113.dp
                    )
            )
            Property1Default(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 254.dp,
                        y = 0.dp
                    )
            )
            Alien(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 7.dp,
                        y = 8.dp
                    )
            )
            Alien(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 257.dp,
                        y = 113.dp
                    )
            )
            Alien2(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 143.dp,
                        y = 9.dp
                    )
            )
            Text(
                text = "MASTERMIND",
                color = Color(0xff7b24bf),
                textAlign = TextAlign.Center,
                lineHeight = 6.25.em,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 52.dp,
                        y = 58.dp
                    )
                    .requiredWidth(width = 208.dp)
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
            )
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
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 6.dp,
                        y = 32.dp
                    )
                    .requiredWidth(width = 257.dp)
                    .requiredHeight(height = 34.dp)
            ) {
                Button(
                    onClick = {
                        val intent = Intent(context, GameActivity::class.java)
                        context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("PLAY", color = Color.White)
                }

            }
            Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 15.dp,
                            y = 213.dp)
                        .requiredWidth(width = 238.dp)
                        .requiredHeight(height = 61.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(color = Color(0xffb62fcc)))
            Button(
                onClick = {
                    val intent = Intent(context, RulesActivity::class.java)
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 6.187255859375.dp,
                        y = 137.14285278320312.dp
                    )
                    .requiredWidth(width = 257.dp)
                    .requiredHeight(height = 34.dp)
            ) { Text("RULES", color = Color.White) }



            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 6.dp,
                        y = 233.dp
                    )
                    .requiredWidth(width = 257.dp)
                    .requiredHeight(height = 34.dp)
            ) { Text("MATCH HISTORY", color = Color.White) }
        }
    }
}


@Composable
fun Property1Default(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 48.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Robot1-01 1",
            modifier = Modifier
                .requiredSize(size = 48.dp))
    }
}
@Composable
fun Property1Default2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredSize(size = 23.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Robot1-01 1",
            modifier = Modifier
                .requiredSize(size = 23.dp))
    }
}

@Composable
fun Alien(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 48.dp)
            .requiredHeight(height = 48.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Alien",
            modifier = Modifier
                .fillMaxSize())
    }
}

@Composable
fun Alien2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 23.dp)
            .requiredHeight(height = 23.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Alien",
            modifier = Modifier
                .fillMaxSize())
    }
}
@Preview(widthDp = 400, heightDp = 800)
@Composable
private fun AndroidLarge1Preview() {
    AndroidLarge1(Modifier)
}


//@Composable
//fun AndroidLarge1(modifier: Modifier = Modifier) {
//    val context = LocalContext.current
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 400.dp)
//            .requiredHeight(height = 800.dp)
//            .background(color = Color.White)
//    ) {
//        Box(
//            modifier = Modifier
//                .requiredWidth(width = 400.dp)
//                .requiredHeight(height = 800.dp)
//                .background(color = Color(0xffb62fcc)))
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 0.dp,
//                    y = 198.dp)
//                .requiredWidth(width = 400.dp)
//                .requiredHeight(height = 800.dp)
//                .clip(shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
//                .background(color = Color(0xff7b24bf)))
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 25.dp,
//                    y = 48.dp)
//                .requiredWidth(width = 400.dp)
//                .requiredHeight(height = 800.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 311.dp)
//                    .requiredHeight(height = 170.dp)
//                    .clip(shape = RoundedCornerShape(18.dp))
//                    .background(color = Color(0xffd9d9d9)))
//            Property1Default(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 143.4542236328125.dp,
//                        y = 125.0574951171875.dp))
//            Property1Default(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 7.dp,
//                        y = 113.dp))
//            Property1Default(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 254.dp,
//                        y = 0.dp))
//            Alien(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 7.dp,
//                        y = 8.dp))
//            Alien(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 257.dp,
//                        y = 113.dp))
//            Text(
//                text = "MASTERMIND",
//                color = Color(0xff7b24bf),
//                textAlign = TextAlign.Center,
//                lineHeight = 6.25.em,
//                style = typography.headlineSmall,
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 52.dp,
//                        y = 58.dp)
//                    .requiredWidth(width = 208.dp))
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 143.4542236328125.dp,
//                        y = 9.7701416015625.dp)
//                    .requiredWidth(width = 25.dp)
//                    .requiredHeight(height = 45.dp)
//            ) {
//                Alien()
//            }
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 45.dp,
//                    y = 361.dp)
//                .requiredWidth(width = 271.dp)
//                .requiredHeight(height = 180.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 271.dp)
//                    .requiredHeight(height = 86.dp)
//                    .clip(shape = RoundedCornerShape(10.dp))
//                    .background(color = Color(0xffb62fcc)))
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 16.086761474609375.dp,
//                        y = 118.5714111328125.dp)
//                    .requiredWidth(width = 238.dp)
//                    .requiredHeight(height = 61.dp)
//                    .clip(shape = RoundedCornerShape(10.dp))
//                    .background(color = Color(0xffb62fcc)))
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 6.dp,
//                        y = 32.dp)
//                    .requiredWidth(width = 257.dp)
//                    .requiredHeight(height = 34.dp)
//            ) {
//                Button(
//                    onClick = {
//                        val intent = Intent(context, GameActivity::class.java)
//                        context.startActivity(intent)
//                    },
//                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Text("PLAY", color = Color.White)
//                }
//
//            }
//            Button(
//                onClick = {val intent = Intent(context, RulesActivity::class.java)
//                    context.startActivity(intent) },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 6.187255859375.dp,
//                        y = 137.14285278320312.dp)
//                    .requiredWidth(width = 257.dp)
//                    .requiredHeight(height = 34.dp)){ Text("RULES", color = Color.White)}
//        }
//    }
//}
//
//@Composable
//fun Property1Default(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredSize(size = 48.dp)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.img),
//            contentDescription = "Robot1-01 1",
//            modifier = Modifier
//                .requiredSize(size = 48.dp))
//    }
//}
//
//@Composable
//fun Alien(modifier: Modifier = Modifier) {
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 25.dp)
//            .requiredHeight(height = 45.dp)
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.img_1),
//            contentDescription = "Alien",
//            modifier = Modifier
//                .requiredSize(size = 23.dp))
//    }
//}
//
//@Preview(widthDp = 360, heightDp = 800)
//@Composable
//private fun AndroidLarge1Preview() {
//    AndroidLarge1(Modifier)
//}

