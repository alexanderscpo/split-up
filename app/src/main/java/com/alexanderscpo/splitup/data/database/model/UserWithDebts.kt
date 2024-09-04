package com.alexanderscpo.splitup.data.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithDebts(
    @Embedded val user: User,
    @Relation(
        parentColumn = "userId",
        entityColumn = "debtId"
    )
    val debts: List<Debt>
)
