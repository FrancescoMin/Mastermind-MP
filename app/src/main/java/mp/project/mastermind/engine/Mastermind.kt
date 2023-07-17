package mp.project.mastermind.engine

import android.content.Context
import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import mp.project.mastermind.models.*

class Mastermind (nAtts: Int, dimAtts: Int, nColors: Int, hardmode: Boolean){

    //stato di configurazione del motore di gioco
    private var initialized = false

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

    init {
        if(!initialized) {
            //generazione campo di gioco
            if (nAtts >= 10 && dimAtts > 4 && nColors >= 6) {
                this.nAtts = nAtts
                this.dimAtts = dimAtts
                this.nColors = nColors

                for (i in 0 until nAtts) {
                    attempts.add(Attempt(dimAtts))
                    hints.add(Hint(dimAtts))
                }
                secret = SecretCode(dimAtts, hardmode)
                palette = ColorCol(nColors)

                Log.d("Mastermind", "Inizializzazione avvenuta con successo")

            } else {
                throw Exception("Valori di inizializzazione non validi")
            }
        }else{
            Log.e("Mastermind", "Plancia già inizializzata, impossibile modificare i valori di gioco")
        }
    }

    fun checkAttempt() {
        //check del tentativo e generazione suggerimenti
    }

    fun endgame() {
        //salvataggio in database dell'esito della partita
        initialized = false
    }

    fun move() {
        //interazione tra colonna colori e riga tentativo
    }
}