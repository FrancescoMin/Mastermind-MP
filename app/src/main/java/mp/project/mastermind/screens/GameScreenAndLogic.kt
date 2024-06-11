package mp.project.mastermind.screens

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.material.AlertDialog
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mp.project.mastermind.GameActivity
import mp.project.mastermind.R
import mp.project.mastermind.database.DBStorico
import mp.project.mastermind.database.Storico
import java.text.SimpleDateFormat
import java.util.Date

class GameScreenAndLogic {

    //variabili per colori box e cerchi di verifica
    private val boxColors = mutableStateMapOf<String, Color>()//colori dei box
    private val checkColors = mutableStateMapOf<Int, Color>()//colori dei cerchi di verifica

    //variabili per gestire i colori delle box
    var numberOfBoxesPerRow = 0//indica la modalità di gioco
    private val appoggioCheckColors = mutableStateOf(0)//colori dei cerchi di verifica
    private val colorNames = mapOf(
        R.color.arancio to "Arancio",
        R.color.giallo to "Giallo",
        R.color.verde to "Verde",
        R.color.rossa to "Rosso",
        R.color.cyan to "Cyan",
        R.color.rosa to "Rosa",
        R.color.blu to "Blu",
    )//mappa dei colori
    private var checkLine = mutableStateOf(true)//per bloccare la riga
    private var changedColor = mutableStateOf(false)//per verificare che colore box sia stato appena modificato
    private var row = mutableStateOf(0)//per tenere traccia in quale riga siamo
    private var box = mutableStateOf(0)//per tenere traccia del quadretto a cui ci troviamo



    //variabili per la soluzione della partita
    var randomColors: Array<Pair<Int, String>> = emptyArray()//soluzione partita sotto forma di colori
    val mySetSol: MutableList<String> = mutableListOf()//soluzione partita sotto forma di stringhe
    var supporto = false//gestione soluzione
    var _allBoxesAreGreen = mutableStateOf(false)//verifica vittoria


    //variabili di supporto
    var supportoDB = false//gestione db
    var disabilita = mutableStateOf(true)//blocca i bottoni

    //variabili per il timer di gioco
    var isPaused = mutableStateOf(false)
    var timerState = mutableStateOf("")



    //Funzione per cambiare i colori dei box
    fun colorChange(id: String, color: Color) {

        //colora il quadretto va avanti di uno
        if (checkLine.value) {
            boxColors[id] = color
            box.value++

            if (changedColor.value || boxColors["Box #${box.value}"] != Color(0xffd9d9d9)) {
                //println("Ci risiamo ecco: Box #${box.value} poi ecco ${boxColors["Box #${box.value+1}"] != Color(0xffd9d9d9)}  ")

                while (boxColors.containsKey("Box #${box.value}") && boxColors["Box #${box.value}"] != Color(
                        0xffd9d9d9
                    )
                ) {
                    box.value++
                }
                changedColor.value = false
            }

            //se abbiamo riempito tutte e 5 le caselle, blocca l'avanzamento
            if (box.value % numberOfBoxesPerRow == 0 && box.value != 0) {
                checkLine.value = false
            }
        } else {
            println("TOCCA PREME MASTERMIND PE ANNA AVANTI")
        }
    }



