package com.haiku1967.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.jocnunez.listas.R
import java.util.*

class ListActivity : AppCompatActivity() {

    var list: MutableList <String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        Log.d("Debug", "List Activity OPEN")


        val newItem = findViewById<Button>(R.id.newButton)

        newItem.setOnClickListener {
            addNewIten()
        }
    }

    private fun addNewIten() {

        val ramdomText = Date().toString()
        val textView = TextView( this)

        textView.text = ramdomText

        val listLayout = findViewById<LinearLayout>(R.id.listLayout)
        listLayout.addView(textView)

    }
}