package com.example.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.navigationapp.FirstFragmentDirections


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val textView = view.findViewById<TextView>(R.id.textView1)
        textView.setOnClickListener {
            val action = FirstFragmentDirections.navigateToSecondFragment(22)
            Navigation.findNavController(view).navigate(action)
        }
        return view
    }

}