    @Composable
    fun TimerScreen() {
        var minutes = remember { mutableStateOf(0) }
        var seconds = remember { mutableStateOf(0) }
        LaunchedEffect(isPaused.value) {
            if (!isPaused.value) {
                while (true) {
                    delay(1000) // attendi 1 secondo
                    seconds.value++
                    if (seconds.value >= 60) {
                        minutes.value++
                        seconds.value = 0
                    }
                    timerState.value = String.format("%02d:%02d", minutes.value, seconds.value) }}}
        Column(
            modifier = Modifier
                .requiredWidth(width = 70.dp)
                .requiredHeight(height = 37.dp)
                .offset(x = 80.dp, y = 21.dp)
                .clip(shape = RoundedCornerShape(18.dp))
                .background(color = Color.White))
        {Button(
                onClick = { isPaused.value = !isPaused.value },
                enabled = disabilita.value,
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White))
            {Text(
                    text = timerState.value,
                    fontSize = 11.sp
                )}}}


    @Composable
    fun ArrowButton(onClick: () -> Unit,modifier: Modifier = Modifier) {
        val context = LocalContext.current
//        val activity = context as? Activity
//        val backPressedDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

        val image: Painter =
            painterResource(R.drawable.freccia)

        IconButton(
            onClick = { onClick() },
            enabled = disabilita.value,

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

    @Composable
    fun Successcheck() {
        println("immagine del successo")
        val context = LocalContext.current
        val image: Painter =
            painterResource(R.drawable.winner)
        // Mostra l'icona a schermo
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Transparent)
                .offset(
                    x = 100.dp,
                    y = 300.dp  //così è al centro
                )
        ) {
            Image(
                painter = image,
                contentDescription = "Win Image",
                modifier = Modifier.size(200.dp)

            )
        }
        Box(
            modifier = Modifier
                .background(Color.Transparent)
                .offset(
                    x = 150.dp,
                    y = 500.dp
                )
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 50.dp)

        ) {
            Button(
                onClick = {
                    val intent = Intent(context, GameActivity::class.java).apply{
                        putExtra("number", numberOfBoxesPerRow )
                    }
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
            ) {
                Text("NEW GAME", color = Color.White)
            }
        }

    }


    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy")
        return dateFormat.format(Date())
    }

    @Composable
    fun FailedCheck() {
        val context = LocalContext.current
        val image: Painter =
            painterResource(R.drawable.lose)
        // Mostra l'icona a schermo
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(Color.Transparent)
                .offset(
                    x = 100.dp,
                    y = 300.dp  //così è al centro
                )

        ) {
            Image(
                painter = image,
                contentDescription = "Lose Image",
                modifier = Modifier.size(200.dp)

            )
        }
        Box(
            modifier = Modifier
                .background(Color.Transparent)
                .offset(
                    x = 150.dp,
                    y = 500.dp  //così è al centro
                )
                .requiredWidth(width = 200.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Button(
                onClick = {
                    val intent = Intent(context, GameActivity::class.java).apply{
                        putExtra("number",numberOfBoxesPerRow)
                    }
                    context.startActivity(intent)
                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
            ) {
                Text("NEW GAME", color = Color.White)
            }
        }

    }

    private fun checkMastermind() {
        if (box.value != 0 && box.value % numberOfBoxesPerRow == 0 && checkLine.value == false) {
            checkLine.value = true
            var mySet: MutableList<String> = mutableListOf()
            for (element in randomColors) {
                mySet.add(getColorHexFromName(element.second))}
            for (i in 1 until numberOfBoxesPerRow +1) {
                val boxKey = "Box #${box.value - i}"
                val randomColorHex = getColorHexFromName(randomColors[numberOfBoxesPerRow - i].second)
                if (boxColors[boxKey]?.let { colorToHex(it) } == randomColorHex) {
                    mySet.remove(boxColors[boxKey]?.let { colorToHex(it) })
                    checkColors[appoggioCheckColors.value] = Color(0xFF07FF5C)
                    appoggioCheckColors.value += 1
                    // Verifica se tutti i box sono verdi
                    if (appoggioCheckColors.value % numberOfBoxesPerRow == 0 && appoggioCheckColors.value != 0) {
                        _allBoxesAreGreen.value = true}}}
            for (i in 1 until numberOfBoxesPerRow +1) {
                val boxKey = "Box #${box.value - i}"
                val randomColorHex = getColorHexFromName(randomColors[numberOfBoxesPerRow - i].second)
                if (box.value - i >= 0 && boxColors[boxKey]?.let { colorToHex(it) } != randomColorHex && boxColors[boxKey]?.let {
                        colorToHex(it)
                    } in mySet) {
                    mySet.remove(boxColors[boxKey]?.let { colorToHex(it) })
                    checkColors[appoggioCheckColors.value] = Color(0xFFFBF207)
                    appoggioCheckColors.value += 1}}
            row.value += 1 }
        //Qui si arrotonda appoggio per farlo passare alla riga successiva(QUI C ERA IL BUG DI GIADA DEL 02/06
        if (appoggioCheckColors.value != row.value * numberOfBoxesPerRow) {
            appoggioCheckColors.value += numberOfBoxesPerRow - appoggioCheckColors.value % numberOfBoxesPerRow
            println("Ho aggiunto ${appoggioCheckColors.value}")
        }

        println("valore di appoggio adesso è : ${appoggioCheckColors.value}")
        println("valore di row adesso è : ${row.value}")


    }




    @SuppressLint("NotConstructor", "CoroutineCreationDuringComposition")
    @Composable
    fun AndroidLarge2(modifier: Modifier = Modifier, number: Int,onBackPressed: () -> Unit) {
        numberOfBoxesPerRow = number
        if(!supporto) {
            randomColors = generateRandomColorsArray()
            supporto = true
        }

        randomColors.forEach { (colorId, colorName) ->
            println("Generated color: $colorName (ID: $colorId)")
        }
        val stringList: List<String> = randomColors.map {it.second}

        for (element in randomColors) {
            mySetSol.add(getColorHexFromName(element.second))
        }

        val temp = 0
        val context = LocalContext.current
        var isVisible by remember { mutableStateOf(false) }
        var buttonText by remember { mutableStateOf("MASTERMIND") }
        var textColor by remember { mutableStateOf(Color.Black) }
        val dismissDialog: () -> Unit = { isVisible = false }



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
                        ) { items(numberOfBoxesPerRow) { index ->
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
                                            val boxPosition = (rowIndex * numberOfBoxesPerRow) + index
                                            val startRange = row.value * numberOfBoxesPerRow
                                            val endRange =
                                                row.value * numberOfBoxesPerRow + numberOfBoxesPerRow

                                            if (boxPosition in startRange..endRange) {
                                                specialColorChange(boxId)
                                            } else {
                                                println("Errore boxPosition è ${boxId} mentre il range è ${startRange} - ${endRange}")
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
                                checkColor =
                                    checkColors[(rowIndex * numberOfBoxesPerRow) + index] ?: Color(
                                        0xffd9d9d9
                                    )

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
                    .align(Alignment.TopStart)
                    .offset(157.dp, 21.dp)
                    .requiredWidth(212.dp)
                    .requiredHeight(37.dp)
                    .clip(RoundedCornerShape(18.dp))
                    .background(Color(0xffd9d9d9))
            ) {
                Button(
                    onClick = {
                        isVisible = !isVisible
                        buttonText = "MASTERMIND"
                    },

                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = if (isVisible) Color(0xffd9d9d9) else Color(0xffb62fcc)
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(buttonText, color = Color.White, fontSize = 16.sp)
                }
            }

            if (isVisible) {
                AlertDialog(
                    onDismissRequest = dismissDialog,
                    confirmButton = {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .heightIn(min = 70.dp)  // Imposta un'altezza minima per il contenuto del popup
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center  // Centra verticalmente il contenuto
                        ) {
                            LazyRow(
                                modifier = Modifier
                                    .padding(horizontal = 13.dp, vertical = 8.dp)



                            ) {
                                items(numberOfBoxesPerRow) { index ->
                                    val boxColorSol = randomColors[index].second

                                    Box(
                                        modifier = Modifier
                                            .padding(end = if (index < numberOfBoxesPerRow - 1) 8.dp else 0.dp)
                                            .requiredWidth(43.dp)
                                            .requiredHeight(43.dp)
                                            .background(HexToColor(getColorHexFromName(boxColorSol)))
                                    )
                                }
                            }

                            Button(
                                onClick = dismissDialog
                            ) {
                                Text(text = "OK")
                            }
                        }
                    }
                )
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
                    onClick = { colorChange("Box #" + box.value, Color(0XFFFF6700)) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFFFF6700)),
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
                    onClick = { checkMastermind() },
                    enabled = disabilita.value,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xffb62fcc)),
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(stringResource(id = R.string.check), color = Color.White)
                }
            }
            ArrowButton(
                onClick= { onBackPressed() },
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 22.dp)
            )

            TimerScreen()

        }
        if (_allBoxesAreGreen.value) {
            println("sono entrato nel successo")
            isPaused.value = true
            disabilita.value = false
            Successcheck()
            while (box.value <= numberOfBoxesPerRow*10 -1)
                box.value++
            val storico = Storico(
                date = getCurrentDate(),
                configuration = stringList,
                result = _allBoxesAreGreen.value.toString(),
                attempts = row.value,
                time = timerState.value
            )
            if(!supportoDB) {
                val storicoDao = DBStorico.getInstance(context).daoStorico()
                // Creo un coroutine scope
                val scope = CoroutineScope(Dispatchers.Main)
                supportoDB = true


// Eseguo l'inserimento nel database in background
            scope.launch(Dispatchers.IO) {
                try {
                    storicoDao.insert(storico)
                    // Verifico che l'inserimento sia avvenuto
                    val storedStorico =
                        storicoDao.getLastInserted() // Implementa questa funzione per recuperare l'ultimo record inserito
                    if (storedStorico != null) {
                        println("Database Inserimento avvenuto con successo: $storedStorico")
                    } else {
                        println("Database Inserimento fallito")
                    }
                } catch (e: Exception) {
                    println("Database Errore durante l'inserimento: ${e.message}")
                }
            }
            }
        }
        if (box.value > numberOfBoxesPerRow*10 -1 && checkLine.value == true && _allBoxesAreGreen.value == false) {
            isPaused.value = true
            disabilita.value = false

            println("fallito")
            FailedCheck()
            val storico = Storico(
                date = getCurrentDate(),
                configuration = stringList,
                result = _allBoxesAreGreen.value.toString(),
                attempts = row.value,
                time = timerState.value
            )
            if(!supportoDB) {
                val storicoDao = DBStorico.getInstance(context).daoStorico()
                val scope = CoroutineScope(Dispatchers.Main)

// Eseguo l'inserimento nel database in background
                scope.launch(Dispatchers.IO) {
                    try {
                        storicoDao.insert(storico)
                        // Verifico che l'inserimento sia avvenuto
                        val storedStorico =
                            storicoDao.getLastInserted() // Implementa questa funzione per recuperare l'ultimo record inserito
                        if (storedStorico != null) {
                            println("Database Inserimento avvenuto con successo: $storedStorico")
                        } else {
                            println("Database Inserimento fallito")
                        }
                    } catch (e: Exception) {
                        println("Database Errore durante l'inserimento: ${e.message}")
                    }
                }
            }
//            StoricoRepository.addStorico(storico)
        }

    }


    private fun specialColorChange(s: String) {
        
        if (boxColors[s] != Color(0xffd9d9d9) &&
            s.substringAfter("#").toIntOrNull()?.let { index ->
                index in (row.value * numberOfBoxesPerRow) until (row.value * numberOfBoxesPerRow + numberOfBoxesPerRow)
            } == true) {
            checkLine.value = true
            boxColors[s] = Color(0xffd9d9d9)
            if (s.substringAfter("#").toIntOrNull()!! < box.value) {
                if (box.value != row.value * numberOfBoxesPerRow && row.value < 2) {
                    box.value = s[s.length - 1].digitToInt()
                } else if (box.value != row.value * numberOfBoxesPerRow && box.value != row.value * numberOfBoxesPerRow + numberOfBoxesPerRow && row.value >= 2 && (box.value / numberOfBoxesPerRow) % 2 != 0) {
                    if(s.substringAfter("#").toIntOrNull()!! < 10) {
                        box.value = row.value * numberOfBoxesPerRow + s[s.length - 1].digitToInt() % numberOfBoxesPerRow }
                    else {
                        box.value = row.value * numberOfBoxesPerRow + (s[s.length - 2].digitToInt()*10 + s[s.length - 1].digitToInt()) % numberOfBoxesPerRow } }
                else if (box.value != row.value * numberOfBoxesPerRow && box.value != row.value * numberOfBoxesPerRow && row.value >= 2 && (box.value / numberOfBoxesPerRow) % 2 != 0) {
                    println("3.sono entrato per boxvalue ${box.value}")
                    if(numberOfBoxesPerRow == 5)
                        box.value = row.value * numberOfBoxesPerRow + s[s.length - 1].digitToInt()
                    else if(numberOfBoxesPerRow == 4)
                        if(s.substringAfter("#").toIntOrNull()!! < 10) {
                            box.value = row.value * numberOfBoxesPerRow + s[s.length - 1].digitToInt() % numberOfBoxesPerRow }
                        else box.value = row.value * numberOfBoxesPerRow + (s[s.length - 2].digitToInt()*10 + s[s.length - 1].digitToInt()) % numberOfBoxesPerRow
                } else if (box.value != row.value * numberOfBoxesPerRow && row.value >= 2 && (box.value / numberOfBoxesPerRow) % 2 == 0) {
                    if(numberOfBoxesPerRow == 5)
                        box.value = row.value * numberOfBoxesPerRow + s[s.length - 1].digitToInt() % numberOfBoxesPerRow
                    else if(numberOfBoxesPerRow == 4)
                        if(s.substringAfter("#").toIntOrNull()!! < 10) {
                            box.value = row.value * numberOfBoxesPerRow + s[s.length - 1].digitToInt() % numberOfBoxesPerRow }
                    else box.value = row.value * numberOfBoxesPerRow + (s[s.length - 2].digitToInt() * 10 + s[s.length - 1].digitToInt()) % numberOfBoxesPerRow
                } /*else if(box.value == row.value*5 && box.value != 0 ){
                box.value = row.value*5 + s[s.length - 1].digitToInt()%5
            }*/
                else {
                    println("ATTENZIONE sono entrato in nessun if per boxvalue ${box.value}")
                    println("IL valore dell'infamotto è ${box.value}")
                }
            }
            println("IL valore dell'infamotto alla fine è ${box.value}")
            changedColor.value = true
        }
    }




    fun generateRandomColorsArray(size: Int = numberOfBoxesPerRow): Array<Pair<Int, String>> {
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
            "Arancio" -> "#FFFF6700"
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

    fun HexToColor(color: String): Color {
        return when {
            color ==  "#FF69B4"-> Color(0.9647059f, 0.56078434f, 1.0f, 1.0f) // Rosa
            color ==   "#FF0000"->Color(0.9843137f, 0.02745098f, 0.02745098f, 1.0f) // Rosso
            color ==   "#008000"->Color(0.02745098f, 1.0f, 0.36078432f, 1.0f) // Verde
            color ==  "#0000FF"-> Color(0.047058824f, 0.14117648f, 0.96862745f, 1.0f) // Blu
            color ==  "#00FFFF"->Color(0.02745098f, 0.9843137f, 0.87058824f, 1.0f)  // Cyan
            color ==   "#FFFF00" ->Color(0.9843137f, 0.9490196f, 0.02745098f, 1.0f)// Giallo
            color ==   "#B81ECC" -> Color(0.7137255f, 0.18431373f, 0.8f, 1.0f) // Viola
            color ==   "#FFFF6700" -> Color(1.0f, 0.40392157f, 0.0f, 1.0f) // Arancione
            else -> throw IllegalArgumentException("Colore non valido")
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
            color == Color(1.0f, 0.40392157f, 0.0f, 1.0f) -> "#FFFF6700" // Arancione
            else -> throw IllegalArgumentException("Colore non valido")
        }
    }
    private fun colorIntToHex(colorInt: Int): String {
        return String.format("#%06X", 0xFFFFFF and colorInt)
    }
}







