package com.alexanderscpo.splitup.data.database.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class User(
    @PrimaryKey(autoGenerate = true) val userId: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "last_name") val lastName: String
)
