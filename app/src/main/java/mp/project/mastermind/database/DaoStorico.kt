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

    @Insert     //qui fra parentesi posso specificare delle strategie di conflitto
    fun insert(s: Storico)

    @Update
    fun update(s: Storico)

    @Delete
    fun delete(s: Storico)

    @Query("SELECT * FROM Storico")
    fun loadAll(): LiveData<List<Storico>>

}
//repository si occupa di chiamare le funzioni delle dao