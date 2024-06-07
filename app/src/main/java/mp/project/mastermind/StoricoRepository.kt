package mp.project.mastermind



import androidx.lifecycle.LiveData
import mp.project.mastermind.database.DaoStorico
import mp.project.mastermind.database.Storico

class StoricoRepository(private val dao: DaoStorico) {

    val allStorico: LiveData<List<Storico>> = dao.loadAll()

    suspend fun insert(storico: Storico) {
        dao.insert(storico)
    }

    // Altre funzioni di accesso ai dati, se necessario
}
