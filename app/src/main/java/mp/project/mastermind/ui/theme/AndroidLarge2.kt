package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
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

class AndroidLarge2 {
    @Composable
    fun ArrowButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
        val image: Painter =
            painterResource(R.drawable.freccia) // Assicurati che freccia.png sia presente nelle risorse

        IconButton(
            onClick = onClick,
            modifier = modifier
                .requiredSize(31.dp)
                .rotate(degrees = -180f)
        ) {
            Image(
                painter = image,
                contentDescription = "Arrow Icon",
                modifier = Modifier.size(24.dp) // Modifica la dimensione dell'immagine se necessario
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
                        .offset(x = 111.dp,
                            y = 70.dp)
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                    ) {

                val numberOfBoxes = 5
                val spacingBetweenBoxes = 8.dp // Spaziatura tra le caselle

                LazyRow(
                    modifier = Modifier
                        .padding(horizontal = 0.dp) // Padding orizzontale per allineare al centro
                ) {
                    items(numberOfBoxes) { index ->
                        val boxId = "Box #$index"

                        Box(
                            modifier = Modifier
                                .padding(end = if (index < numberOfBoxes - 1) spacingBetweenBoxes else 0.dp)
                                .requiredWidth(width = 47.dp)
                                .requiredHeight(height = 43.dp)
                                .background(color = Color(0xffd9d9d9))
                        )
                    }
                }
            }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 206.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 275.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 112.dp,
                            y = 343.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 411.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 479.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 548.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 616.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 684.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 111.dp,
                            y = 138.dp
                        )
                        .requiredWidth(width = 267.dp)
                        .requiredHeight(height = 43.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 164.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 220.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 110.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 55.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 47.dp)
                            .requiredHeight(height = 43.dp)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 73.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 141.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 209.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 278.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 346.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 414.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 482.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 551.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 687.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 20.dp,
                            y = 620.dp
                        )
                        .requiredWidth(width = 66.dp)
                        .requiredHeight(height = 37.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 50.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 25.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 0.dp,
                                y = 21.dp
                            )
                            .requiredSize(size = 16.dp)
                            .clip(shape = CircleShape)
                            .background(color = Color(0xffd9d9d9))
                    )
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
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffe4ccff)),
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
                            y = 741.dp
                        )
                        .requiredWidth(width = 389.dp)
                        .requiredHeight(height = 43.dp)
                ) {//ARANCIONW
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffb4207)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 343.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
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
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffbf207)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 245.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff07ff5c)),
                        modifier = Modifier
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffb0707)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 98.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff07fbde)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 196.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff68fff)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 147.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
                    Button(
                        onClick = { },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff0c24f7)),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 49.dp,
                                y = 0.dp
                            )
                            .requiredWidth(width = 46.dp)
                            .requiredHeight(height = 43.dp)
                    ) { }
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
    }

//        @Preview(widthDp = 400, heightDp = 800)
//        @Composable
//        private fun AndroidLarge2Preview() {
//            AndroidLarge2(Modifier)
//        }







