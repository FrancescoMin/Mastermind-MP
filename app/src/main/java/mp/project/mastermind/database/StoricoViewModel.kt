package mp.project.mastermind.database
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData



//potrei non usare il viewModel dato che può benissimo essere stateless, tanto ho tutto nel db
//me lo riprendo quando mi serve, tanto non ho necessità di dati aggiornati dinamicamente

class StoricoViewModel(application: Application) : AndroidViewModel(application) {
    private val storicoDao: DaoStorico = DBStorico.getInstance(getApplication<Application?>().applicationContext).daoStorico()
    val allStorico: LiveData<List<Storico>> = storicoDao.loadAll()  //non uso repository

//    fun insert(storico: Storico) {
//        viewModelScope.launch {
//            storicoDao.insert(storico)
//        }
    }
