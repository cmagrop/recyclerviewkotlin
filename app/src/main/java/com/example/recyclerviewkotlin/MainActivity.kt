package com.example.recyclerviewkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var buttonBasico:Button = findViewById(R.id.accesobasico)
        buttonBasico.setOnClickListener {

            val intentBasico = Intent(this,BasicoActivity::class.java)
            startActivity(intentBasico)

        }
        var buttonComplejo:Button = findViewById(R.id.accesocomplejo)
        buttonComplejo.setOnClickListener {
            val intentComplejo = Intent(this,ComplejoActivity::class.java)
            startActivity(intentComplejo)
        }



    }
}