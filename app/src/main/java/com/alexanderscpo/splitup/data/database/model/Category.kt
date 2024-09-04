package com.alexanderscpo.splitup.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense_category")
data class Category(
    @PrimaryKey(autoGenerate = true) val categoryId: Int,
    val name: String
)
