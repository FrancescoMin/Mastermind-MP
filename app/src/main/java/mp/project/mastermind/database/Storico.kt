package mp.project.mastermind.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
//le tabella del db

//questa è Game praticamente
@Entity
data class Storico (
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name= "date")var date: String,       //formatted like yyyy-MM-dd
    @ColumnInfo(name= "version")var configuration: String,  //forse lista di stringhe
    @ColumnInfo(name= "result")var result: Int,        //see array of results
    @ColumnInfo(name= "attempts")var attempts: Int,     //tentativi
    @ColumnInfo(name= "time")var time: Int           //intended in seconds
){
    override fun toString(): String {
        return """Id: $id,Date: $date,Config: $configuration,Res: $result,Atts: $attempts,Time: $time"""
    }
}