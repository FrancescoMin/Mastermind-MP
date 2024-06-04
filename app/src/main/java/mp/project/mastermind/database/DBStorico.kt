package mp.project.mastermind.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
@Database(entities = [Storico::class], exportSchema = false, version = 1)
@TypeConverters(Converters::class)
abstract class DBStorico : RoomDatabase(){
    companion object{
        @Volatile
        private var db: DBStorico? = null   //Singleton

        fun getInstance(context: Context): DBStorico {
            if(db == null){
                synchronized(this) {
                    if(db == null){
                        db = Room.databaseBuilder(
                            context.applicationContext,
                            DBStorico::class.java,
                            "mastermindDB.db"
                        ).build()
                    }
                }
            }
            println(db)
            return db!!
        }
    }

    abstract fun daoStorico(): DaoStorico
}