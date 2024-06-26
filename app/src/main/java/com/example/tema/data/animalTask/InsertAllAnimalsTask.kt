package com.example.tema.data.animalTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.AnimalDBModel

class InsertAllAnimalsTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<List<AnimalDBModel>, Unit, Unit>() {
    override fun doInBackground(vararg params: List<AnimalDBModel>) {
        params.getOrNull(0)?.let {animals ->
            ApplicationController.instance.appDatabase.getAnimalsDao().insertAllAnimals(animals)
        }
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}