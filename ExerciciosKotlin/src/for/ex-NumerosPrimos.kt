fun main (){
    
    val num = 17
    var isPrime = true
    
    for(i in 2 until num) {
        if(num % i ==0){
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