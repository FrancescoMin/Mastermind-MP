package mp.project.mastermind.models

import androidx.compose.runtime.mutableStateListOf

class ColonnaColori(n: Int) {
    private val colors = mutableStateListOf<Tassello>()

    init {
        if(n < 0){
            throw Exception("Invalid dimension")
        }
        for (i in 0 until n) {
            //i = 0 -> Color.NONE, colore inutile nella colonna selettrice
            colors.add(Tassello(i+1))
        }
    }

    fun selectColor(index: Int): Tassello.Color?{
        return if(index in 0 until colors.size){
            colors[index].getColor()
        }else{
            null
        }
    }

}