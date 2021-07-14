package com.matuto.imcapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.* // para este import funcionar, foi preciso adiconar o kotlinx nas dependencias!



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() { // função set Listeners criada para pegar as informações digitadas pelo usuário.
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText( this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        pesoEDT?.doOnTextChanged() { text, _, _, _ ->
            titleTXT.text = text
        }

        calcularBTN.setOnClickListener{
            calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString()) // as informações digitadas vão para a função calcularIMC.
        }

    }

    private fun calcularIMC(peso: String, altura: String) { // com as informações digitadas pelo usuário, o calculo do IMC é realizado.
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null) {
            val imc = peso / (altura * altura)
        }
    }
}