package com.kroger.classdemoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kroger.classdemoapp.ui.DogDetailFragment

class DogAdapter(private val dogs: List<Dog>) : RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.dog_card_view, parent, false)
        return DogViewHolder(view) { position ->
            val dog = dogs[position]

            val bundle = bundleOf(
                "breed" to dog.name,
                "size" to dog.size,
                "group" to dog.group,
                "origin" to dog.origin,
                "image" to dog.image,
                "purity" to dog.purity
            )

            val detailFragment = DogDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity

            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount() = dogs.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dog = dogs[position]
        //holder.dogImage.setImageResource(dog.image)
        Glide.with(holder.itemView.context).load(dog.image).into(holder.dogImage)
        holder.dogName.text = dog.name
        holder.dogSize.text = dog.size
        holder.dogGroup.text = dog.group
        holder.dogOrigin.text = dog.origin
    }

    inner class DogViewHolder(
        itemView: View,
        private val onItemClick: (adapterPosition: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {
        val dogImage: ImageView = itemView.findViewById(R.id.dog_image)
        val dogName: TextView = itemView.findViewById(R.id.dog_name)
        val dogSize: TextView = itemView.findViewById(R.id.dog_size)
        val dogGroup: TextView = itemView.findViewById(R.id.dog_group)
        val dogOrigin: TextView = itemView.findViewById(R.id.dog_origin)

        init {
            itemView.setOnClickListener {
                onItemClick(adapterPosition)
            }
        }
    }
}