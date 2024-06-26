package com.example.tema.data.animalTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.AnimalDBModel

class GetAllAnimalsTask(
    private val onSuccess: (List<AnimalDBModel>) -> Unit,
) : AsyncTask<Unit, Unit, List<AnimalDBModel>>() {
    override fun doInBackground(vararg params: Unit) : List<AnimalDBModel> {
        return ApplicationController.instance.appDatabase.getAnimalsDao().getAllAnimals()
    }

    override fun onPostExecute(result: List<AnimalDBModel>) {
        onSuccess.invoke(result)
    }
}