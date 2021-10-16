package com.example.recyclerview_charelmeysyanti_07

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Superhero(
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String,
): Parcelable
