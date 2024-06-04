package mp.project.mastermind.database



import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.room.TypeConverter
import com.google.gson.Gson

class Converters {
    @TypeConverter
    fun fromPairArray(value: Array<Pair<Int, String>>?): String {
        return Gson().toJson(value)
    }

    @TypeConverter
    fun toPairArray(value: String): Array<Pair<Int, String>> {
        val listType = object : com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken<Array<Pair<Int, String>>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun fromMutableState(value: MutableState<String>): String {
        return value.value
    }

    @TypeConverter
    fun toMutableState(value: String): MutableState<String> {
        return mutableStateOf(value)
    }
}