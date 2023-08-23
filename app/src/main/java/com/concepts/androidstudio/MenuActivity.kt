package com.concepts.androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import cn.pedant.SweetAlert.SweetAlertDialog

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        //Here we create Menu
        val btn = findViewById<Button>(R.id.button6)
         val Button = findViewById<Button>(R.id.button5)
        val obj = com.concepts.androidstudio.CustomMenu()
        Button.setOnClickListener {
            obj.customMenu(this,it)
        }

        //This is here AlertDialog Box
        btn.setOnClickListener {
            val dialog =AlertDialog.Builder(this)

            dialog.setTitle("Delete Files")
            dialog.setMessage(R.string.des)
            dialog.setIcon(R.drawable.baseline_delete_24)

            dialog.setPositiveButton("YES"){dialogInterface,which ->
                Toast.makeText(this,"Clicked Yes",Toast.LENGTH_LONG).show()
            }
            dialog.setNegativeButton("NO"){dialogInterface,which ->
                Toast.makeText(this,"NO",Toast.LENGTH_LONG).show()
            }
            dialog.setNeutralButton("CANCEL"){dialogInterface,which ->
                Toast.makeText(this,"Clicked CANCEL",Toast.LENGTH_LONG).show()
            }
            val alertDialog:AlertDialog = dialog.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

        }


        //Here in AlertDialog box using SweetAlert Library
        val btn7 = findViewById<Button>(R.id.button7)
        val btn8 = findViewById<Button>(R.id.button8)
        val btn9 = findViewById<Button>(R.id.button10)

        btn7.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText("Success SweetAlert")
                .setContentText("This is Success SweetAlertDialog Box")
                .show()
        }
        btn8.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.ERROR_TYPE)
                .setTitleText("Error SweetAlert")
                .setContentText("This is Error SweetAlertDialog Box")
                .show()
        }
        btn9.setOnClickListener {
            SweetAlertDialog(this,SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Warning SweetAlert")
                .setContentText("This is Warning SweetAlertDialog Box")
                .show()
        }

    }
}