//class AndroidLarge2 {
////    enum class BoxColor {
////        DEFAULT,
////        ORANGE,
////        YELLOW,
////        GREEN,
////        RED,
////        BLUE,
////        PURPLE,
////        DARK_BLUE,
////        PINK,
////        BLACK,
////        LIGHT_BLUE
////    }
////    var boxColors by mutableStateOf<List<BoxColor>>(List(9) { BoxColor.DEFAULT })
////
////    fun changeBoxColors(color: BoxColor) {
////        val newColors = boxColors.toMutableList()
////        // Cambia i colori dei box nella sequenza desiderata
////        // Supponiamo che il clic su un colore cambi il primo box, poi il secondo, ecc.
////        for (i in newColors.indices) {
////            if (newColors[i] == BoxColor.DEFAULT) {
////                newColors[i] = color
////                break
////            }
////        }
////        // Aggiorna lo stato dei colori dei box
////        boxColors = newColors
////    }
//
//    @Composable
//    fun ArrowButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
//        val image: Painter = painterResource(R.drawable.freccia) // Assicurati che freccia.png sia presente nelle risorse
//
//        IconButton(
//            onClick = onClick,
//            modifier = modifier
//                .requiredSize(31.dp)
//                .rotate(degrees = -180f)
//        ) {
//            Image(
//                painter = image,
//                contentDescription = "Arrow Icon",
//                modifier = Modifier.size(24.dp) // Modifica la dimensione dell'immagine se necessario
//            )
//        }
//    }
//    @SuppressLint("NotConstructor")
//    @Composable
//    fun AndroidLarge2(modifier: Modifier = Modifier) {
//        val context = LocalContext.current
////        fun getColorValue(color: AndroidLarge2.BoxColor): Color {
////            return when (color) {
////                BoxColor.RED -> Color.Red
////                BoxColor.GREEN -> Color.Green
////                BoxColor.BLUE -> Color.Blue
////                BoxColor.ORANGE -> Color(0xfffb4207)
////                BoxColor.YELLOW -> Color.Yellow
////                BoxColor.PINK -> Color(0xfff68fff)
////                BoxColor.BLACK -> Color.Black
////                BoxColor.LIGHT_BLUE -> Color.Cyan
////                else -> {return Color.White}
////            }
////        }
//        Box(
//            modifier = modifier
//                .requiredWidth(width = 400.dp)
//                .requiredHeight(height = 800.dp)
//                .background(color = Color.White)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 412.dp)
//                    .requiredHeight(height = 800.dp)
//                    .background(color = Color(0xffb62fcc)))
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 70.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            )
//            {
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 206.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 275.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 112.dp,
//                        y = 343.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 411.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 479.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 548.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 616.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 684.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 111.dp,
//                        y = 138.dp)
//                    .requiredWidth(width = 267.dp)
//                    .requiredHeight(height = 43.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 164.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 220.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 110.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 55.dp,
//                            y = 0.dp)
//                        .requiredWidth(width = 46.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .requiredWidth(width = 47.dp)
//                        .requiredHeight(height = 43.dp)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 73.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 141.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 209.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 278.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 346.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 414.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 482.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 551.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 687.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp,
//                        y = 620.dp)
//                    .requiredWidth(width = 66.dp)
//                    .requiredHeight(height = 37.dp)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 50.dp,
//                            y = 0.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 25.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//                Box(
//                    modifier = Modifier
//                        .align(alignment = Alignment.TopStart)
//                        .offset(x = 0.dp,
//                            y = 21.dp)
//                        .requiredSize(size = 16.dp)
//                        .clip(shape = CircleShape)
//                        .background(color = Color(0xffd9d9d9)))
//            }
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 136.dp,
//                        y = 9.dp
//                    )
//                    .requiredWidth(width = 212.dp)
//                    .requiredHeight(height = 37.dp)
//                    .clip(shape = RoundedCornerShape(18.dp))
//                    .background(color = Color(0xffd9d9d9))
//            ) {
//                Button( //mastermind
//                    onClick = {
////                val intent = Intent(context, GameActivity::class.java)
////                context.startActivity(intent) devo mettere la soluzione qua sotto
//                    },
//                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffe4ccff)),
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    Text("MASTERMIND", color = Color.White)
//                }
//            }
//
////            fun ColorButton(
////                color: BoxColor,
////                onClick: (BoxColor) -> Unit
////            ) {
////                Button(
////                    onClick = { onClick(color) },
////                    colors = ButtonDefaults.buttonColors(backgroundColor = getColorValue(color)),
////                    modifier = Modifier
////                        .requiredWidth(width = 46.dp)
////                        .requiredHeight(height = 43.dp)
////                ) { /* Contenuto del pulsante */ }
////            }
//
////            @Composable
////            fun ColoredBoxes(boxColors: List<BoxColor>) {
////                Row {
////                    boxColors.forEach { color ->
////                        Box(
////                            modifier = Modifier
////                                .requiredWidth(width = 47.dp)
////                                .requiredHeight(height = 43.dp)
////                                .background(getColorValue(color))
////                        ) { /* Contenuto del box */ }
////                    }
////                }
// //           }
//
////            @Composable
////            fun ColorGame() {
////                var boxColors by remember { mutableStateOf(List(9) { BoxColor.DEFAULT }) }
////
////                Row {
////                    listOf(
////                        BoxColor.ORANGE,
////                        BoxColor.BLACK,
////                        BoxColor.YELLOW,
////                        BoxColor.GREEN,
////                        BoxColor.RED,
////                        BoxColor.LIGHT_BLUE,
////                        BoxColor.PURPLE,
////                        BoxColor.DARK_BLUE,
////                        BoxColor.PINK
////                    ).forEach { color ->
////                        ColorButton(color = color) { selectedColor ->
////                            val newColors = boxColors.toMutableList()
////                            for (i in newColors.indices) {
////                                if (newColors[i] == BoxColor.DEFAULT) {
////                                    newColors[i] = selectedColor
////                                    break
////                                }
////                            }
////                            boxColors = newColors
////                        }
////                    }
////
////                    ColoredBoxes(boxColors = boxColors)
////                }
// //          }
//            ArrowButton(
//                onClick = {
//                    val intent = Intent(context, MainActivity::class.java)
//                    context.startActivity(intent)
//                },
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(x = 20.dp, y = 22.dp)
//            )
//        }
//    }
//
//    @Preview(widthDp = 400, heightDp = 800)
//    @Composable
//    private fun AndroidLarge2Preview() {
//        AndroidLarge2(Modifier)
//    }
//
//}