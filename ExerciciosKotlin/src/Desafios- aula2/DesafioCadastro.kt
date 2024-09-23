fun main(){
    println ("Digite o nome do usuario: ")
    val nome = readLine()!!

    println ("Digite a idade do usuario: ")
    val idade = readLine()!!.toInt()

    println ("Digite o email: ")
    val email = readLine()!!

    println("O usuario está ativo ? (true/false)")
    var usuarioAtivo = readLine()!!.toBoolean()

    println("Nome: $nome")
    println("Idade: $idade")
    println("Email: $email")
    println("Usuário Ativo: $usuarioAtivo")

}