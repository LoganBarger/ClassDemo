package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogAdapter(private val dogs: List<Dog>) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dog_card_view, parent, false)
        return DogViewHolder(view)
    }

    override fun getItemCount() = dogs.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = dogs[position]
        holder.dogImage.setImageResource(dog.image)
        holder.dogName.text = dog.name
        holder.dogSize.text = dog.size
        holder.dogGroup.text = dog.group
        holder.dogOrigin.text = dog.origin
    }

    class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dogImage: ImageView = itemView.findViewById(R.id.dog_image)
        val dogName: TextView = itemView.findViewById(R.id.dog_name)
        val dogSize: TextView = itemView.findViewById(R.id.dog_size)
        val dogGroup: TextView = itemView.findViewById(R.id.dog_group)
        val dogOrigin: TextView = itemView.findViewById(R.id.dog_origin)
    }
}