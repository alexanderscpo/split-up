package com.alexanderscpo.splitup.data.database.model

import androidx.room.Entity

@Entity(primaryKeys = ["userId", "expenseId"])
data class ExpenseUserCrossRef(
    val userId: Int,
    val expenseId: Int
)
