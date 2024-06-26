package com.example.tema.data.continentTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.ContinentDBModel

class InsertAllContinentsTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<List<ContinentDBModel>, Unit, Unit>() {
    override fun doInBackground(vararg params: List<ContinentDBModel>) {
        params.getOrNull(0)?.let {continents ->
            ApplicationController.instance.appDatabase.getContinentsDao().insertAllContinents(continents)
        }
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}