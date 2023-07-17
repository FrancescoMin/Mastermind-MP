package mp.project.mastermind.models

import android.util.Log

class Hint (n: Int) : ColorRow(n){

    override fun setTasselloColor(index: Int, color: Pawn.Color) {
        if(color == Pawn.Color.NONE || color == Pawn.Color.WHITE || color == Pawn.Color.BLACK){
            super.setTasselloColor(index, color)
        }else{
            Log.e("Suggerimento.setTasselloColor", "Colore non valido per i suggerimenti: $color")
        }
    }

}