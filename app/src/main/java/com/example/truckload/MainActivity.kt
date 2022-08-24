package com.example.truckload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCarcularMain =findViewById<Button>(R.id.button)
        btnCarcularMain.setOnClickListener{goToCalcularAct()}
    }

    fun goToCalcularAct(){
        val intent = Intent(this,CalculosActivity::class.java)
        startActivity(intent)
    }
}