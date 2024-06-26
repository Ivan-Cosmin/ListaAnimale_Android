package com.example.tema

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class AnimalAddListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_add_animal)
        button.setOnClickListener { doAddAnimal() }
        setupAnimalList()
    }

    private fun doAddAnimal() {
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun setupAnimalList() {

    }
}