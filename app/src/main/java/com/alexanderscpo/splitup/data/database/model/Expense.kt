package com.alexanderscpo.splitup.data.database.model

import androidx.compose.runtime.Immutable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "gasto"
)
@Immutable
data class Expense (
    @PrimaryKey(autoGenerate = true) val expenseId: Int,
    @ColumnInfo("description") val description : String = "",
    @ColumnInfo(name= "cost") val cost : Int = 0
)