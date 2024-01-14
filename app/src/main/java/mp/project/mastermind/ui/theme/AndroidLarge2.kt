package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mp.project.mastermind.MainActivity
import mp.project.mastermind.R
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ButtonColors
import androidx.compose.runtime.mutableStateListOf
import androidx.core.content.res.ResourcesCompat
import mp.project.mastermind.R.color.bottone_Mastermind
import androidx.compose.runtime.key as Key

class AndroidLarge2 {
    @Composable
    fun ColorChangingBoxes() {
        var currentColor by remember { mutableStateOf(Color.Gray) }

    }

    @Composable
    fun ArrowButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
        val image: Painter =
            painterResource(R.drawable.freccia)

        IconButton(
            onClick = onClick,
            modifier = modifier
                .requiredSize(31.dp)
        ) {
            Image(
                painter = image,
                contentDescription = "Arrow Icon",
                modifier = Modifier.size(24.dp)
            )
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge2(modifier: Modifier = Modifier) {

        val context = LocalContext.current
        Box(
            modifier = modifier
                .requiredWidth(width = 400.dp)
                .requiredHeight(height = 800.dp)
                .background(color = Color.White)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 412.dp)
                    .requiredHeight(height = 800.dp)
                    .background(color = Color(0xffb62fcc))
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 120.dp,
                        y = 70.dp
                    )
                    .requiredWidth(width = 295.dp)
            )
            {
                val listState = rememberLazyListState()

                val numberOfRows = 10
                val numberOfBoxesPerRow = 5
                val spacingBetweenBoxes = 8.dp // Spaziatura tra le caselle

                LazyColumn(state = listState) {
                    items(numberOfRows) { rowIndex ->
                        val rowKey = "Row #$rowIndex"

                        LazyRow(
                            modifier = Modifier
                                .padding(
                                    horizontal = 16.dp,
                                    vertical = 8.dp
                                )
                        ) {
                            items(numberOfBoxesPerRow) { index ->
                                val boxId = "Box #${(rowIndex * numberOfBoxesPerRow) + index}"

                                Box(
                                    modifier = Modifier
                                        .padding(end = if (index < numberOfBoxesPerRow - 1) spacingBetweenBoxes else 0.dp)
                                        .requiredWidth(width = 43.dp)
                                        .requiredHeight(height = 43.dp)
                                        .background(color = Color(0xffd9d9d9))
                                )
                            }
                        }
                    }
                }


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 20.dp,
                        y = 70.dp
                    )
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
            ) {
                val listState = rememberLazyListState()
                val numberOfRows = 10
                val numberOfBoxesPerRow = 5
                val spacingBetweenBoxes = 5.dp // Spaziatura tra le caselle
// ...

                Column {
                    repeat(numberOfRows) { rowIndex ->
                        val rowKey = "Row #$rowIndex"
                        LazyRow(
                            modifier = Modifier
                                .padding(
                                    horizontal = 5.dp,
                                    vertical = 21.5.dp
                                ) // Padding per ogni riga
                        ) {
                            items(numberOfBoxesPerRow) { index ->
                                val boxId = "Box #${(rowIndex * numberOfBoxesPerRow) + index}"

                                Box(
                                    modifier = Modifier
                                        .padding(end = if (index < numberOfBoxesPerRow - 1) spacingBetweenBoxes else 0.dp)
                                        .requiredWidth(width = 16.dp)
                                        .requiredHeight(height = 16.dp)
                                        .clip(shape = CircleShape)
                                        .background(color = Color(0xffd9d9d9))
                                )
                            }
                        }
                    }
                }

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 136.dp,
                            y = 9.dp
                        )
                        .requiredWidth(width = 212.dp)
                        .requiredHeight(height = 37.dp)
                        .clip(shape = RoundedCornerShape(18.dp))
                        .background(color = Color(0xffd9d9d9))
                ) {
                    Button( //mastermind
                        onClick = {
//                val intent = Intent(context, GameActivity::class.java)
//                context.startActivity(intent) devo mettere la soluzione qua sotto
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(bottone_Mastermind)),
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text("MASTERMIND", color = Color.White)
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 5.dp,
                            y = 700.dp
                        )
                        .requiredWidth(width = 389.dp)
                        .requiredHeight(height = 43.dp)
                )
                {//ARANCIONW
                    Button(
                        onClick = { /*listState.scrollToItem(index = numberOfRows * numberOfBoxesPerRow)*/ },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.arancio)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 343.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 294.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.giallo)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 245.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.verde)),
                        modifier = Modifier
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.rossa)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 98.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.cyan)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 196.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.rosa)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 147.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.blu)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 49.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 43.dp)
                            .requiredHeight(height = 43.dp)
                            .clip(shape = CircleShape)
                    ) { }
                }
            }
            ArrowButton(
                onClick = {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                },
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 22.dp)
            )
        }

    }




    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge2Preview() {
        AndroidLarge2(Modifier)
    }
}








