package mp.project.mastermind.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//le tabella del db

//questa è Game praticamente
@Entity(tableName = "Storico")
data class Storico(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name= "date") var date: String,       //formatted like yyyy-MM-dd
    @ColumnInfo(name= "configuration") var configuration: List<String>,  //forse lista di stringhe
    @ColumnInfo(name= "result") var result: String,        //see array of results
    @ColumnInfo(name= "attempts") var attempts: Int,     //tentativi
    @ColumnInfo(name= "time") var time: String          //intended in seconds
){
    override fun toString(): String {
        return """
        Numero Partita: $id
        Data: $date 
        Soluzione: $configuration
        Risultato: $result
        Tentativi: $attempts
        Tempo: $time""".trimIndent()
    }
}