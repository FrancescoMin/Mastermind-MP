package mp.project.mastermind.database

import androidx.lifecycle.LiveData

class StoricoRepository(private val StoricoDao: DaoStorico) {       //classe che astrae l'accesso a piu origini dati

    val loadAll: LiveData<List<Storico>> = StoricoDao.loadAll()

    suspend fun addStorico(storico: Storico){
        StoricoDao.insert(storico)
    }

}