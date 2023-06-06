package com.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list:ArrayList<model> = ArrayList<model>()
        list.add(model(R.drawable.convert,R.drawable.convert_night,"Convert"))
        list.add(model(R.drawable.adjust,R.drawable.adjust_night,"Adjust"))
        list.add(model(R.drawable.filter,R.drawable.filter_night,"Filter"))
        list.add(model(R.drawable.search,R.drawable.search_night,"Super Zoom"))
        list.add(model(R.drawable.rename,R.drawable.rename_night,"Crop"))
        list.add(model(R.drawable.extractcolor,R.drawable.extractcolor_night,"Extract Colors"))
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=StaggeredGridLayoutManager(2,LinearLayout.VERTICAL)
        val adapter= com.example.ui.adapter.Adapter(this,list)
        recyclerView.adapter=adapter

    }
}