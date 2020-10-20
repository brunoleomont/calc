package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: Double = 0.0
        var num2: Double = 0.0
        var resp: Double = 0.0

        val strNum1: EditText = findViewById(R.id.editTextPersonName)
        val strNum2: EditText = findViewById(R.id.editTextPersonName2)

        val botao = findViewById<Button>(R.id.button)
        val botao2 = findViewById<Button>(R.id.button2)
        val botao3 = findViewById<Button>(R.id.button3)
        val botao4 = findViewById<Button>(R.id.button4)

        botao.setOnClickListener {
            num1 = strNum1.text.toString().toDouble()
            num2 = strNum2.text.toString().toDouble()

            resp = num1+num2

            Toast.makeText(applicationContext, "Resposta: "+resp, Toast.LENGTH_SHORT).show()
        }

        botao2.setOnClickListener {
            num1 = strNum1.text.toString().toDouble()
            num2 = strNum2.text.toString().toDouble()

            resp = num1-num2

            Toast.makeText(applicationContext, "Resposta: "+resp, Toast.LENGTH_SHORT).show()
        }

        botao3.setOnClickListener {
            num1 = strNum1.text.toString().toDouble()
            num2 = strNum2.text.toString().toDouble()

            resp = num1*num2

            Toast.makeText(applicationContext, "Resposta: "+resp, Toast.LENGTH_SHORT).show()
        }

        botao4.setOnClickListener {
            num1 = strNum1.text.toString().toDouble()
            num2 = strNum2.text.toString().toDouble()

            resp = num1/num2

            Toast.makeText(applicationContext, "Resposta: "+resp, Toast.LENGTH_SHORT).show()
        }
    }
}