package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class WinGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win_game)
    }

    fun retryButtonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, MainActivity::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("WinGameActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("WinGameActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WinGameActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WinGameActivity", "onStop called")
    }
}