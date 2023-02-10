package com.kroger.classdemoapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
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
            val name = requireArguments().getString("name")
            val size = requireArguments().getString("size")
            val group = requireArguments().getString("group")
            val origin = requireArguments().getString("origin")
            val purity = requireArguments().getString("purity")

            view.findViewById<TextView>(R.id.dog_purity).text = purity
        }
        return view
    }
}