package com.example.kiddiecash2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class DataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_data, container, false)
//        val button = view.findViewById<Button>(R.id.button)
//        What is homefragment2... why is there a 2?

//        button.setOnClickListener{
//            findNavController().navigate(R.id.action_dataFragment_to_homeFragment2)
//        }
        return view
    }

}