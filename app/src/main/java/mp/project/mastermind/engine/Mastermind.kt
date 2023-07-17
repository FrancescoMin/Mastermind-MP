package mp.project.mastermind.engine

import android.content.Context
import android.util.Log
import android.widget.Chronometer
import androidx.compose.runtime.mutableStateListOf
import mp.project.mastermind.models.*
import java.io.File
import android.app.Service

class Mastermind (context: Context, nAtts: Int, dimAtts: Int, nColors: Int, hardmode: Boolean){

    private var nAtts: Int
    private var dimAtts: Int
    private var nColors: Int

    //plancia di gioco
    private var attempts = mutableStateListOf<Attempt>()
    private var hints = mutableStateListOf<Hint>()
    private var secret: SecretCode
    private var palette: ColorCol

    //valori di controllo di gioco
    private var usedAtts = 0
    //il timer sarà l'ultima cosa che implementerò in questa classe
    private var time : Chronometer

    init{
        //generazione campo di gioco
        if(nAtts >= 10 && dimAtts > 4 && nColors >= 6){
            this.nAtts = nAtts
            this.dimAtts = dimAtts
            this.nColors = nColors

            for(i in 0 until this.nAtts) {
                attempts.add(Attempt(dimAtts))
                hints.add(Hint(dimAtts))
            }
            secret = SecretCode(dimAtts, hardmode)
            palette = ColorCol(nColors)
            time = Chronometer(context)

            Log.d("Mastermind", "Inizializzazione avvenuta con successo")

        }else{
            throw Exception("Valori di inizializzazione non validi")
        }
    }

    private fun secretGenerator(){
        //generatore di codici
    }

    fun checkAttempt(){
        //check del tentativo e generazione suggerimenti
    }

    fun save(){
        //salvataggio del gioco in corso

    }

    fun endgame(){
        //salvataggio in database dell'esito della partita
    }

    fun move(){
        //interazione tra colonna colori e riga tentativo
    }

    companion object{
        fun load(savefile: File){
            //caricamento da file di salvataggio
        }
    }




}