package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class LoseGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose_game)
    }

    fun retryButtonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, MainActivity::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("LoseGameActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("LoseGameActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("LoseGameActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("LoseGameActivity", "onStop called")
    }
}