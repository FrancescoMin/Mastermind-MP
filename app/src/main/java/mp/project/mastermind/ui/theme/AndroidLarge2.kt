package mp.project.mastermind.ui.theme

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import mp.project.mastermind.MainActivity
import mp.project.mastermind.R

class AndroidLarge2{

    //Una mappa che associa quadretto a colore
    private val boxColors = mutableStateMapOf<String,Color>()
    private val checkColors = mutableStateMapOf<Int,Color>()
    private val appoggioCheckColors = mutableStateOf(0)
    private val colorNames = mapOf(
        R.color.arancio to "Arancio",
        R.color.giallo to "Giallo",
        R.color.verde to "Verde",
        R.color.rossa to "Rosso",
        R.color.cyan to "Cyan",
        R.color.rosa to "Rosa",
        R.color.blu to "Blu",
    )

    //genera soluzione della partita
    val randomColors = generateRandomColorsArray()

    //lo usiamo insieme al boxId per tenere traccia del quadretto a cui ci troviamo
    private var box = mutableStateOf(0)

    //per fare il check del mastermind,
    private var mastermindPressed = mutableStateOf(true)

    private var changedColor =  mutableStateOf(false)

    //per tenere traccia in quale riga siamo
    private var row = mutableStateOf(0)

    fun colorChange(id: String, color : Color){

        //colora il quadretto va avanti di uno
        if(mastermindPressed.value) {
            boxColors[id] = color
            box.value++

            if(changedColor.value || boxColors["Box #${box.value}"] != Color(0xffd9d9d9)){
                //println("Ci risiamo ecco: Box #${box.value} poi ecco ${boxColors["Box #${box.value+1}"] != Color(0xffd9d9d9)}  ")

                while(boxColors.containsKey("Box #${box.value}") && boxColors["Box #${box.value}"] != Color(0xffd9d9d9)){
                    box.value++
                }
                changedColor.value = false
            }

            //se abbiamo riempito tutte e 5 le caselle, blocca l'avanzamento
            if(box.value %5 == 0 && box.value != 0){
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
        var minutes = remember {mutableStateOf(0)}
        var seconds = remember {mutableStateOf(0)}

        LaunchedEffect(isPaused.value) {
            if (!isPaused.value) {


                while (true) {
                    delay(1000) // attendi 1 secondo
                    seconds.value++

                    if (seconds.value >= 60) {
                        minutes.value++
                        seconds.value = 0
                    }
                    timerState.value = String.format("%02d:%02d", minutes.value, seconds.value)

                }
            }
        }

        Column(
            modifier = Modifier
                .requiredWidth(width = 70.dp)
                .requiredHeight(height = 37.dp)
                .offset(x=80.dp, y=21.dp)
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

    //qua bisognerà implementare la logica del controllo dei 5 quadretti, per adesso blocca semplicemente il gioco
    //per evitare che premendo colori a caso si vada a finire nelle righe dopo anche senza fare il check
    private fun checkMastermind() {

        if (box.value != 0 && box.value % 5 == 0 && mastermindPressed.value == false) {
            println("valore di boxvalue è : ${box.value}")
            println("valore di appoggio è : ${appoggioCheckColors.value}")

            mastermindPressed.value = true

            val mySet: MutableList<String> = mutableListOf()
            var positionMatchFound = false

            for(element in randomColors) {
                mySet.add(getColorHexFromName(element.second))
            }

            for(i in 1 until 6){
                val boxKey = "Box #${box.value-i}"
                val boxColorHex = boxColors[boxKey]?.toArgb()?.let { colorIntToHex(it)}
                val randomColorHex = getColorHexFromName(randomColors[5-i].second)

                if (boxColors[boxKey]?.let { colorToHex(it) } == randomColorHex) {
                    mySet.remove(boxColors[boxKey]?.let{colorToHex(it)})
                    checkColors[appoggioCheckColors.value] = Color(0xFF07FF5C)
                    appoggioCheckColors.value += 1
                    println("Sono VERDE per ${boxColors[boxKey]?.let { colorToHex(it)}}")
                }

            }

            for (i in 1 until 6) {
                val boxKey = "Box #${box.value - i}"
                val boxColorHex = boxColors[boxKey]?.toArgb()?.let { colorIntToHex(it) }
                val randomColorHex = getColorHexFromName(randomColors[5 - i].second)

                if(box.value-i >= 0 && boxColors[boxKey]?.let { colorToHex(it) } != randomColorHex && boxColors[boxKey]?.let { colorToHex(it) } in mySet){
                    println("Ho trovato ${boxColors[boxKey]?.let { colorToHex(it) }} ")
                    mySet.remove(boxColors[boxKey]?.let { colorToHex(it) })
                    checkColors[appoggioCheckColors.value] = Color(0xFFFBF207)
                    appoggioCheckColors.value += 1
                }
            }

            row.value += 1
        }


        //SI BUGGA SE CI AZZECCHI PERCHE E' PREVISTO CHE LI LA PARTITA FINISCA E BASTA
        if(appoggioCheckColors.value != row.value*5 && row.value%5 != 0) {
            appoggioCheckColors.value += 5 - appoggioCheckColors.value % 5
        }

        println("valore di appoggio adesso è : ${appoggioCheckColors.value}")
        println("valore di row adesso è : ${row.value}")


    }



    private fun colorIntToHex(colorInt: Int): String {
        return String.format("#%06X", 0xFFFFFF and colorInt)
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge2(modifier: Modifier = Modifier) {
        randomColors.forEach { (colorId, colorName) ->
            println("Generated color: $colorName (ID: $colorId)")
        }

        val temp = 0
        val context = LocalContext.current

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
                                        .clickable {
                                            val boxPosition =
                                                (rowIndex * numberOfBoxesPerRow) + index
                                            val startRange = row.value * 5
                                            val endRange = row.value*5 + 5

                                            if (boxPosition in startRange..endRange) {
                                                specialColorChange(boxId)
                                                println("DAJe")
                                            } else{
                                                println("Erroraccio qua boxPosition è ${boxId} mentre il range è ${startRange} - ${endRange}")
                                            }
                                        }
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

                                var checkColor by remember { mutableStateOf(Color(0xffd9d9d9)) }
                                checkColor = checkColors[(rowIndex * numberOfBoxesPerRow) + index] ?: Color(0xffd9d9d9)

                                Box(
                                    modifier = Modifier
                                        .padding(end = if (index < numberOfBoxesPerRow - 1) spacingBetweenBoxes else 0.dp)
                                        .requiredWidth(width = 16.dp)
                                        .requiredHeight(height = 16.dp)
                                        .clip(shape = CircleShape)
                                        .background(checkColor)

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
                    onClick = {  },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFFFB4207)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xffb62fcc)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFFFBF207)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFF07FF5C)) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF07FF5C)),
                    modifier = Modifier
                        .requiredWidth(width = 43.dp)
                        .requiredHeight(height = 43.dp)
                        .clip(shape = CircleShape)
                ) { }
                Button(
                    onClick = { colorChange("Box #" + box.value, Color(0xFFFB0707)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFF07FBDE)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFFF68FFF)) },
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
                    onClick = { colorChange("Box #" + box.value, Color(0xFF0C24F7)) },
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
                Button( //tasto di check line
                    onClick = {checkMastermind() },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("CHECK", color = Color.White)
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


            TimerScreen()

        }


    }

    private fun specialColorChange(s: String) {

        if(boxColors[s] != Color(0xffd9d9d9)) {
            mastermindPressed.value = true
            boxColors[s] = Color(0xffd9d9d9)
            if (box.value != row.value * 5 && row.value < 2) {
                box.value = s[s.length - 1].digitToInt()
            } else if (box.value != row.value * 5 && box.value != row.value * 5 + 5 && row.value >= 2 && (box.value/5)%2 != 0) {
                box.value = row.value * 5 + s[s.length - 1].digitToInt()%5
            } else if(box.value != row.value * 5 && box.value != row.value * 5  && row.value >= 2 && (box.value/5)%2 != 0){
                box.value = row.value * 5 + s[s.length - 1].digitToInt()
            } else if (box.value != row.value * 5 && row.value >= 2 && (box.value/5)%2 == 0 ){
                box.value = row.value * 5 + s[s.length - 1].digitToInt()%5

            }
            else{
                println("Non sono entrato in nessun if per boxvalue ${box.value}")
            }

            changedColor.value = true
        }
    }


    private fun getColorResourceId(color: Int): Int {
        return when (color) {
            1 -> R.color.arancio
            2 -> R.color.giallo
            3 -> R.color.verde
            4 -> R.color.rossa
            5 -> R.color.cyan
            6 -> R.color.rosa
            7 -> R.color.blu
            8 -> R.color.black
            else -> throw IllegalArgumentException("Invalid color: $color")
        }
    }
    fun generateRandomColorsArray(size: Int = 5): Array<Pair<Int, String>> {
        return Array(size) { getRandomColorResourceId() }
    }
    // Funzione per ottenere un colore casuale dal set predefinito
    fun getRandomColorResourceId(): Pair<Int, String> {
        val colors = listOf(
            R.color.arancio,
            R.color.giallo,
            R.color.verde,
            R.color.rossa,
            R.color.cyan,
            R.color.rosa,
            R.color.blu
        )
        val randomColor = colors.random()
        val colorName = colorNames[randomColor] ?: "Sconosciuto"
        return randomColor to colorName
    }

    fun getColorHexFromName(colorName: String): String {
        return when (colorName) {
            "Arancio" -> "#FFA500"
            "Giallo" -> "#FFFF00"
            "Verde" -> "#008000"
            "Rosso" -> "#FF0000"
            "Cyan" -> "#00FFFF"
            "Rosa" -> "#FF69B4"
            "Blu" -> "#0000FF"
            "Viola" -> "#B81ECC"

            else -> throw IllegalArgumentException("Colore non valido: $colorName")
        }
    }

    fun colorToHex(color: Color): String {
        return when {
            color == Color(0.9647059f, 0.56078434f, 1.0f, 1.0f) -> "#FF69B4" // Rosa
            color == Color(0.9843137f, 0.02745098f, 0.02745098f, 1.0f) -> "#FF0000" // Rosso
            color == Color(0.02745098f, 1.0f, 0.36078432f, 1.0f) -> "#008000" // Verde
            color == Color(0.047058824f, 0.14117648f, 0.96862745f, 1.0f) -> "#0000FF" // Blu
            color == Color(0.02745098f, 0.9843137f, 0.87058824f, 1.0f) -> "#00FFFF" // Cyan
            color == Color(0.9843137f, 0.9490196f, 0.02745098f, 1.0f) -> "#FFFF00" // Giallo
            color == Color(0.7137255f, 0.18431373f, 0.8f, 1.0f) -> "#B81ECC" // Viola
            color == Color(0.9843137f, 0.25882354f, 0.02745098f, 1.0f) -> "#FFA500" // Arancione
            else -> throw IllegalArgumentException("Colore non valido")
        }
    }



    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge2Preview() {
        AndroidLarge2(Modifier)
    }
}





