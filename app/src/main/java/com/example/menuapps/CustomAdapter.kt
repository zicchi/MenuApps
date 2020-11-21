package com.example.menuapps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val foodList: ArrayList<Food>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(foodList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return foodList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(food: Food) {

            val textViewFoodName = itemView.findViewById(R.id.textViewFoodname) as TextView
            val textViewFoodInfo = itemView.findViewById(R.id.textViewFoodinfo) as TextView
            val imageViewFood = itemView.findViewById(R.id.imageViewFood) as ImageView

            textViewFoodInfo.text = food.foodInfo
            textViewFoodName.text = food.foodName
            imageViewFood.setImageResource(food.foodImage)

        }
    }
}
