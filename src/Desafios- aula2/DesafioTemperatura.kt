fun main(){
    println("Digite a temperatura em celcius: ")
    val celcius = readLine()!!.toDouble()
    
    var fahr = celcius * (9/5) + 32
    var kelvin = celcius + 273.15

    println("A temperatura atual: $celcius °C")
    println("A temperatura em Fahrenheit: $fahr °F")
    println("A temperatura em Kelvin: $kelvin K")
}