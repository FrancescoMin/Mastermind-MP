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
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*

import kotlin.math.min

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppContent()
        }
    }
}
@Preview
@Composable
fun AppContent() {
    var colorSelected by remember { mutableStateOf(false) }
    var colors by remember { mutableStateOf(List(5) { Color(0xFFFFFFFF) }) }

    MaterialTheme {
        Surface(color = Color(0xFF40CF92)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Pausa Button
                PauseButton()

                Spacer(modifier = Modifier.height(16.dp))

                // 10 Zone
                repeat(10) {
                    ZoneItem(
                        onColorSelected = { index, color ->
                            colors = colors.toMutableList().apply {
                                this[index] = color
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(45.dp))
                }

                if (colorSelected) {
                    SubmitButton(
                        onClick = {
                            // Handle submit button click here
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun PauseButton() {
    Button(
        onClick = {
            // Handle pause button click here
        },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF66DFAB))
    ) {
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = "Pause Icon",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Pause",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}

@Composable
fun ZoneItem(onColorSelected: (Int, Color) -> Unit) {
    Row {
        SmallRectangleWithHoles()
        Spacer(modifier = Modifier.width(16.dp))
        LargeRectangleWithHoles(
            onColorSelected = { color ->
                onColorSelected(0, color)
            }
        )
    }
}

@Composable
fun SmallRectangleWithHoles() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(5) {
            LittleHole()
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}

@Composable
fun LargeRectangleWithHoles(onColorSelected: (Color) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        val colors = listOf(
            Color.Red,
            Color.Green,
            Color.Blue,
            Color.Yellow,
            Color.Cyan
        )
        repeat(5) { index ->
            val color = colors[index]
            Hole(
                //color = color,
                onClick = {
                    onColorSelected(color)
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}





@Composable
fun Hole(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(30.dp)
            .background(Color(0xFFE2E2E2), shape = RoundedCornerShape(4.dp))
            .clickable {
                onClick()
            }
    )
}

@Composable
fun LittleHole() {
    Box(
        modifier = Modifier
            .size(19.dp)
            .background(Color(0xFFDEE4E1), shape = RoundedCornerShape(4.dp))
    )
}

@Composable
fun SubmitButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            //.fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
        enabled = true // Set this to false if the button should be disabled until all colors are set
    ) {
        Text(
            text = "Submit",
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}
