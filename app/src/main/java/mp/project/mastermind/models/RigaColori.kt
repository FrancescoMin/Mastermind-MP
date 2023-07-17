package mp.project.mastermind.models

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

open class RigaColori (n: Int){
    protected val tasselli = mutableStateListOf<Tassello?>()

    init {
        if(n >= 0) {
            repeat(n) {
                tasselli.add(null)
            }
        }else{
            throw Exception("Index non valido")
        }
    }

     open fun setTasselloColor(index: Int, color: Tassello.Color) {
        if (index in 0 until tasselli.size) {
            tasselli[index]?.let {
                it.setColor(color)
            } ?: run {
                val tassello = Tassello()
                tassello.setColor(color)
                tasselli[index] = tassello
                Log.d("RigaColori.setTasselloColor", "")
            }
        }else{
            Log.e("RigaColori.setTasselloColor", "Index non valido")
        }
    }

     open fun getTassello(index: Int): Tassello? {
        return if (index in 0 until tasselli.size) {
            tasselli[index]
        } else {
            null
        }
    }
}
