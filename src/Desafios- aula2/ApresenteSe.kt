fun main() {

    //Declaração de variável
    var idade = 32      //Idade do professor
    var altura = 1.70f  //Altura do professor (usando o 'f' para indicar que é um float)
    var inicial  = 'F'  // Inicial do nome do professor 

    // Impressão das informações do indivíduo usando interploação de strings 
    println("Minha inicial é $inicial, tenho $idade anos e minha $altura é %.2f".format(altura))

}