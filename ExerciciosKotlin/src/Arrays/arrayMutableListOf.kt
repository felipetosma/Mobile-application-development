fun main(){

    val numeros = mutableListOf<Int>()

    numeros.add(1)
    numeros.add(2)
    numeros.add(3)

    println("Lista de numeros: $numeros")

    numeros.removeAt(1)

    println("Lista de numeros após a remoção: $numeros")
}