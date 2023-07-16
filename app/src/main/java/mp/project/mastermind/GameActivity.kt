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
    MaterialTheme {
        Surface(color = Color(0xFF40CF92)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                // Pause Button
                PauseButton()

                Spacer(modifier = Modifier.height(16.dp))

                // 10 Zone
                for (i in 1..10) {
                    ZoneItem()
                    Spacer(modifier = Modifier.height(16.dp))
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
        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF40CF92))
    ) {
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = "Close Icon",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Close",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}

@Composable
fun ZoneItem() {
    Row {
        SmallRectangleWithHoles()
        Spacer(modifier = Modifier.width(16.dp))
        LargeRectangleWithHoles()
    }
}

@Composable
fun SmallRectangleWithHoles() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(5) {
                Hole()
            }
        }
    }
}

@Composable
fun LargeRectangleWithHoles() {
    Box(
        modifier = Modifier
            .size(160.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(5) {
                Hole()
            }
        }
    }
}

@Composable
fun Hole() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(Color(0xFF40CF92), shape = RoundedCornerShape(4.dp))
            .padding(4.dp)
    )
}
