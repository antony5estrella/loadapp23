package com.example.truckload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.truckload.databinding.ActivityCalculosBinding

class CalculosActivity : AppCompatActivity() {

    private var _binding: ActivityCalculosBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding= ActivityCalculosBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //val btnCarcularCal = findViewById<Button>(R.id.button2)
        //button2.setOnClickListener { checkValue() }
        binding.button2.setOnClickListener{ checkValue()}
    }

    fun checkValue() {


        fun checkValueA(): Int {
            val etNumber = findViewById<EditText>(R.id.editTextNumber)
            if (etNumber.text.isNotEmpty()) {
                return etNumber.text.toString().toInt()
            } else {
                return 0
            }
        }

        fun checkValueB(): Int {
            val etNumber2 = findViewById<EditText>(R.id.editTextNumber2)
            if (etNumber2.text.isNotEmpty()) {
                return etNumber2.text.toString().toInt()
            } else {
                return 0
            }
        }



        val a = checkValueA()
        val b = checkValueB()

        fun carcularViajes(a:Int,b:Int): Double {
            return ((a*0.60)+(b*0.25))
        }
       val resulrado= carcularViajes(a,b)

        fun showValor(){
            val tvResultado = findViewById<TextView>(R.id.textView2)
            tvResultado.setText(resulrado.toString())
        }
        showValor()

    }




}