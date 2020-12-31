package id.ac.amikom.coffeehouse.util

import android.content.SharedPreferences
import com.google.gson.Gson
// cobo cek neng kene ndill dipadake gone pak e po cobo
// uwes ndill, aku ming typo po?nembe ditmbhi opo
// paramater mu mau keluwihen siji karo ditamba null safe, tak run e nang hape sekojodipateni< NGEclose dewe trus
inline fun <reified T> SharedPreferences. getObject(key: String, defValue: T? = null): T?{
   val json = getString(key, null)
   val obj = Gson().fromJson(json, T::class.java)
   return if (obj == null) {
   defValue
   } else {
       obj
   }
}

fun SharedPreferences.Editor.putObject(key: String, value: Any?): SharedPreferences.Editor{
    val json = Gson().toJson(value)
    putString(key, json)
    return this
}