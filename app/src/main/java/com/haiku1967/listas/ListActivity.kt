package com.haiku1967.listas

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.jocnunez.listas.R
import java.util.*

class ListActivity : AppCompatActivity() {

    var list: MutableList<String> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        Log.d("Debug", "List Activity OPEN")

        val listService = ListService(this)
        list = listService.getListFromFile()
        list.forEach { addItemToLayout(it) }

        val newItem = findViewById<Button>(R.id.newButton)
        newItem.setOnClickListener {

            val fragment = ItemDetailFragment()

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.remove(fragment)

            fragmentTransaction.add(R.id.detailLayout, fragment)

            fragmentTransaction.commit()

    }
}

private fun addNewIten(service: ListService) {

    val ramdomText = Date().toString()

    service.additemToList(ramdomText)

    addItemToLayout(ramdomText)
}

private fun addItemToLayout(text: String) {

    val textView = TextView(this)

    textView.text = text

    val listLayout = findViewById<LinearLayout>(R.id.listLayout)
    listLayout.addView(textView)
}
}