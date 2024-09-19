package com.example.employees_project.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeesDao {

    @Insert
    fun addEmployee(employee : Employee)

    @Query("SELECT * FROM employees_data")
    fun getAllEmployees() : Flow<List<Employee>>

}
