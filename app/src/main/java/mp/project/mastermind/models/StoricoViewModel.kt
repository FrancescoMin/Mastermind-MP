package mp.project.mastermind.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import mp.project.mastermind.database.DBStorico
import mp.project.mastermind.database.Storico
import mp.project.mastermind.database.StoricoRepository


//obiettivo è fornire dati all'interfaccia che possano sopravvivere
//ai cambiamenti, mezzo di comunicazione tra repository e UI
class StoricoViewModel (application: Application):AndroidViewModel(application){
    private val loadAll: LiveData<List<Storico>>
    private val repository:StoricoRepository
      init{
          val daoStorico= DBStorico.getInstance(application).daoStorico()
          repository=StoricoRepository(daoStorico)
          loadAll= repository.loadAll
        }
    fun addStorico(storico: Storico){
        viewModelScope.launch ( Dispatchers.IO ){
            repository.addStorico(storico)
        }
    }

}