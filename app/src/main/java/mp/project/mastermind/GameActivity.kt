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
    private val androidLarge2 = AndroidLarge2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val number = intent.getIntExtra("number", 0)
        setContent {
            androidLarge2.AndroidLarge2(Modifier.fillMaxSize(), number,{ onBackPressed() } )
        }
    }
    override fun onBackPressed() {
        val message = getString(R.string.exit_dialog)
        val yes = getString(R.string.yes)
        val no = getString(R.string.no)

        AlertDialog.Builder(this)
            .setMessage(message)
            .setPositiveButton(yes) { _, _ ->
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            .setNegativeButton(no) { _, _ -> }
            .show()
    }
}
