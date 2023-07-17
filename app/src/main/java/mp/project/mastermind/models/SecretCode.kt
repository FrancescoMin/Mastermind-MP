package mp.project.mastermind.models

class SecretCode(n: Int, private var hardmode: Boolean = false) : ColorRow(n) {
    private var visible = false

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
}