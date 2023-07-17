package mp.project.mastermind.models

import android.util.Log
import androidx.compose.runtime.mutableStateListOf

class ColorCol(n: Int) {
    private val colors = mutableStateListOf<Pawn>()

    init {
        if(n < 0){
            throw Exception("Index non valido: $n")
        }
        for (i in 0 until n) {
            //i = 0 -> Color.NONE, colore inutile nella colonna selettrice
            colors.add(Pawn(i+1))
        }
    }

    fun selectColor(index: Int): Pawn.Color?{
        return if(index in 0 until colors.size){
            colors[index].getColor()
        }else{
            Log.e("ColonnaColori", "Index non valido: $index")
            null
        }
    }

}