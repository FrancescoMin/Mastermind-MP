package mp.project.mastermind.models

import androidx.compose.ui.graphics.Color

/*
class SecretCode(n: Int, private var hardmode: Boolean = false) : ColorRow(n) {
    private var visible = false

    init{
        if(n > 0) {
            //generazione del codice segreto
            val tmp = List(n) {Random.nextInt(Pawn.Color.WHITE.ordinal, Pawn.Color.BLACK.ordinal)}
            for (i in 0 until n){
                pawns.add(Pawn(tmp[i]))
            }
        }else{
            throw Exception("Dimensione non valida")
        }
    }

    fun isVisible(): Boolean{
        return visible
    }

    fun setVisible(v: Boolean){
        if(!hardmode)
            visible = v
    }

    fun isHardmode(): Boolean{
        return hardmode
    }

    fun setHardmode(v: Boolean){
        hardmode = v
    }

    override fun toString(): String {
        //Layout: visible_hardmode_superString
        return "${visible}_${hardmode}_${super.toString()}"
    }
}
*/

import kotlin.random.Random

class SecretCode {
    private val codeLength = 5
    private val totalColors = 8
    private val secretCode: MutableList<Int> = mutableListOf()

    init {
        generateSecretCode()
    }

    private fun generateSecretCode() {
        for (i in 0 until codeLength) {
            val randomColor = Random.nextInt(1, totalColors + 1) // generazione casuale di un colore da 1 a 8
            secretCode.add(randomColor)
        }
    }

    fun getSecretCode(): List<Int> {
        return secretCode.toList()
    }
}

fun main() {
    val mastermindSecretCode = SecretCode()
    val secretCode = mastermindSecretCode.getSecretCode()
    println("Il codice segreto generato è: $secretCode")
}