package com.example.kotlin_listview_lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)

        var nameList = ArrayList<String>()
        nameList.add("AbuBakr")
        nameList.add("Umar")
        nameList.add("Usman")
        nameList.add("Ali")


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, nameList)
        listView?.adapter = adapter
        listView?.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Pressed item position: ${nameList[position]}", Toast.LENGTH_SHORT).show()
        }
    }
}