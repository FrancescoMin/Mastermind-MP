package mp.project.mastermind.engine

import java.io.File

class Savefile(path : String){

    private val f: File

    init{
        f = File(path)
    }

    fun load(){
        var metadata: MutableList<Int>
        var attemptsdata: MutableList<Int>
        var hintsdata: MutableList<Int>

    }

    fun save(){

    }
}