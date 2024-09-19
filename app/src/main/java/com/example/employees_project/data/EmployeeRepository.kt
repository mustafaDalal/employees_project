package com.example.employees_project.data

import kotlinx.coroutines.flow.Flow

interface EmployeeRepository {

    suspend fun getAllEmployees() : Flow<WorkResult<List<Employee>>>

//    suspend fun addEmployee(employee: Employee) : Flow<WorkResult<Employee>>
//
//    suspend fun updateEmployee(employee: Employee) : Flow<WorkResult<Employee>>
//    suspend fun deleteEmployee(employee: Employee)
//
//    suspend fun filterEmployees(employee: Employee) : Flow<WorkResult<Employee>>

}