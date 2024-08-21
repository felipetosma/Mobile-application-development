fun main (){

    val nota = 35

    val conceito = when (nota){
        in 0..49 -> "F no chat"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..100 -> "A"
        else -> "Nota invalida"
    }

    println("Conceito: $conceito")


}