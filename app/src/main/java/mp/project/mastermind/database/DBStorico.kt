package mp.project.mastermind.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Storico::class], version = 1)
abstract class DBStorico : RoomDatabase(){
    companion object{
        private var db: DBStorico? = null   //Singleton

        fun getInstance(context: Context): DBStorico {
            if(db == null){
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