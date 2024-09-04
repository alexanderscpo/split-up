package com.alexanderscpo.splitup.data.database.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ExpenseWithUsers (
    @Embedded val expense: Expense,
    @Relation(
        parentColumn = "expenseId",
        entityColumn = "userId",
        associateBy = Junction(ExpenseUserCrossRef::class)
    )
    val users: List<User>
)
