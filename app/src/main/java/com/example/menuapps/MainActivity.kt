package com.example.menuapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var RV_new_person: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RV_new_person = findViewById(R.id.RV1)
        val recyclerView = findViewById(R.id.RV1) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val food = ArrayList<Food>()

        food.add(Food("Hamburger","Burger enak tapi daging babi",R.drawable.hamburger))
        food.add(Food("Pizza","Pizza 1/8 bagian",R.drawable.pizza))
        food.add(Food("Kentang Goreng","Bukan kentang biasa",R.drawable.french_fries))
        food.add(Food("Hot Dog","Hot like the weather",R.drawable.hot_dog))

        val adapter = CustomAdapter(food)
        recyclerView.adapter = adapter





    }
}