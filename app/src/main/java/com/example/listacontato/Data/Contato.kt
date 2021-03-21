package com.example.listacontato.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contato(
    var nome : String? = null,
    var  numero : Int? = null,
    var  imagem : String? = null,
): Parcelable
