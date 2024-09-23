// Declaração do pacote
package br.com.fiap.AppApresenteSe

//Importação das bibliotecas
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.com.fiap.felipetosma.appapresentese.R

class MainActivity : AppCompatActivity() {

    // Declarando as propriedades para as views que serão utilizadas
    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView

    //Método chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout da tela a partir do xml activity_view.xml
        setContentView(R.layout.activity_main)

        //Inicializando as propriedades com as view correspondentes
        nomeEmpresa = findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa = findViewById(R.id.atuacaoEmpresa)
        resultado = findViewById(R.id.resultado)

        //Definindo textos ao iniciar as view nomeEmpresa e atuacaoEmpresa
        nomeEmpresa.text = "FIAP"
        atuacaoEmpresa.text = "Android Development"
        resultado.text = ""
    }
    //Função chamanda quando o botão é clicado
    fun combinarTextos(view: View){
        //Ciar uma string combinando o texto das views nomeEmpresa e atuacaoEmpresa
        val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"

        //Definindo o texto da view resultado com o texto combinado
        resultado.text = textoFinal
    }

}