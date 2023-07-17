package mp.project.mastermind.models

import android.util.Log

class Suggerimento (n: Int) : RigaColori(n){

    override fun setTasselloColor(index: Int, color: Tassello.Color) {
        if(color == Tassello.Color.NONE || color == Tassello.Color.WHITE || color == Tassello.Color.BLACK){
            super.setTasselloColor(index, color)
        }else{
            Log.e("Suggerimento.setTasselloColor", "Colore non valido per i suggerimenti: $color")
        }
    }

}