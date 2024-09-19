package com.example.employees_project.di

import android.content.Context
import androidx.room.Room
import com.example.employees_project.data.EmployeesDao
import com.example.employees_project.data.EmployeesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): EmployeesDatabase {
        return Room.databaseBuilder(
            context,
            EmployeesDatabase::class.java,
            "employees_database"
        ).build()
    }

    @Provides
    fun provideEmployeeDao(database: EmployeesDatabase): EmployeesDao {
        return database.employeeDao()
    }
}