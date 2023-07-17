package mp.project.mastermind.models

class CodiceSegreto(n: Int, flag: Boolean = false) : RigaColori(n) {
    private var visibile = false
    private var modDifficile = flag

    fun isVisibile(): Boolean{
        return visibile
    }

    fun setVisibile(v: Boolean){
        if(!modDifficile)
            visibile = v
    }

    fun isDifficile(): Boolean{
        return modDifficile
    }

    fun setDifficile(v: Boolean){
        modDifficile = v
    }
}