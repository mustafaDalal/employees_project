package com.example.employees_project.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "employees_data")
class Employee(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val phone: String,
    val designation: String,
    val department: String,
    val status: Boolean
)