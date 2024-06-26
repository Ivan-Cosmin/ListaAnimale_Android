package com.example.tema.data.animalTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.models.AnimalModel

class GetAllAnimalsWithContinentTask (
    private val onSuccess: (List<AnimalModel>) -> Unit,
) : AsyncTask<Unit, Unit, List<AnimalModel>>() {
    override fun doInBackground(vararg params: Unit) : List<AnimalModel> {
        return ApplicationController.instance.appDatabase.getAnimalsDao().getAllAnimals().map {
            AnimalModel(
                it.name,
                ApplicationController.instance.appDatabase.getContinentsDao().getContinent(it.continentId).name
            )
        }.toMutableList()
    }

    override fun onPostExecute(result: List<AnimalModel>) {
        onSuccess.invoke(result)
    }
}