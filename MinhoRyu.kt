package com.example.mysumapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.mysumapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //val txt_Hello = findViewById<TextView>(R.id.txt_hello)
        //txt_Hello.text = "Hello, KAU"

        binding.button.setOnClickListener{
            val sum = {a: Int, b: Int -> a + b}
            val res = calculator( binding.edtNum1.text.toString().toInt(), binding.edtNum2.text.toString().toDouble(), binding.operand.text.toString() )
            binding.txtResult.text = res.toString()
            println(binding.txtResult.text)
        }
    }

    private fun calculator(a: Int, b: Double, c: String): Double {

        val res = when(c) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> a / b
        }
        return res
    }

    /*
    Hi! Good to see you! //김상일
     */

}