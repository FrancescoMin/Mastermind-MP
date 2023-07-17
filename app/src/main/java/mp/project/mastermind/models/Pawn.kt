package mp.project.mastermind.models

class Pawn(id: Int = 0) {
    // only way to get numerical value of color: Color.NONE.ordinal
    enum class Color {
        NONE, WHITE, YELLOW, RED, GREEN, LBLUE, ROSE, BROWN, BLACK;

        //example use for getting YELLOW: Color from 2
        companion object{
            private val map = Color.values().associateBy { it.ordinal }
            infix fun from(value: Int): Color?{
                return map[value]
            }
        }
    }

    private var color = Color.NONE

    init {
        (Color from id) ?.let {
            color = it
        }
    }

    fun setColor(id : Color){
        color = id
    }

    fun setColor(id: Int){
        (Color from id) ?.let {
            color = it
        }
    }

    fun getColor(): Color {
        return color
    }

}