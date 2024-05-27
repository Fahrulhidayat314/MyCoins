package com.example.macoin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Savings(
    val name: String,
    val amount: Int,
    val details: String
) : Parcelable