package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title : String,
    val color: Int,
    val timestamp : Long,
    val content : String,
    @PrimaryKey val id : Int? = null
)


