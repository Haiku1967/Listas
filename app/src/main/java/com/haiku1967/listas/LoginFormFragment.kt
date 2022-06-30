package com.haiku1967.listas

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.jocnunez.listas.R

class LoginFormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login_form, container, false)
        val nextButton = view.findViewById<Button>(R.id.nextButton)

        val cancelButton = view.findViewById<Button>(R.id.cancelButton)

        nextButton.setOnClickListener {
            Log.d("Debug", "Click on next button")
        }
        cancelButton.setOnClickListener {
            Log.d("Debug", "Click on cancel button")
        }
        return view
    }

}