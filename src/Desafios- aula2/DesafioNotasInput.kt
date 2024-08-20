fun main(){
    println ("Digite a nota da primeira avaliação: ")
    val nota1 = readLine()!!.toDouble()

    println("Digite a nota da segunda avaliação: ")
    val nota2 = readLine()!!.toDouble()

    println("Digite a nota da terceira avaliação: ")
    val nota3 = readLine()!!.toDouble()

    var media = (nota1 + nota2 + nota3)/3
    println("A média é: $media")
}