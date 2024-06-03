package mp.project.mastermind


import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import mp.project.mastermind.ui.theme.AndroidLarge2

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {        //bundle è una classe di mappatura basata su coppie
        super.onCreate(savedInstanceState)
        setContent {
            AndroidLarge2().AndroidLarge2(Modifier.fillMaxSize())
        }
    }
    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Sei sicuro di voler uscire dalla schermata di gioco?")
            .setPositiveButton("Sì") {_, _ ->
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()}
            .setNegativeButton("No") { _, _ -> }
            .show()
    }

}
