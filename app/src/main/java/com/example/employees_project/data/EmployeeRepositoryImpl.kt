package com.example.employees_project.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class EmployeeRepositoryImpl @Inject constructor(private val employeesDao : EmployeesDao) : EmployeeRepository {
    override suspend fun getAllEmployees(): Flow<WorkResult<List<Employee>>> {
        return employeesDao.getAllEmployees().map { employeeList ->
            WorkResult.Success(employeeList) as WorkResult<List<Employee>> // Wrap the result in WorkResult.Success
        }.onStart {
            // Emit loading state when the flow starts
            emit(WorkResult.isLoading)
        }.catch { exception ->
                // Emit an error state in case of an exception
                emit(WorkResult.Error(exception as Exception))
            }
    }

//    override suspend fun addEmployee(employee: Employee): Flow<WorkResult<Employee>> {
//
//    }
//
//    override suspend fun updateEmployee(employee: Employee): Flow<WorkResult<Employee>> {
//
//    }
//
//    override suspend fun deleteEmployee(employee: Employee) {
//
//    }
//
//    override suspend fun filterEmployees(employee: Employee): Flow<WorkResult<Employee>> {
//
//    }
}