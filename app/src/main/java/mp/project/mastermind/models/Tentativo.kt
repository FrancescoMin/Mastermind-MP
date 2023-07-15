package mp.project.mastermind.models

//Idea sul funzionamento di Tentativo


import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class Tentativo {
    private val tasselli = mutableStateListOf<Tassello?>()
    private var currentTasselloIndex by mutableStateOf(0)

    init {
        repeat(5) {
            tasselli.add(null)
        }
    }

    fun setTasselloColor(color: Tassello.Color) {
        if (currentTasselloIndex in 0 until tasselli.size) {
            val tassello = Tassello()
            tassello.setColor(color)
            tasselli[currentTasselloIndex] = tassello
            currentTasselloIndex++
        }
    }

    fun getTassello(index: Int): Tassello? {
        return if (index in 0 until tasselli.size) {
            tasselli[index]
        } else {
            null
        }
    }
}
