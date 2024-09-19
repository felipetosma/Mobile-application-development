package br.com.fiap.felipe.applanchonete

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var coxinhaEditText : EditText
    private lateinit var bebidaEditText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coxinhaEditText = findViewById(R.id.editTextCoxinha)
        bebidaEditText = findViewById(R.id.editTextBebida)

        val calculateButton : Button = findViewById(R.id.calculateButton)
        calculateButton.setOnClickListener(){
            calculateAndShowResult()
        }
    }

    private fun calculateAndShowResult(){
        val coxinhaInput = coxinhaEditText.text.toString()
        val bebidaInput = bebidaEditText.text.toString()

        if(coxinhaInput.isNotEmpty() && bebidaInput.isNotEmpty()){
            val coxinhaQuantity = coxinhaInput.toInt()
            val bebidaQuantity = bebidaInput.toInt()

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra(ResultActivity.lblCoxinha, coxinhaQuantity)
            intent.putExtra(ResultActivity.lblBebida, bebidaQuantity)
            startActivity(intent)

        } else {
            Toast.makeText(this, "Preencha todos os Campos.", Toast.LENGTH_SHORT).show()
        }
    }
}


