package com.example.employees_project.data

sealed class WorkResult<out T>{

    data class Success<out T>(val data : T) : WorkResult<T>()

    data class Error(val e : Exception) : WorkResult<Nothing>()

    object isLoading : WorkResult<Nothing>()

}
