package com.concepts.androidstudio

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        //Here you can create simple Splash Screen
//        Handler(Looper.getMainLooper()).postDelayed(3000){
//            startActivity(Intent(this,MainActivity3::class.java))
//        }
//    }




        //And Here you can Create Splash Screen using loading Background Data and when background data loaded then activity will
        // start and when background task(like data) not loaded due to some reason then activity not loaded

        startHeavyTask()


    }

    private fun startHeavyTask() {
        LongOperation().execute()

    }

    private open inner class LongOperation:AsyncTask<String?,Void? , String?>(){
        override fun doInBackground(vararg params: String?): String? {
            for (i in 0..6){
                try {
                    Thread.sleep(1000)
                }
                catch (e:Exception){
                    Thread.interrupted()
                }
            }
            return "return"
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val intent = Intent(this@splashscreen,Linearlayout::class.java)
            startActivity(intent)
            finish()
        }

    }



}