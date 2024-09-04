package com.alexanderscpo.splitup.data.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.alexanderscpo.splitup.data.database.dao.ExpenseDao
import com.alexanderscpo.splitup.data.database.model.Expense

@Database(entities = [Expense::class], version = 1)
abstract class SplitUpDatabase : RoomDatabase() {
    abstract fun expenseDao(): ExpenseDao
}
