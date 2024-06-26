package com.example.tema.data.repositories

import com.example.tema.data.models.AnimalDBModel
import com.example.tema.models.AnimalModel

object AnimalRepository {
    fun insertAnimal(animal: AnimalDBModel, onSuccess: () -> Unit) {
    }

    fun deleteAnimal(animal: AnimalDBModel, onSuccess: () -> Unit) {
    }

    fun getAnimal(id: Long, onSuccess: (AnimalDBModel?) -> Unit) {
    }

    fun getAnimalByName(name: String, onSuccess: (AnimalDBModel?) -> Unit) {
    }

    fun updateAnimal(id: Long, continentId: Long, onSuccess: () -> Unit) {
    }

    fun getAllAnimals(onSuccess: (List<AnimalDBModel>) -> Unit) {
    }

    fun insertAllAnimals(animals: List<AnimalDBModel>, onSuccess: () -> Unit) {
    }

    fun getAllAnimalsWithContinent(onSuccess: (List<AnimalModel>) -> Unit) {
    }
}