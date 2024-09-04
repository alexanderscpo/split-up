package com.alexanderscpo.splitup.data.database.model

import androidx.room.PrimaryKey

data class Debt(
    @PrimaryKey(autoGenerate = true) val debtId: Int,
    val userId: Int,
    val total: Int
)
