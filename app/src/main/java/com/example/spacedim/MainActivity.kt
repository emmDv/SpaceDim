package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop called")
    }


    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, WaitingRoomActivity::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

}