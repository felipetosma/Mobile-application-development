fun main() {

    val names = arrayOf("Alice","Bob","Charlie","David", "Emma")
    val searchName = "Charlie" // elemento a ser buscado
    var found = false // variavel pra verificar se o elemento foi encontrado

    // loop para verificar se o elemento esta presente do array
    for (name in names){

        if(name == searchName){
            found = true
            break
        }
    }

    if (found){
        println("$searchName foi entontrado no array.")
    
    } else {
        println("$searchName não foi encontrado do array.")
    }


}