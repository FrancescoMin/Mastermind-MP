package mp.project.mastermind.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Storico (
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    @ColumnInfo(name= "version")var version: String,
    @ColumnInfo(name= "date")var date: String,       //formatted like yyyy-MM-dd
    @ColumnInfo(name= "result")var result: Int,        //see array of results
    @ColumnInfo(name= "attempts")var attempts: Int,
    @ColumnInfo(name= "time")var time: Int           //intended in seconds
){

}