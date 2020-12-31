package id.ac.amikom.coffeehouse.data.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News (
        val judul: String = "",
        val link: String = "",
        val waktu: String = "",
        val poster: String = "",
        val tipe: String = "",
        val kutipan: String = ""
) : Parcelable