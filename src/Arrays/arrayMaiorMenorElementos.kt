fun main() {

    // Array de inteiros
    val numbers = intArrayOf(8,3,12,6,20)
    var min = numbers[0] // variavel para armazenar o menor elemento
    var max = numbers[0] // variavel para armazenar o maior elemento

    // loop para encontrar o maior e o menor elemento
    for (number in numbers){
        if(number < min){
            min = number
        }
            
        if(number > max){
            max = number
        }
            
    }

    println("o menor elemento é $min")
    println("O maior elemento é $max")
}