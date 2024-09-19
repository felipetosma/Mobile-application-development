package br.com.fiap.felipe.applanchonete

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ResultActivity : AppCompatActivity() {
    private lateinit var resultadoTextView: TextView
    private lateinit var voltarButton: Button
    private lateinit var coxinhaQuantidadeTextView: TextView
    private lateinit var bebidaQuantidadeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultadoTextView = findViewById(R.id.textViewResultado)
        voltarButton = findViewById(R.id.backButton)
        coxinhaQuantidadeTextView = findViewById(R.id.textViewCoxinhaResultado)
        bebidaQuantidadeTextView = findViewById(R.id.textViewBebidaResultado)

        val coxinhaQuantitidade = intent.getIntExtra(lblCoxinha, 0)
        val bebidaQuantitidade = intent.getIntExtra(lblBebida, 0)

        val total = calculateTotal(coxinhaQuantitidade, bebidaQuantitidade)

        resultadoTextView.text = "Total a pagar: R$ $total"
    }

    private fun calculateTotal(coxinhaQuantidade: Int, bebidaQunatidade: Int): Double{
        val coxinhaPrice = 10.0
        val bebidaPrice = 15.0
        val taxaServico = 0.10

        val totalCoxinha = coxinhaQuantidade * coxinhaPrice
        val totalBebida = bebidaQunatidade * bebidaPrice
        val subtotal = totalCoxinha + totalBebida
        val totalComTaxa = subtotal + (subtotal * taxaServico)

        return totalComTaxa
    }

    companion object{
        const val lblCoxinha = "lbl_coxinha"
        const val lblBebida = "lbl_bebida"
    }


}