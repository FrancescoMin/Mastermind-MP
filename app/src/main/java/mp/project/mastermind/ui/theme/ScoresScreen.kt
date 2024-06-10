package mp.project.mastermind.ui.theme

import  android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import mp.project.mastermind.MainActivity
import mp.project.mastermind.R
import mp.project.mastermind.database.StoricoViewModel
import mp.project.mastermind.database.StoricoViewModelFactory

class ScoresScreen {
    @SuppressLint("NotConstructor")
    @Composable
    fun AndroidLarge4(modifier: Modifier = Modifier) {
        println("sono dentro android4")
        val application = LocalContext.current.applicationContext
        val context = LocalContext.current
        println(application)
        println(context)
        val viewModel = ViewModelProvider(
            context as ViewModelStoreOwner,
            StoricoViewModelFactory(application as Application)
        )[StoricoViewModel::class.java]
        val storicoList by viewModel.allStorico.observeAsState(emptyList())
        println(storicoList.toString())
        Log.w("XXX", storicoList.toString())
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 99.dp,
                        y = 589.dp
                    )
                    .requiredWidth(width = 203.dp)
                    .requiredHeight(height = 59.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color(0xffb62fcc))
            ) {
                Button(
                    onClick = {
                        val intent = Intent(context, MainActivity::class.java)
                        context.startActivity(intent)
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Text("OK", color = Color.White)
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 91.dp,
                        y = 47.dp
                    )
                    .requiredWidth(width = 219.dp)
                    .requiredHeight(height = 65.dp)
                    .clip(shape = RoundedCornerShape(18.dp))
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.scores),
                color = Color(0xff7b24bf),
                textAlign = TextAlign.Center,
                lineHeight = 6.25.em,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 96.dp,
                        y = 61.dp
                    )
                    .requiredWidth(width = 208.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 49.dp,
                        y = 132.dp
                    )
                    .requiredWidth(width = 302.dp)
                    .requiredHeight(height = 437.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(color = Color.White)
            ) {
                if (storicoList.isNotEmpty()) {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp)
                    ) {
                        items(storicoList) { storico ->
                            Box(
                                modifier = Modifier
                                    .padding(4.dp)
                                    .clip(shape = RoundedCornerShape(10.dp))
                                    .background(color = Color.LightGray)
                                    .padding(8.dp)
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = storico.toString(),
                                    style = TextStyle(color = Color.Black),
                                    modifier = Modifier
                                        .padding(4.dp)
                                )
                            }
                        }
                    }
                } else {
                    Text(
                        text = stringResource(id = R.string.DB),
                        style = TextStyle(color = Color.Black),
                        modifier = Modifier
                            .align(alignment = Alignment.Center)
                            .padding(16.dp)
                    )
                }
            }
        }
    }

    @Preview(widthDp = 400, heightDp = 800)
    @Composable
    private fun AndroidLarge4Preview() {
        AndroidLarge4(Modifier)
    }
}