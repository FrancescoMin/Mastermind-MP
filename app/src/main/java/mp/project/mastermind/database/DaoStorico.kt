package mp.project.mastermind.database

import androidx.room.*
//contiene i metodi per accedere al db
@Dao
interface DaoStorico {

    @Insert
    fun insert(s: Storico)

    @Update
    fun update(s: Storico)

    @Delete
    fun delete(s: Storico)

    @Query("SELECT * FROM Storico")
    fun loadAll(): Array<Storico>

}