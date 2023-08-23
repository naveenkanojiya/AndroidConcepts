package com.concepts.androidstudio

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {

    fun customMenu(context:Context,view:View){

        val pop = PopupMenu(context,view)
        pop.inflate(com.example.androidstudio.R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                com.example.androidstudio.R.id.edit -> {
                    Toast.makeText(context, "clicked Edited", Toast.LENGTH_LONG).show()
                    true
                }
                com.example.androidstudio.R.id.delete -> {
                    Toast.makeText(context, "clicked Deleted", Toast.LENGTH_LONG).show()
                    true
                }
                com.example.androidstudio.R.id.share -> {
                    Toast.makeText(context, "clicked Shared", Toast.LENGTH_LONG).show()
                    true
            }
                else -> false }
        }
        try {
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mpopup")
            fieldMpopup.isAccessible = true
            val mPopup = fieldMpopup.get(pop)
            mPopup.javaClass
                .getDeclaredMethod("SetForceShowIcon",Boolean::class.java)
                .invoke(mPopup,true)

        }catch (e:Exception){

        }finally {
            pop.show()
        }

    }
}