package mp.project.mastermind.models

import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mp.project.mastermind.database.Storico
import mp.project.mastermind.database.StoricoRepository
import java.text.SimpleDateFormat
import java.util.Date

class GameViewModel(private val repository: StoricoRepository) : ViewModel() {

    val allStorico: LiveData<List<Storico>> = repository.loadAll

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd")
        return dateFormat.format(Date())
    }

    fun saveGame(randomColors: Array<Pair<Int, String>>, allBoxesAreGreen: Boolean, row: Int, timerState: MutableState<String>) {
        val storico = Storico(
            date = getCurrentDate(),
            configuration = randomColors,
            result = allBoxesAreGreen,
            attempts = row,
            time = timerState
        )

        viewModelScope.launch {
            repository.addStorico(storico)
        }
        }

}
