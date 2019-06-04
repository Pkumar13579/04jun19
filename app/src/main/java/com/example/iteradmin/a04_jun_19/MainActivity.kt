package com.example.iteradmin.a04_jun_19

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val lm:RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = lm

        val data = arrayOf(
                card("one","two","three"),
                card("a","b","c"),
                card("i","ii","iii")
        )

        recyclerView.adapter = RajuAdapter(this)
    }
}
