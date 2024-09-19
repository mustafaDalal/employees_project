package com.example.employees_project.domain

import com.example.employees_project.data.Employee
import com.example.employees_project.data.EmployeeRepository
import com.example.employees_project.data.WorkResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllEmployeesUseCase @Inject constructor(private val repository: EmployeeRepository) {

    suspend operator fun invoke(): Flow<WorkResult<List<Employee>>> {
        return repository.getAllEmployees()
    }
}
