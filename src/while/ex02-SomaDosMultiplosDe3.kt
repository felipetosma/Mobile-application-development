fun main (){

    println("Digite um numero inteiro positivo: ")
    val numero = readLine()!!.toInt()

    var soma = 0
    var contador = 3
    while (contador <= numero){
        soma += contador
        contador += 3
    }

    println("A soma dos multiplos de 3 ate $numero é $soma")
}