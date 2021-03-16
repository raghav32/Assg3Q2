package com.example.assg3q2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)



        layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager

        adapter=RecyclerViewAdapter(getData())
        recyclerView.adapter=adapter
    }


    private fun  getData():ArrayList<AndroidFlavour>{
          val flavourList= mutableListOf<AndroidFlavour>()
        flavourList.add(AndroidFlavour("Cupcake",R.drawable.cupcake))
        flavourList.add(AndroidFlavour("Donut",R.drawable.donut))
        flavourList.add(AndroidFlavour("Eclair",R.drawable.eclair))
        flavourList.add(AndroidFlavour("Froyo",R.drawable.froyo))
        flavourList.add(AndroidFlavour("GingerBread",R.drawable.gingerbread))
        flavourList.add(AndroidFlavour("HoneyComb",R.drawable.honeycomb))
        flavourList.add(AndroidFlavour("Ice Cream Sndwich",R.drawable.ics))
        flavourList.add(AndroidFlavour("Jelly Bean",R.drawable.jellybean))
        flavourList.add(AndroidFlavour("Kitkat",R.drawable.kitkat))
        flavourList.add(AndroidFlavour("Lollipop",R.drawable.lollipop))
        flavourList.add(AndroidFlavour("Marshmallow",R.drawable.marshmallow))
        flavourList.add(AndroidFlavour("Nougat",R.drawable.nougat))
        return flavourList as ArrayList<AndroidFlavour>
    }
}