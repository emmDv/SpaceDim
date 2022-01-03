package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText

import android.widget.TextView

class WaitingGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waiting_game)

        // Current Gamer
        val currentGamer : View = findViewById(R.id.current_gamer)
        val currentGamerName : TextView = currentGamer.findViewById(R.id.gamer_name)
        val currentGamerState : TextView = currentGamer.findViewById(R.id.gamer_state)
        currentGamerName.setText("emms74 (Me)" )
        currentGamerState.setText(R.string.waiting_state)

       // Gamer n°2
        val gamer2 : View = findViewById(R.id.gamer_2)
        val gamer2Name : TextView = gamer2.findViewById(R.id.gamer_name)
        val gamer2State : TextView = gamer2.findViewById(R.id.gamer_state)
        gamer2Name.setText("michel44")
        gamer2State.setText(R.string.ready_state)
    }

    fun buttonClicked(view: View){
        //Intent pour ouvrir l'activité suivante
        val intent = Intent(this, GameActivity::class.java)
        //Lancement de l'intent (changement d'écran)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.i("WaitingGameActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("WaitingGameActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("WaitingGameActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("WaitingGameActivity", "onStop called")
    }
}