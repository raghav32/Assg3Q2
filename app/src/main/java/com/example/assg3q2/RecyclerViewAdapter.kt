package com.example.assg3q2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    private val itemText= arrayOf("Cupcake","Donut","Eclair","Froyo","GingerBread",
        "HoneyComb","IceCream Sandwich","JellyBean","Kitkat","Lollipop","Marshmallow","Nougat")
    private val itemImages= intArrayOf(
        R.drawable.cupcake,
        R.drawable.donut,
        R.drawable.eclair,
        R.drawable.froyo,
        R.drawable.gingerbread,
        R.drawable.honeycomb,
        R.drawable.ics,
        R.drawable.jellybean,
        R.drawable.kitkat,
        R.drawable.lollipop,
        R.drawable.marshmallow,
        R.drawable.nougat,
    )

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
         var image:ImageView = itemView.findViewById(R.id.item_image)
         var textDes:TextView = itemView.findViewById(R.id.item_text)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ):ViewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_model,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.image.setImageResource(itemImages[position])
        holder.textDes.text=itemText[position]

    }

    override fun getItemCount(): Int {
        return itemText.size
    }

}