package mp.project.mastermind.models

import android.util.Log
import androidx.compose.runtime.mutableStateListOf

open class ColorRow (n: Int){
    protected val pawns = mutableStateListOf<Pawn?>()

    init {
        if(n >= 0) {
            repeat(n) {
                pawns.add(null)
            }
        }else{
            throw Exception("Index non valido")
        }
    }

     open fun setTasselloColor(index: Int, color: Pawn.Color) {
        if (index in 0 until pawns.size) {
            pawns[index]?.let {
                it.setColor(color)
            } ?: run {
                val pawn = Pawn()
                pawn.setColor(color)
                this.pawns[index] = pawn
                Log.d("RigaColori.setTasselloColor", "")
            }
        }else{
            Log.e("RigaColori.setTasselloColor", "Index non valido")
        }
    }

     open fun getTassello(index: Int): Pawn? {
        return if (index in 0 until pawns.size) {
            pawns[index]
        } else {
            null
        }
    }
}
