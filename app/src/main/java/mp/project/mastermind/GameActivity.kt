package mp.project.mastermind

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable


import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.em

import kotlin.math.min

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLarge2()
        }
    }
}
@Composable
fun arrowButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    val image: Painter = painterResource(R.drawable.freccia) // Assicurati che freccia.png sia presente nelle risorse

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
                .background(color = Color(0xffb62fcc)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 70.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        )
        {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 206.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 275.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 112.dp,
                    y = 343.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 411.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 479.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 548.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 616.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 684.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 138.dp)
                .requiredWidth(width = 267.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 164.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 220.dp,
                        y = 0.dp)
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 110.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 55.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .requiredWidth(width = 47.dp)
                    .requiredHeight(height = 43.dp)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 73.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 141.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 209.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 278.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 346.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 414.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 482.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 551.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 687.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 620.dp)
                .requiredWidth(width = 66.dp)
                .requiredHeight(height = 37.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp,
                        y = 0.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredSize(size = 16.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xffd9d9d9)))
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
                .offset(x = 5.dp,
                    y = 741.dp)
                .requiredWidth(width = 389.dp)
                .requiredHeight(height = 43.dp)
        ) {//ARANCIONW
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffb4207)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 343.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 294.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffbf207)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 245.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff07ff5c)),
                modifier = Modifier
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffb0707)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 98.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff07fbde)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 196.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff68fff)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 147.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff0c24f7)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 49.dp,
                        y = 0.dp)
                    .requiredWidth(width = 46.dp)
                    .requiredHeight(height = 43.dp)){ }
        }
        arrowButton(
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




//@Composable
//fun AndroidLarge2(modifier: Modifier = Modifier) {
//    val context = LocalContext.current
//    Box(
//        modifier = modifier
//            .requiredWidth(width = 390.dp)
//            .requiredHeight(height = 800.dp)
//            .background(color = Color.White)
//    ) {
//        Box(
//            modifier = Modifier
//                .requiredWidth(width = 412.dp)
//                .requiredHeight(height = 800.dp)
//                .background(color = Color(0xffb62fcc))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 70.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 55.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 110.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 206.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 206.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 206.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 275.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 275.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 275.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 343.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 343.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 343.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 411.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 411.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 411.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 479.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 479.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 479.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 548.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 548.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 548.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 616.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 616.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 616.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 684.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 684.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 684.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 166.dp,
//                    y = 138.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 221.dp,
//                    y = 138.dp
//                )
//                .requiredWidth(width = 46.dp)
//                .requiredHeight(height = 43.dp)
//                .background(color = Color(0xffd9d9d9))
//        )
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 111.dp,
//                    y = 138.dp
//                )
//                .requiredWidth(width = 211.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 164.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 47.dp)
//                    .requiredHeight(height = 43.dp)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 72.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 141.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 206.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 275.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 343.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 411.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 479.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 548.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 684.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 20.dp,
//                    y = 616.dp
//                )
//                .requiredWidth(width = 41.dp)
//                .requiredHeight(height = 37.dp)
//        ) {
//            Box(
//                modifier = Modifier
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 0.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 25.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//            Box(
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 0.dp,
//                        y = 21.dp
//                    )
//                    .requiredSize(size = 16.dp)
//                    .clip(shape = CircleShape)
//                    .background(color = Color(0xffd9d9d9))
//            )
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 136.dp,
//                    y = 9.dp
//                )
//                .requiredWidth(width = 212.dp)
//                .requiredHeight(height = 37.dp)
//                .clip(shape = RoundedCornerShape(18.dp))
//                .background(color = Color(0xffd9d9d9))
//        ) {
//            Button( //mastermind
//                onClick = {
////                val intent = Intent(context, GameActivity::class.java)
////                context.startActivity(intent) devo mettere la soluzione qua sotto
//                },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffe4ccff)),
//                modifier = Modifier.fillMaxSize()
//            ) {
//                Text("MASTERMIND", color = Color.White)
//            }
//        }
//        Box(
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(
//                    x = 15.dp,
//                    y = 744.dp
//                )
//                .requiredWidth(width = 334.dp)
//                .requiredHeight(height = 43.dp)
//        ) {
//            Button( //green
//                onClick = { },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff07ff5c)),
//                modifier = Modifier
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//            ) { }
//            Button( //red
//                onClick = { },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfffb0707)),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 192.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//            ) { }
//            Button( //pink
//                onClick = { },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xfff68fff)),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 288.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//            ) { }
//            Button(     //blue
//                onClick = { },
//                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xff0c24f7)),
//                modifier = Modifier
//                    .align(alignment = Alignment.TopStart)
//                    .offset(
//                        x = 96.dp,
//                        y = 0.dp
//                    )
//                    .requiredWidth(width = 46.dp)
//                    .requiredHeight(height = 43.dp)
//            ) { }
//        }
//
//        arrowButton(
//            onClick = {
//                val intent = Intent(context, MainActivity::class.java)
//                context.startActivity(intent)
//            },
//            modifier = Modifier
//                .align(alignment = Alignment.TopStart)
//                .offset(x = 20.dp, y = 22.dp)
//        )
//
//
//    }
//}
//
//    @Preview(widthDp = 390, heightDp = 800)
//    @Composable
//    private fun AndroidLarge2Preview() {
//        AndroidLarge2(Modifier)
//    }
//

