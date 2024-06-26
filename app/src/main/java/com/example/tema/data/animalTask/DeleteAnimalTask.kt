package com.example.tema.data.animalTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.AnimalDBModel

class DeleteAnimalTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<AnimalDBModel, Unit, Unit>() {
    override fun doInBackground(vararg params: AnimalDBModel) {
        params.getOrNull(0)?.let {animal ->
            ApplicationController.instance.appDatabase.getAnimalsDao().deleteAnimal(animal)
        }
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}