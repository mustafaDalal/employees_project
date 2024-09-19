package com.example.employees_project.di

import com.example.employees_project.data.*
import com.example.employees_project.domain.EmployeeUseCasesManager
import com.example.employees_project.domain.GetAllEmployeesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    @Provides
    fun providesEmployeesUseCasesManager(getAllEmployeesUseCase: GetAllEmployeesUseCase) : EmployeeUseCasesManager {

        return EmployeeUseCasesManager(getAllEmployeesUseCase)
    }

    @Provides
    fun providesGetAllEmployeesUseCase(repository: EmployeeRepository) : GetAllEmployeesUseCase {

        return GetAllEmployeesUseCase(repository)
    }

    @Provides
    fun providesEmployeesRepository(dao : EmployeesDao) : EmployeeRepository {

        return EmployeeRepositoryImpl(dao)
    }

    @Provides
    fun providesEmployeesDao(dao : EmployeesDao) : EmployeeRepository {

        return EmployeeRepositoryImpl(dao)
    }


}