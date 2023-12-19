package mp.project.mastermind.engine

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import mp.project.mastermind.models.*
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class Mastermind (nAtts: Int, dimAtts: Int, nColors: Int, hardmode: Boolean, flag: Int){

    //proprietà plancia di gioco
    private var nAtts: Int? = null
    private var dimAtts: Int? = null
    private var nColors: Int? = null

    //oggetti plancia di gioco
    private var attempts = mutableStateListOf<Attempt>()
    private var hints = mutableStateListOf<Hint>()
    private var secret: SecretCode? = null
    private var palette: ColorCol? = null

    //valori di controllo di gioco
    private var usedAtts = 0
    private var status: Int   //0 -> sconfitta; 1 -> vittoria; -1 -> in corso

    init {
        //generazione campo di gioco
        if (nAtts >= 10 && dimAtts > 4 && nColors >= 6) {
            this.nAtts = nAtts
            this.dimAtts = dimAtts
            this.nColors = nColors

            for (i in 0 until nAtts) {
                attempts.add(Attempt(dimAtts))
                hints.add(Hint(dimAtts))
            }
            secret = SecretCode() //(dimAtts, hardmode)
            palette = ColorCol(nColors)
            if(flag >= -1 && flag <= 1) {
                status = flag
                Log.d("Mastermind","Partita Caricata!")
            }else {
                status = -1
                Log.d("Mastermind","Nuova Partita!")
            }

            Log.d("Mastermind", "Inizializzazione avvenuta con successo")

        } else {
            throw Exception("Valori di inizializzazione non validi")
        }
    }

    fun checkAttempt() {
        //check del tentativo e generazione suggerimenti
    }

    fun endgame() {
        //salvataggio in database dell'esito della partita
    }

    fun move() {
        //interazione tra colonna colori e riga tentativo
    }

    fun load(f: File){
        /*
            metadata: nAtts, dimAtts, nColors, usedAtts, time, data
         */
        var metadata = mutableListOf<Int>()
        var attemptsdata = mutableListOf<Int>()
        var hintsdata = mutableListOf<Int>()
        var counter = 0

        f.forEachLine {
            when (counter) {
                0 -> {
                    //processare riga dei metadati
                }
                in 1 .. metadata[3] -> {
                    //righe dei tentativi
                }
                in metadata[3]+1 .. metadata[3]*2 -> {
                    //righe dei suggerimenti
                }
            }
            counter++
        }
    }

    @SuppressLint("SimpleDateFormat")
    fun save(){
        //Layout del file su github projects sezione Salvataggio Partite
        //generazione del nome del file
        var dateFormatter = SimpleDateFormat("ddMMyyyy")
        var current = Calendar.getInstance().time
        val dateString = dateFormatter.format(current)

        var c: Int = 0
        var filename: String
        do{
            filename = "${dateString}_${c}"
            c++
        }while(File(filename).exists())

        //creazione del file content
        dateFormatter = SimpleDateFormat("yyyy-MM-dd-HH-mm-ss")

        var secretSection = this.secret.toString()
        var attsSection = ""
        this.attempts.forEach {
            attsSection += "${it.toString()}\n"
        }
        var timeSection = ""    //valore corrente in secondi del timer di gioco
        var dateSection = dateFormatter.format(current)
        var statusSection = "$status"


        //scrittura del file content
        val endSection = "END"
        val f:File = File(filename)
        f.writeText("[secret]\n${secretSection}\n${endSection}\n")
        f.writeText("[attempts]\n${attsSection}\n${endSection}\n")
        f.writeText("[time]\n${timeSection}\n${endSection}\n")
        f.writeText("[date]\n${dateSection}\n${endSection}\n")
        f.writeText("[status]\n${statusSection}\n${endSection}\n")

        //scrittura in database
        //!!!!! non riesco ad ottenere qui l'application context da passare al DBStorico
    }
}