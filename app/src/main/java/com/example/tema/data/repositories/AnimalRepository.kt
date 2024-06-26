package com.example.tema.data.repositories

import com.example.tema.data.animalTask.*
import com.example.tema.data.models.AnimalDBModel
import com.example.tema.models.AnimalModel

object AnimalRepository {
    fun insertAnimal(animal: AnimalDBModel, onSuccess: () -> Unit) {
        InsertAnimalTask(onSuccess).execute(animal)
    }
    fun deleteAnimal(animal: AnimalDBModel, onSuccess: () -> Unit) {
        DeleteAnimalTask(onSuccess).execute(animal)
    }
    fun getAnimalByName(name: String, onSuccess: (AnimalDBModel?) -> Unit) {
        GetAnimalByNameTask(onSuccess).execute(name)
    }
    fun updateAnimal(id: Long, continentId: Long, onSuccess: () -> Unit) {
        UpdateAnimalTask(onSuccess).execute(Pair(id, continentId))
    }
    fun getAllAnimalsWithContinent(onSuccess: (List<AnimalModel>) -> Unit) {
        GetAllAnimalsWithContinentTask(onSuccess).execute()
    }
}