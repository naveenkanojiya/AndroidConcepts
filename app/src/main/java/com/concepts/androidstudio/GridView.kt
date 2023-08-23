package com.concepts.androidstudio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GridView : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        val gridView = findViewById<GridView>(R.id.grid_image)
        val flowerNAme = arrayOf("Rose", "Lily","Lotus","Tulip")
        val flowerImages = intArrayOf(
            R.id.grid_image,
            R.id.imageView2,
            R.id.grid_image,
            R.id.imageView2,
            R.id.grid_image,
            R.id.imageView2,

        )
//        val gridAdaptor = GridAdaptor(this@GridView,flowerNAme,flowerImages)
//        gridView.setadapter(GridAdaptor)
//
//        gridView.setOnItemClickListener(
//            fun(parent:AdapterView<*>?,view:View,position:Int,id:Long){
//                Toast.makeText(this,this@GridView,"You Clicked on"+flowerNAme[position],
//                Toast.LENGTH_LONG
//                ).show()
//            }
        
    }
}