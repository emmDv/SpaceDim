package com.example.spacedim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

import android.widget.Switch
import android.widget.TextView


class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val viewSwitchT : View = findViewById(R.id.switch_teleporteur)
        val switchT : Switch = viewSwitchT.findViewById(R.id.switch_btn)
        switchT.setText(R.string.switch_teleporteur)
        switchT.setOnClickListener{
            //Intent pour ouvrir l'activité suivante
            val intent = Intent(this, WinGameActivity::class.java)
            //Lancement de l'intent (changement d'écran)
            startActivity(intent)
        }

        val viewSwitchHP : View = findViewById(R.id.switch_hyper_propulseur)
        val switchHP : Switch = viewSwitchHP.findViewById(R.id.switch_btn)
        switchHP.setText(R.string.switch_hyper_propulseur)
        switchHP.setOnClickListener{
            //Intent pour ouvrir l'activité suivante
            val intent = Intent(this, WinGameActivity::class.java)
            //Lancement de l'intent (changement d'écran)
            startActivity(intent)
        }

        val viewSimpleBtnSV : View = findViewById(R.id.simple_btn_sens_vie)
        val btnSV : Button = viewSimpleBtnSV.findViewById(R.id.simple_btn)
        btnSV.setText(R.string.simple_btn_sens_vie)
        btnSV.setOnClickListener{
            //Intent pour ouvrir l'activité suivante
            val intent = Intent(this, LoseGameActivity::class.java)
            //Lancement de l'intent (changement d'écran)
            startActivity(intent)
        }

        val viewSimpleBtnDG : View = findViewById(R.id.simple_btn_degaz)
        val btnDG : Button = viewSimpleBtnDG.findViewById(R.id.simple_btn)
        btnDG.setText(R.string.simple_btn_degaz)
        btnDG.setOnClickListener{
            //Intent pour ouvrir l'activité suivante
            val intent = Intent(this, LoseGameActivity::class.java)
            //Lancement de l'intent (changement d'écran)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("GameActivity", "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("GameActivity", "onResume called")
    }
    override fun onPause() {
        super.onPause()
        Log.i("GameActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("GameActivity", "onStop called")
    }

}