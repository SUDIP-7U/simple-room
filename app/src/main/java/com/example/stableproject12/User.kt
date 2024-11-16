package com.example.stableproject12

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid: Int = 0,
    @ColumnInfo(name = "Name")
    var name : String
)