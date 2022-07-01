package com.haiku1967.listas

import android.content.Context
import android.util.Log
import java.io.File

class ListService(context: Context) {

    val context = context
    val fileName = "lists.txt"
    val file = File(context.filesDir, fileName)
    var list = mutableListOf<String>()

    // Obtener datos desde un fichero local (list.txt)
    fun getListFromFile(): MutableList<String> {

        Log.d("Debug", "getListFromFile()")

        if (!file.exists()) {
            file.createNewFile()
        }

        list = file.readLines() as MutableList<String>

        return list
    }

    // Añadir datos a un fichero local (list.txt)
    fun additemToList(item: String) {

        Log.d("Debug", "list.add(item): " + item)

        list.add(item)
        file.printWriter().use { out ->
            list.forEach {
                out.println(it)
            }

        }

        Log.d("Debug", "list.add(item): " + item)

    }

}