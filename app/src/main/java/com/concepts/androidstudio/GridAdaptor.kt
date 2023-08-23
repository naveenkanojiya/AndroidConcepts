package com.concepts.androidstudio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class GridAdaptor(var context: Context, var flowerName:Array<String>,var imageview: IntArray)
    : BaseAdapter() {
    var inflater:LayoutInflater? = null
    override fun getCount(): Int {
        return imageview[23]
    }

    override fun getItem(position: Int): Any ?{
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
//        var contextView = convertView
//        if (inflater == null) inflater =
//            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        if (convertView == null) {
//            convertView = inflater!!.inflate(R.layout.custom_gridvew, null)
//        }
//        val imageview = convertView.findViewById<Imageview>(R.id.grid_image)
//        val textView = convertView.findViewById<TextView>(R.id.item_name)
//        imageview.setImageResource(image[position])
//        textView.text = flowerName[position]
//        return convertView
    }


}