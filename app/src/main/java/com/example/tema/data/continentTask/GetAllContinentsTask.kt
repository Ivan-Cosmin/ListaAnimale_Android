package com.example.tema.data.continentTask

import android.os.AsyncTask
import com.example.tema.ApplicationController
import com.example.tema.data.models.ContinentDBModel

class GetAllContinentsTask(
    private val onSuccess: (List<ContinentDBModel>) -> Unit,
) : AsyncTask<Unit, Unit, List<ContinentDBModel>>() {
    override fun doInBackground(vararg params: Unit) : List<ContinentDBModel> {
        return ApplicationController.instance.appDatabase.getContinentsDao().getAllContinents()
    }

    override fun onPostExecute(result: List<ContinentDBModel>) {
        onSuccess.invoke(result)
    }
}