package mp.project.mastermind.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

//contiene i metodi per accedere al db e qui avremo le query
@Dao
interface DaoStorico {

    @Insert
    fun insert(s: Storico)

    @Update
    fun update(s: Storico)

    @Delete
    fun delete(s: Storico)

    @Query("SELECT * FROM Storico")
    fun loadAll(): LiveData<List<Storico>>

    @Query("SELECT * FROM Storico ORDER BY id DESC LIMIT 1")
    abstract fun getLastInserted():  LiveData<List<Storico>>

    companion object {
        fun insert(storico: Storico) {

        }
    }

}
//repository si occupa di chiamare le funzioni delle dao