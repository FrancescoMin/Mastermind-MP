package mp.project.mastermind.models

class Tassello {
    // only way to get numerical value of color: Color.NONE.ordinal
    enum class Color {
        NONE, WHITE, YELLOW, RED, GREEN, LBLUE, ROSE, BROWN, BLACK;

        companion object{
            private val map = Color.values().associateBy { it.ordinal }
            infix fun from(value: Int): Color?{
                return map[value]
            }
        }
    }

    private var color = Color.NONE

    fun setColor(id : Color){
        color = id
    }

    fun getColor(): Color {
        return color
    }

}