package com.example.tema.data.repositories

import com.example.tema.data.models.ContinentDBModel


object ContinentRepository {
    fun insertContinent(continent: ContinentDBModel, onSuccess: () -> Unit) {
    }

    fun getContinent(id: Long, onSuccess: (ContinentDBModel?) -> Unit) {
    }

    fun getContinentByName(name: String, onSuccess: (ContinentDBModel?) -> Unit) {
    }

    fun getAllContinents(onSuccess: (List<ContinentDBModel>) -> Unit) {
    }

    fun insertAllContinents(continents: List<ContinentDBModel>, onSuccess: () -> Unit) {
    }
}