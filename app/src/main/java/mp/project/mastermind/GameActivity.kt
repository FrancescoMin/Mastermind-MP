package mp.project.mastermind

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
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
fun AndroidLarge2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .requiredWidth(width = 390.dp)
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
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 206.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 206.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 206.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 275.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 275.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 275.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 343.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 343.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 343.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 411.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 411.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 411.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 479.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 479.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 479.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 548.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 548.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 548.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 616.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 616.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 616.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 684.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 684.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 684.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 166.dp,
                    y = 138.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 221.dp,
                    y = 138.dp)
                .requiredWidth(width = 46.dp)
                .requiredHeight(height = 43.dp)
                .background(color = Color(0xffd9d9d9)))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 111.dp,
                    y = 138.dp)
                .requiredWidth(width = 211.dp)
                .requiredHeight(height = 43.dp)
        ) {
            Box(
                modifier = Modifier
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
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 20.dp,
                    y = 72.dp)
                .requiredWidth(width = 41.dp)
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
                .requiredWidth(width = 41.dp)
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
                    y = 206.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 275.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 343.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 411.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 479.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 548.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 684.dp)
                .requiredWidth(width = 41.dp)
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
                    y = 616.dp)
                .requiredWidth(width = 41.dp)
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
        ColorAndPlacementVioletLeft(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 12.dp,
                    y = 11.923095703125.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 136.dp,
                    y = 9.dp)
                .requiredWidth(width = 212.dp)
                .requiredHeight(height = 37.dp)
                .clip(shape = RoundedCornerShape(18.dp))
                .background(color = Color(0xffd9d9d9)))
        Text(
            text = "MASTERMIND",
            color = Color(0xff7b24bf),
            textAlign = TextAlign.Center,
            lineHeight = 6.25.em,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 137.dp,
                    y = 10.dp)
                .requiredWidth(width = 208.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 124.dp,
                    y = 752.dp)
                .requiredWidth(width = 193.dp)
                .requiredHeight(height = 43.dp)
        ) {
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
    }
}

@Composable
fun ColorAndPlacementVioletLeft(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
            .clip(shape = RoundedCornerShape(topStart = 3.11513090133667.dp, bottomStart = 3.11513090133667.dp))
    ) {
        Image(      //TODO DA MODIFICARE IN BOTTONE
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "Vector 9",
            colorFilter = ColorFilter.tint(Color(0xff9747ff)),
            modifier = Modifier
                .fillMaxHeight()
                .requiredWidth(width = 24.dp)
                .rotate(degrees = 180f))
        Row(
            horizontalArrangement = Arrangement.spacedBy(5.191884517669678.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(2.076753854751587.dp))
                .background(color = Color(0xff9747ff))
                .padding(all = 6.23026180267334.dp)
        ) {
            Text(
                text = "Go Home",
                color = Color.White,
                lineHeight = 1.56.em,
                style = TextStyle(
                    fontSize = 9.345392227172852.sp,
                    fontWeight = FontWeight.Medium)
            )
        }
    }
}

@Preview(widthDp = 390, heightDp = 800)
@Composable
private fun AndroidLarge2Preview() {
    AndroidLarge2(Modifier)
}

//@Preview
//@Composable
//fun AppContent() {
//    var colorSelected by remember { mutableStateOf(false) }
//    var colors by remember { mutableStateOf(List(5) { Color(0xFFFFFFFF) }) }
//
//    MaterialTheme {
//        Surface(color = Color(0xFF40CF92)) {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(16.dp)
//            ) {
//                // Pausa Button
//                PauseButton()
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                // 10 Zone
//                repeat(10) {
//                    ZoneItem(
//                        onColorSelected = { index, color ->
//                            colors = colors.toMutableList().apply {
//                                this[index] = color
//                            }
//                        }
//                    )
//                    Spacer(modifier = Modifier.height(45.dp))
//                }
//
//                if (colorSelected) {
//                    SubmitButton(
//                        onClick = {
//                            // Handle submit button click here
//                        }
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun PauseButton() {
//    Button(
//        onClick = {
//            // Handle pause button click here
//        },
//        shape = RoundedCornerShape(8.dp),
//        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF66DFAB))
//    ) {
//        Icon(
//            imageVector = Icons.Default.Close,
//            contentDescription = "Pause Icon",
//            tint = Color.White,
//            modifier = Modifier.size(24.dp)
//        )
//        Spacer(modifier = Modifier.width(8.dp))
//        Text(
//            text = "Pause",
//            fontSize = 16.sp,
//            color = Color.White
//        )
//    }
//}
//
//@Composable
//fun ZoneItem(onColorSelected: (Int, Color) -> Unit) {
//    Row {
//        SmallRectangleWithHoles()
//        Spacer(modifier = Modifier.width(16.dp))
//        LargeRectangleWithHoles(
//            onColorSelected = { color ->
//                onColorSelected(0, color)
//            }
//        )
//    }
//}
//
//@Composable
//fun SmallRectangleWithHoles() {
//    Row(
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        repeat(5) {
//            LittleHole()
//            Spacer(modifier = Modifier.width(8.dp))
//        }
//    }
//}
//
//@Composable
//fun LargeRectangleWithHoles(onColorSelected: (Color) -> Unit) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        val colors = listOf(
//            Color.Red,
//            Color.Green,
//            Color.Blue,
//            Color.Yellow,
//            Color.Cyan
//        )
//        repeat(5) { index ->
//            val color = colors[index]
//            Hole(
//                //color = color,
//                onClick = {
//                    onColorSelected(color)
//                }
//            )
//            Spacer(modifier = Modifier.width(8.dp))
//        }
//    }
//}
//
//
//
//
//
//@Composable
//fun Hole(onClick: () -> Unit) {
//    Box(
//        modifier = Modifier
//            .size(30.dp)
//            .background(Color(0xFFE2E2E2), shape = RoundedCornerShape(4.dp))
//            .clickable {
//                onClick()
//            }
//    )
//}
//
//@Composable
//fun LittleHole() {
//    Box(
//        modifier = Modifier
//            .size(19.dp)
//            .background(Color(0xFFDEE4E1), shape = RoundedCornerShape(4.dp))
//    )
//}
//
//@Composable
//fun SubmitButton(onClick: () -> Unit) {
//    Button(
//        onClick = onClick,
//        modifier = Modifier
//            //.fillMaxWidth()
//            .padding(16.dp),
//        shape = RoundedCornerShape(8.dp),
//        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
//        enabled = true // Set this to false if the button should be disabled until all colors are set
//    ) {
//        Text(
//            text = "Submit",
//            fontSize = 16.sp,
//            color = Color.Black
//        )
//    }
//}
