fun main (){
    
    println("Digite um numero: ")
    val number = readLine() // Lê a entrada do usuário como uma String

    if(number == null){
        println("Entrada inválida.")
        return // Sai da função main se a entrada for nula
    }

    //Tenta converter a entrada de idade para um valor numérico
    val num = number.toIntOrNull()

    //Verifica se a conversão foi bem sucedida ou se a entrada é invalida
    if(num == null){
        println("Numero inválido. Por favor, insira um número válido.")
        return // Sai da função main se a conversão não for bem sucedida.
    }
    var isPrime = true
    
    for(i in 2 until num) {
        if(num % i == 0){
            isPrime = false
            break
        }
    }

    if(isPrime){
        println("$num é um numero primo.")
    } else {
        println("$num nao é primo.")
    }
}