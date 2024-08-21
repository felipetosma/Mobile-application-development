fun main (){
    println("Digite o usuario: ")
    val usuario = readLine()
    println("Digite a senha: ")
    val senha = readLine()

    if(usuario == "vinny" && senha == "123456"){
        println("Voce tem acesso ao servidor.")
    } else {
        println("Acesso negado, voce nao tem acesso")
    }

}