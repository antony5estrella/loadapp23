package com.example.truckload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.truckload.databinding.ActivityCalculosBinding
import com.example.truckload.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val btnCarcularMain =findViewById<Button>(R.id.button)
        //btnCarcularMain.setOnClickListener{goToCalcularAct()}
        binding.button.setOnClickListener{goToCalcularAct()}
    }

    fun goToCalcularAct(){
        val intent = Intent(this,CalculosActivity::class.java)
        startActivity(intent)
    }
}