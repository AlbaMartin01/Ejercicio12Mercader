package com.example.ejercicio12mercader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.continuar).setOnClickListener {
            var intento = Intent(this, Vacia::class.java)
            startActivity(intento)
        }
        findViewById<Button>(R.id.comerciar).setOnClickListener {
            var intento = Intent(this, Comerciar::class.java)
            startActivity(intento)
        }

    }
}