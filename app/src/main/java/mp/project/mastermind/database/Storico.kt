package mp.project.mastermind.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Storico (
    @PrimaryKey(autoGenerate = true) var id: Int,
    var version: String,
    var date: String,       //formatted like yyyy-MM-dd
    var result: Int,        //see array of results
    var attempts: Int,
    var time: Int           //intended in seconds
){
    constructor(
        version: String,
        date: String,
        result: Int,
        attempts: Int,
        time: Int
    ) : this(0,version,date,result,attempts,time)

}