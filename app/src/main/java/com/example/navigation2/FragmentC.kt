package com.example.navigation2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentC.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentC : Fragment() {
    private val args: FragmentCArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_c, container, false)
        view.findViewById<TextView>(R.id.message).text = args.message
        return view
    }
}