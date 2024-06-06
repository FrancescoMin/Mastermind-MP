package mp.project.mastermind.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Storico::class], exportSchema = false, version = 12)
@TypeConverters(Converters::class)
abstract class DBStorico : RoomDatabase(){
    companion object{
        @Volatile
        private var db: DBStorico? = null   //Singleton

        fun getInstance(context: Context): DBStorico {
            if(db == null){
                db = databaseBuilder(
                    context,
                    DBStorico::class.java,
                    "prova.db"
                )
                    .fallbackToDestructiveMigration()
                    .createFromAsset("prova.db")

                    .build()
            }
            println("this is db")
            println(db)
            return db as DBStorico
        }
        }


    abstract fun daoStorico(): DaoStorico
}