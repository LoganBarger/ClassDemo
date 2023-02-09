package com.kroger.classdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.dog_recycler_view)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val dogs = mutableListOf<Dog>()
        dogs.add(createChihuahua())
        dogs.add(createAlaskanMalamute())
        dogs.add(createAustralianShepherd())
        dogs.add(createBassetHound())
        dogs.add(createBelgianMalinois())
        dogs.add(createBloodhound())
        dogs.add(createBostonTerrier())
        dogs.add(createBoxer())
        dogs.add(createBulldog())
        dogs.add(createDalmatian())
        dogs.add(createGermanShepherd())
        dogs.add(createGoldenRetriever())
        dogs.add(createGreatDane())
        dogs.add(createJackRusselTerrier())
        dogs.add(createPomeranian())
        dogs.add(createPug())
        dogs.add(createShibaInu())
        dogs.add(createShihTzu())
        dogs.add(createSiberianHusky())
        dogs.add(createStBernard())

        val adapter = DogAdapter(dogs)
        recyclerView.adapter = adapter
    }

    private fun createChihuahua() = Dog(
        name = "Chihuahua",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "Mexico"
    )
    private fun createGermanShepherd() = Dog(
        name = "German Shepherd",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Pastoral/Herding dog",
        origin = "German"
    )
    private fun createGoldenRetriever() = Dog(
        name = "Golden Retriever",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Gun dog",
        origin = "Scotland"
    )
    private fun createBulldog() = Dog(
        name = "Bulldog",
        size = "Medium",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "England"
    )
    private fun createBoxer() = Dog(
        name = "Boxer",
        size = "Medium",
        image = R.drawable.baseline_10k_24,
        group = "Working dog",
        origin = "Germany"
    )
    private fun createSiberianHusky() = Dog(
        name = "Siberian Husky",
        size = "Medium",
        image = R.drawable.baseline_10k_24,
        group = "Sled dog",
        origin = "Russia"
    )
    private fun createGreatDane() = Dog(
        name = "Great Dane",
        size = "GIant",
        image = R.drawable.baseline_10k_24,
        group = "Working dog",
        origin = "Germany"
    )
    private fun createAustralianShepherd() = Dog(
        name = "Australian Shepherd",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Pastoral/Herding dog",
        origin = "United States"
    )
    private fun createShihTzu() = Dog(
        name = "Shih Tzu",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "China"
    )
    private fun createPomeranian() = Dog(
        name = "Pomeranian",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "Germany, Poland"
    )
    private fun createBostonTerrier() = Dog(
        name = "Boston Terrier",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "United States"
    )
    private fun createPug() = Dog(
        name = "Pug",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "China"
    )
    private fun createBassetHound() = Dog(
        name = "Basset Hound",
        size = "Medium",
        image = R.drawable.baseline_10k_24,
        group = "Hunting dog",
        origin = "France"
    )
    private fun createBelgianMalinois() = Dog(
        name = "Belgian Malinois",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Pastoral/Herding dog",
        origin = "Belgium"
    )
    private fun createShibaInu() = Dog(
        name = "Shiba Inu",
        size = "Medium",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "Japan"
    )
    private fun createStBernard() = Dog(
        name = "St. Bernard",
        size = "Giant",
        image = R.drawable.baseline_10k_24,
        group = "Working dog",
        origin = "Switzerland, Italy"
    )
    private fun createBloodhound() = Dog(
        name = "Bloodhound",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Hunting dog",
        origin = "France, Belgium"
    )
    private fun createAlaskanMalamute() = Dog(
        name = "Alaskan Malamute",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Sled dog",
        origin = "United States"
    )
    private fun createDalmatian() = Dog(
        name = "Dalmatian",
        size = "Large",
        image = R.drawable.baseline_10k_24,
        group = "Companion dog",
        origin = "Croatia"
    )
    private fun createJackRusselTerrier() = Dog(
        name = "Jack Russel Terrier",
        size = "Small",
        image = R.drawable.baseline_10k_24,
        group = "Hunting dog",
        origin = "England"
    )
}