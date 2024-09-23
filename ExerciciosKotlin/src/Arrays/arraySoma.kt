fun main () {

    // Array de inteiros
    val numbers = intArrayOf(5,10,15,20,25) // imutavel
    var sum = 0 // variavel mutavel

    // loop para somar os elementos do array
    for (number in numbers){
        sum += number
    }
    
    // imprima resultado
    println("Soma dos elementos do array: $sum")
}