package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class WaitingRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting_room)
    }

    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, WaitingGameActivity::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("WaitingRoomActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("WaitingRoomActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WaitingRoomActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WaitingRoomActivity", "onStop called")
    }
}