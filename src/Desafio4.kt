fun main(){
    println ("Digite o nome do usuario: ")
    val nome = readLine()!!.toString()

    println ("Digite a idade do usuario: ")
    val idade = readLine()!!.toInt()

    println ("Digite o email: ")
    val email = readLine()!!.toString()

    println("Nome: $nome \n idade: $idade \n email: $email")

}