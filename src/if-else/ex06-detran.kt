fun main (){

    val idade = 25
    val possuiCNH = true

    if(idade >= 18 && possuiCNH){
        println("Voce pode dirigir legalmente.")
    } else {
        println("Voce nao pode dirigir legalmente.")
    }

    // Exemplo de como usar o ||
    val temIngresso = false
    val estaComCamisaDoTime = true

    if(temIngresso || estaComCamisaDoTime){
        println("Voce pode entra no estadio.")
    } else {
        println("Voce nao pode entrar no estadio.")
    }
}