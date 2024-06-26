package com.example.tema.data.repositories

import com.example.tema.data.continentTask.*
import com.example.tema.data.models.ContinentDBModel


object ContinentRepository {
    fun getContinentByName(name: String, onSuccess: (ContinentDBModel?) -> Unit) {
        GetContinentByNameTask(onSuccess).execute(name)
    }
}