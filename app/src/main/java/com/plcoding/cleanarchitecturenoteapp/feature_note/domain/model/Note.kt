package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import android.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*

@Entity
data class Note(
    val title : String,
    val color: Int,
    val timestamp : Long,
    val content : String,
    @PrimaryKey val id : Int? = null
) {
    companion object{
        val noteColors = listOf(RedOrange, BabyBlue, LightGreen, Violet, RedPink)
    }
}


