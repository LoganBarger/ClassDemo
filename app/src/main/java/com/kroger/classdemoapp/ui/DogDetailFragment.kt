package com.kroger.classdemoapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.kroger.classdemoapp.R

class DogDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dog_detail, container, false)
        if (arguments != null) {
            val image = requireArguments().getString("image")
            val name = requireArguments().getString("name")
            val size = requireArguments().getString("size")
            val group = requireArguments().getString("group")
            val origin = requireArguments().getString("origin")
            val purity = requireArguments().getString("purity")
            val lifespan = requireArguments().getString("lifespan")

            Glide.with(requireContext()).load(image).into(view.findViewById(R.id.dog_image))
            view.findViewById<TextView>(R.id.dog_name).text = name
            view.findViewById<TextView>(R.id.dog_size).text = size
            view.findViewById<TextView>(R.id.dog_group).text = group
            view.findViewById<TextView>(R.id.dog_origin).text = origin
            view.findViewById<TextView>(R.id.dog_purity).text = purity
            view.findViewById<TextView>(R.id.dog_lifespan).text = lifespan
        }
        return view
    }
}