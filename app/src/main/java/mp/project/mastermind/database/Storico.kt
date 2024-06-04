package mp.project.mastermind.database

import androidx.compose.runtime.MutableState
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//le tabella del db

//questa è Game praticamente
@Entity
data class Storico(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name= "date") var date: String,       //formatted like yyyy-MM-dd
    @ColumnInfo(name= "version") var configuration: Array<Pair<Int, String>>,  //forse lista di stringhe
    @ColumnInfo(name= "result") var result: Boolean,        //see array of results
    @ColumnInfo(name= "attempts") var attempts: Int,     //tentativi
    @ColumnInfo(name= "time") var time: MutableState<String>           //intended in seconds
){
    override fun toString(): String {
        return """Id: $id,Date: $date,Config: $configuration,Res: $result,Atts: $attempts,Time: $time"""
    }
}