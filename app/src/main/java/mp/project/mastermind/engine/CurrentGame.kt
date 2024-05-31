package mp.project.mastermind.engine

import androidx.compose.ui.graphics.Color
import mp.project.mastermind.models.Game

class CurrentGame {
    var current: Game? = null
    var solution: List<List<Color>>? = null
   // var timer: StopWatch = StopWatch()


    companion object {
        private var mInstance: CurrentGame? = null

        @Synchronized
        fun getInstance(): CurrentGame {
            if (mInstance == null) {
                mInstance = CurrentGame()
            }
            return mInstance!!
        }
    }

    @JvmName("getCurrent1")
    fun getCurrent(): Game? {
        if (current == null) {
            current = Game()
        }
        return current!!
    }

}