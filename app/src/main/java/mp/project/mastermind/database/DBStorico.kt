package mp.project.mastermind.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
//questa classe contiene la tabella e il punto di accesso al server
@Database(entities = [Storico::class], exportSchema = false, version = 1)
abstract class DBStorico : RoomDatabase(){
    companion object{
       @Volatile
        private var db: DBStorico? = null   //Singleton

        fun getInstance(context: Context): DBStorico {
           val tempDb= db
            if(tempDb == null){
                db = Room.databaseBuilder(
                    context.applicationContext,
                    DBStorico::class.java,
                    "storico.db"
                ).build()
            }
            return db as DBStorico
        }
    }

    abstract fun daoStorico(): DaoStorico
}