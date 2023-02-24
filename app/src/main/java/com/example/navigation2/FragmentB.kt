package com.example.navigation2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentB.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentB : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sendButton: Button = view.findViewById(R.id.sendBtn)
        val navController = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val textMessage: EditText = view.findViewById(R.id.textMessage)
            val message = textMessage.text.toString()
            if (message.trim() == "") {
                Toast.makeText(requireActivity(), "Enter a valid text", Toast.LENGTH_SHORT).show()
            } else {
                val action = FragmentBDirections.actionFragmentBToFragmentC()
                action.message = message
                navController.navigate(action)
            }
        }
    }
}