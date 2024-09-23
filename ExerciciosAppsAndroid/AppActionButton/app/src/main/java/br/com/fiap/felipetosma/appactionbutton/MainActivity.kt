// Comentário de linha

/*
 Comentário em bloco
 Comentário
 Comentário

*/


// Declarando o pacote onde esta a classe localizada do app ou budleid
package br.com.fiap.appbuttonaction

//Importando as bibliotecas necessárias para este aplicativo
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da tela usando o arquivo de layout que é o activity_main.xml
        setContentView(R.layout.activity_main)

        // Encontra o botão na interface do usuario utilizando o ID button
        val button = findViewById<Button>(R.id.button)

        //Encontra o textView
        val textView = findViewById<TextView>(R.id.textView)

        //Definindo ouvinte de clique para o botão
        button.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(view: View) {

                val message = "Parabéns pra você!"
                // Ação a ser executada quando o botão for clicado

                // mostra a informação na view;
                textView.text = message

                // O tost é mostrado no momento que eu façdo isso;
                showToast(message)
            }
        })
    }

    //Função que exibe uma mensagem em um toast
    private  fun showToast(message: String) {
        //Criar um objeto Toas para exibir a mensagem
        Toast.makeText( this, message, Toast.LENGTH_SHORT).show()
    }
}