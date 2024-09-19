package com.example.employees_project.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.employees_project.domain.EmployeeUseCasesManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EmployeesViewModel @Inject constructor(private val useCasesManager: EmployeeUseCasesManager) : ViewModel() {

    fun getAllEmployees() {
        viewModelScope.launch {
            val abc = useCasesManager.getAllEmployeesUseCase()
        }
    }

}