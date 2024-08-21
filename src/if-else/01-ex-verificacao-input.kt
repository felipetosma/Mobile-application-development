fun main (){
    println("Digite sua idade: ")
    val idadeInput = readLine() // Lê a entrada do usuário como uma String

    if(idadeInput == null){
        println("Entrada inválida.")
        return // Sai da função main se a entrada for nula
    }

    //Tenta converter a entrada de idade para um valor numérico
    val idade = idadeInput.toIntOrNull()

    //Verifica se a conversão foi bem sucedida ou se a entrada é invalida
    if(idade == null){
        println("Idade inválida. Por favor, insira um número válido.")
        return // Sai da função main se a conversão não for bem sucedida.
    }

    if(idade >= 18){
        println("Você esta velho")
    } else {
        println("Você é novinho")
    }

}