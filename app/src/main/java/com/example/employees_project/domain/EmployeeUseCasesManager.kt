package com.example.employees_project.domain

import com.example.employees_project.data.EmployeeRepository
import javax.inject.Inject

class EmployeeUseCasesManager @Inject constructor(val allEmployeesUseCase: GetAllEmployeesUseCase) {

    suspend fun getAllEmployeesUseCase() = allEmployeesUseCase()

}