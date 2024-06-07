package mp.project.mastermind.database


import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class StoricoViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(StoricoViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return StoricoViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}