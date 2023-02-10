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
        //dogs.add(createAlaskanMalamute())
        dogs.add(createAustralianShepherd())
        //dogs.add(createBassetHound())
        //dogs.add(createBelgianMalinois())
        //dogs.add(createBloodhound())
        //dogs.add(createBostonTerrier())
        dogs.add(createBoxer())
        dogs.add(createBulldog())
        //dogs.add(createDalmatian())
        dogs.add(createGermanShepherd())
        dogs.add(createGoldenRetriever())
        dogs.add(createGreatDane())
        //dogs.add(createJackRusselTerrier())
        dogs.add(createPomeranian())
        //dogs.add(createPug())
        //dogs.add(createShibaInu())
        dogs.add(createShihTzu())
        dogs.add(createSiberianHusky())
        //dogs.add(createStBernard())

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
    )

    private fun createGermanShepherd() = Dog(
        name = "German Shepherd",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_german-shepherd.jpg",
        group = "Pastoral/Herding dog",
        origin = "German",
        purity = "Purebred"
    )

    private fun createGoldenRetriever() = Dog(
        name = "Golden Retriever",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_golden-retriever.jpg",
        group = "Gun dog",
        origin = "Scotland",
        purity = "Purebred"
    )

    private fun createBulldog() = Dog(
        name = "Bulldog",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_french-bulldog.jpg",
        group = "Companion dog",
        origin = "England",
        purity = "Purebred"
    )

    private fun createBoxer() = Dog(
        name = "Boxer",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_boxer.jpg",
        group = "Working dog",
        origin = "Germany",
        purity = "Purebred"
    )

    private fun createSiberianHusky() = Dog(
        name = "Siberian Husky",
        size = "Medium",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_siberian-husky.jpg",
        group = "Sled dog",
        origin = "Russia",
        purity = "Purebred"
    )

    private fun createGreatDane() = Dog(
        name = "Great Dane",
        size = "GIant",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_great-dane.jpg",
        group = "Working dog",
        origin = "Germany",
        purity = "Purebred"
    )

    private fun createAustralianShepherd() = Dog(
        name = "Australian Shepherd",
        size = "Large",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_australian-shepherd.jpg",
        group = "Pastoral/Herding dog",
        origin = "United States",
        purity = "Purebred"
    )

    private fun createShihTzu() = Dog(
        name = "Shih Tzu",
        size = "Small",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_shih-tzu.jpg",
        group = "Companion dog",
        origin = "China",
        purity = "Purebred"
    )

    private fun createPomeranian() = Dog(
        name = "Pomeranian",
        size = "Small",
        image = "https://dogell.b-cdn.net/uploads/breed/thumb_pomeranian.jpg",
        group = "Companion dog",
        origin = "Germany, Poland",
        purity = "Purebred"
    )

//    private fun createBostonTerrier() = Dog(
//        name = "Boston Terrier",
//        size = "Small",
//        image = R.drawable.baseline_10k_24,
//        group = "Companion dog",
//        origin = "United States"
//    )
//
//    private fun createPug() = Dog(
//        name = "Pug",
//        size = "Small",
//        image = R.drawable.baseline_10k_24,
//        group = "Companion dog",
//        origin = "China"
//    )
//
//    private fun createBassetHound() = Dog(
//        name = "Basset Hound",
//        size = "Medium",
//        image = R.drawable.baseline_10k_24,
//        group = "Hunting dog",
//        origin = "France"
//    )
//
//    private fun createBelgianMalinois() = Dog(
//        name = "Belgian Malinois",
//        size = "Large",
//        image = R.drawable.baseline_10k_24,
//        group = "Pastoral/Herding dog",
//        origin = "Belgium"
//    )
//
//    private fun createShibaInu() = Dog(
//        name = "Shiba Inu",
//        size = "Medium",
//        image = R.drawable.baseline_10k_24,
//        group = "Companion dog",
//        origin = "Japan"
//    )
//
//    private fun createStBernard() = Dog(
//        name = "St. Bernard",
//        size = "Giant",
//        image = R.drawable.baseline_10k_24,
//        group = "Working dog",
//        origin = "Switzerland, Italy"
//    )
//
//    private fun createBloodhound() = Dog(
//        name = "Bloodhound",
//        size = "Large",
//        image = R.drawable.baseline_10k_24,
//        group = "Hunting dog",
//        origin = "France, Belgium"
//    )
//
//    private fun createAlaskanMalamute() = Dog(
//        name = "Alaskan Malamute",
//        size = "Large",
//        image = R.drawable.baseline_10k_24,
//        group = "Sled dog",
//        origin = "United States"
//    )
//
//    private fun createDalmatian() = Dog(
//        name = "Dalmatian",
//        size = "Large",
//        image = R.drawable.baseline_10k_24,
//        group = "Companion dog",
//        origin = "Croatia"
//    )
//
//    private fun createJackRusselTerrier() = Dog(
//        name = "Jack Russel Terrier",
//        size = "Small",
//        image = R.drawable.baseline_10k_24,
//        group = "Hunting dog",
//        origin = "England"
//    )
}
