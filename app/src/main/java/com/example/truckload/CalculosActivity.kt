package com.example.truckload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculos)
        val btnCarcularCal = findViewById<Button>(R.id.button2)
        btnCarcularCal.setOnClickListener{showValor()}
    }

    fun checkValue():Int {
         val river:String
         val quickwey:String
         val canastoga:String

        val etNumber = findViewById<EditText>(R.id.editTextNumber)
        if (etNumber.text.isNotEmpty()){
            river = etNumber.text.toString()
        }else{
            river = "0"
        }
        val etNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        if (etNumber2.text.isNotEmpty()){
            quickwey = etNumber.text.toString()
        }else{
            quickwey = "0"
        }
        val etNumber3 = findViewById<EditText>(R.id.editTextNumber3)
        if (etNumber3.text.isNotEmpty()){
            canastoga = etNumber.text.toString()
        }else{
            canastoga = "0"
        }
        val valor = carcularViajes(river.toInt(),quickwey.toInt(),canastoga.toInt())
        return valor

    }

    fun carcularViajes(river:Int,quickwey:Int,canastoga:Int):Int=(river * 150) + (quickwey * 160) + (canastoga * 100)

    fun showValor(){
        val tvResultado = findViewById<TextView>(R.id.textView2)
        tvResultado.setText(checkValue().toString())
    }

}