package com.kroger.classdemoapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kroger.classdemoapp.Dog
import com.kroger.classdemoapp.DogAdapter
import com.kroger.classdemoapp.R

class DogListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dog_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.Dog_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val dogs = mutableListOf<Dog>()

        dogs.add(createChihuahua())
        dogs.add(createAustralianShepherd())
        dogs.add(createBoxer())
        dogs.add(createBulldog())
        dogs.add(createGermanShepherd())
        dogs.add(createGoldenRetriever())
        dogs.add(createGreatDane())
        dogs.add(createPomeranian())
        dogs.add(createShihTzu())
        dogs.add(createSiberianHusky())

        val adapter = DogAdapter(dogs)
        recyclerView.adapter = adapter

        return view
    }

    private fun createChihuahua() = Dog(
        name = "Chihuahua",
        size = "Small",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_chihuahua.jpg",
        group = "Companion dog",
        origin = "Mexico",
        purity = "Purebred",
        lifespan = "14-18 years"
    )

    private fun createGermanShepherd() = Dog(
        name = "German Shepherd",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_german-shepherd.jpg",
        group = "Pastoral/Herding dog",
        origin = "German",
        purity = "Purebred",
        lifespan = "9-13 years"
    )

    private fun createGoldenRetriever() = Dog(
        name = "Golden Retriever",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_golden-retriever.jpg",
        group = "Gun dog",
        origin = "Scotland",
        purity = "Purebred",
        lifespan = "10-12 years"
    )

    private fun createBulldog() = Dog(
        name = "Bulldog",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_french-bulldog.jpg",
        group = "Companion dog",
        origin = "England",
        purity = "Purebred",
        lifespan = "8-10 years"
    )

    private fun createBoxer() = Dog(
        name = "Boxer",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_boxer.jpg",
        group = "Working dog",
        origin = "Germany",
        purity = "Purebred",
        lifespan = "10-12 years"
    )

    private fun createSiberianHusky() = Dog(
        name = "Siberian Husky",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_siberian-husky.jpg",
        group = "Sled dog",
        origin = "Russia",
        purity = "Purebred",
        lifespan = "12-14 years"
    )

    private fun createGreatDane() = Dog(
        name = "Great Dane",
        size = "GIant",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_great-dane.jpg",
        group = "Working dog",
        origin = "Germany",
        purity = "Purebred",
        lifespan = "7-11 years"
    )

    private fun createAustralianShepherd() = Dog(
        name = "Australian Shepherd",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_australian-shepherd.jpg",
        group = "Pastoral/Herding dog",
        origin = "United States",
        purity = "Purebred",
        lifespan = "11-15 years"
    )

    private fun createShihTzu() = Dog(
        name = "Shih Tzu",
        size = "Small",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_shih-tzu.jpg",
        group = "Companion dog",
        origin = "China",
        purity = "Purebred",
        lifespan = "10-16 years"
    )

    private fun createPomeranian() = Dog(
        name = "Pomeranian",
        size = "Small",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_pomeranian.jpg",
        group = "Companion dog",
        origin = "Germany, Poland",
        purity = "Purebred",
        lifespan = "12-18 years"
    )
}
