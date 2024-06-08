package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import mp.project.mastermind.MainActivity
import mp.project.mastermind.R

class AndroidLarge5 {

    //Una mappa che associa quadretto a colore
    private val boxColors = mutableStateMapOf<String,Color>()

    //lo usiamo insieme al boxId per tenere traccia del quadretto a cui ci troviamo
    private var box = mutableStateOf(0)

    //per fare il check del mastermind,
    private var mastermindPressed = mutableStateOf(true)

    fun colorChange(id: String, color : Color){

        //colora il quadretto va avanti di uno
        if(mastermindPressed.value) {
            boxColors[id] = color
            box.value += 1

            //se abbiamo riempito tutte e 4 le caselle, blocca l'avanzamento
            if(box.value %4 == 0 && box.value != 0){
                mastermindPressed.value = false
            }
        }
        else{
            println("TOCCA PREME MASTERMIND PE ANNA AVANTI")
        }

    }
    @Composable
    fun TimerScreen() {
        var timerState = remember {mutableStateOf("") }
        var isPaused = remember { mutableStateOf(false) }

        LaunchedEffect(isPaused.value) {
            if (!isPaused.value) {
                var minutes = 0
                var seconds = 0

                while (true) {
                    delay(1000) // attendi 1 secondo
                    seconds++

                    if (seconds >= 60) {
                        minutes++
                        seconds = 0
                    }
                    timerState.value = String.format("%02d:%02d", minutes, seconds)

                }
            }
        }

        Column(
            modifier = Modifier
                .requiredWidth(width = 70.dp)
                .requiredHeight(height = 37.dp)
                .offset(x=80.dp, y=22.dp)
                .clip(shape = RoundedCornerShape(18.dp))
                .background(color = Color.White)
        )
        { //todo quando riclicco il timer si rinizializza
            Button(onClick = { isPaused.value = !isPaused.value },
                modifier = Modifier
                    .fillMaxSize()
                    .background(color=Color.White)
                )
            {
                Text(
                    text = timerState.value,
                    fontSize = 11.sp
                )
            }
    }
}
    @Composable
    fun ArrowButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
        val image: Painter =
            painterResource(R.drawable.freccia)

        IconButton(
            onClick = onClick,
            modifier = modifier
                .requiredSize(31.dp)
                .clip(CircleShape)
                .background(color = Color.White)
        ) {
            Image(
                painter = image,
                contentDescription = "Arrow Icon",
                modifier = Modifier.size(24.dp)
            )
        }
    }

    //qua bisognerà implementare la logica del controllo dei 4 quadretti, per adesso blocca semplicemente il gioco
    //per evitare che premendo colori a caso si vada a finire nelle righe dopo anche senza fare il check
    private fun checkMastermind() {
        if(box.value != 0 && box.value%4 == 0){
            mastermindPressed.value =true
        }
        else{
            println("TOCCA RIEMPIRE I QUADRETTI PRIMA DE FA MASTERMIND")
        }
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge5(modifier: Modifier = Modifier) {
        val temp = 0
        val context = LocalContext.current

        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
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
                val numberOfBoxesPerRow = 4
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

                                //Questo è l'identificatore univoco di ogni box
                                val boxId = "Box #${(rowIndex * numberOfBoxesPerRow) + index}"

                                //Questo è il colore di ogni box, all'inizio è default grigio
                                var boxColor by remember { mutableStateOf(Color(0xffd9d9d9)) }
                                boxColor = boxColors[boxId] ?: Color(0xffd9d9d9)

                                Box(
                                    modifier = Modifier
                                        .padding(end = if (index < numberOfBoxesPerRow - 1) spacingBetweenBoxes else 0.dp)
                                        .requiredWidth(width = 43.dp)
                                        .requiredHeight(height = 43.dp)
                                        .background(boxColor)
                                        .layoutId(boxId)
                                    // .clickable { colorChange("Box #"+box.value,Color.White )}  //se cliccato il box torna bianco non funziona


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
                val numberOfBoxesPerRow = 4
                val spacingBetweenBoxes = 5.dp // Spaziatura tra le caselle
// ...
                //box di check
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
                                var boxId = "Box #${(rowIndex * numberOfBoxesPerRow) + index}"

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
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 157.dp,
                        y = 21.dp
                    )
                    .requiredWidth(width = 212.dp)
                    .requiredHeight(height = 37.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffd9d9d9))
            ) {
                Button( //mastermind
                    onClick = {checkMastermind() },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("MASTERMIND", color = Color.White)
                }
            }

            //Qui ci sono tutte i colori da cliccare, ognuno alla onclick chiama changeColor passandogli il proprio colore
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 5.dp,
                        y = 750.dp
                    )
                    .requiredWidth(width = 389.dp)
                    .requiredHeight(height = 43.dp)
            )
            {//ARANCIONE
                Button(
                    onClick = { colorChange("Box #"+box.value, Color(0xFFFB4207) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFB4207)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xffb62fcc) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xFFFBF207) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFBF207)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xFF07FF5C) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF07FF5C)),
                    modifier = Modifier
                        .requiredWidth(width = 43.dp)
                        .requiredHeight(height = 43.dp)
                        .clip(shape = CircleShape)
                ) { }
                Button(
                    onClick = { colorChange("Box #"+box.value, Color(0xFFFB0707) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFB0707)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xFF07FBDE) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF07FBDE)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xFFF68FFF) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF68FFF)),
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
                    onClick = { colorChange("Box #"+box.value, Color(0xFF0C24F7) ) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0C24F7)),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 49.dp,
                            y = 0.dp
                        )
                        .requiredWidth(width = 43.dp)
                        .requiredHeight(height = 43.dp)
                        .clip(shape = CircleShape)
                ) {}
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 265.dp,
                        y = 670.dp
                    )
                    .requiredWidth(width = 120.dp)
                    .requiredHeight(height = 37.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffd9d9d9))
            ) {
                Button( //mastermind
                    onClick = {checkMastermind() },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(stringResource(id = R.string.check), color = Color.White)
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

        TimerScreen()
    }

    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge5Preview() {
        AndroidLarge5(Modifier)
    }
}