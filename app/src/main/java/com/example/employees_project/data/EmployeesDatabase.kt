package com.example.employees_project.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Employee::class], version = 1, exportSchema = false)
abstract class EmployeesDatabase : RoomDatabase() {

    abstract fun employeeDao(): EmployeesDao

    companion object {
        // Singleton prevents multiple instances of the database opening at the same time.
        @Volatile
        private var INSTANCE: EmployeesDatabase? = null

        fun getDatabase(context: Context): EmployeesDatabase {
            // If the INSTANCE is null, create the database, else return it.
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EmployeesDatabase::class.java,
                    "employees_database"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}