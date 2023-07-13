package mp.project.mastermind.models

class Tassello {
    // only way to get numerical value of color: Color.NONE.ordinal
    enum class Color {NONE, WHITE, YELLOW, RED, GREEN, LBLUE, ROSE, BROWN, BLACK}

    private var color = Color.NONE

    fun setColor(id : Color){
        color = id
    }

    fun getColor(): Color {
        return color
    }

}