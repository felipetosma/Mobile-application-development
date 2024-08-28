import java.util.*

fun main (){

    var scanner = Scanner(System.`in`)
    var sair: Char

    do{
        coletarDados()
        println("Tecle [c] para continuar ou [s] para sair: ")
        sair = scanner.next()[0]
    } while (sair != 's')


}

fun coletarDados(){
    var scanner = Scanner(System.`in`)
    var peso: Float 
    var altura: Float

    println("Digite o seu peso: ")
    peso = scanner.nextFloat()
    println("Digite a sua altura: ")
    altura = scanner.nextFloat()

    var imc = calcularIMC(peso, altura)
    println("Seu IMC é: %.2f | ".format(imc))
    
    var result = when{
        imc <= 18.5 -> "Excesso de magreza"
        imc < 25 -> "Peso normal"
        imc < 30 -> "Excesso de peso"
        imc < 35 -> "Obesidade Grau 1"
        imc < 40 -> "Obesidade Grau 2"
        else -> "Obesidade Grau 3"
    } 
    
    println("Diagnostico: $result")
}
fun calcularIMC(peso:Float, altura:Float): Float {
    var resultado = peso/(altura*altura)
    return resultado

}