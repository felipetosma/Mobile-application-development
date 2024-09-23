package br.com.fiap.felipetosma.appdino

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private lateinit var imagem: ImageView
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imagem = findViewById(R.id.imageView2)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

        btn1.setOnClickListener {
            imagem.setImageResource(R.drawable.dino1)
        }

        btn2.setOnClickListener {
            imagem.setImageResource(R.drawable.dino2)
        }

        btn3.setOnClickListener {
            imagem.setImageResource(R.drawable.dino3)
        }






    }
}