package com.example.tema.data.continentTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.ContinentDBModel

class InsertContinentTask(
    private val onSuccess: () -> Unit,
) : AsyncTask<ContinentDBModel, Unit, Unit>() {
    override fun doInBackground(vararg params: ContinentDBModel) {
        params.getOrNull(0)?.let {continent ->
            ApplicationController.instance.appDatabase.getContinentsDao().insertContinent(continent)
        }
    }

    override fun onPostExecute(result: Unit?) {
        onSuccess.invoke()
    }
}