fun main(){
    println("Ingresa los grados Celsius : ");
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0
    val resultado = (num1/9*5) + 32
    println("Los grados Celsius a Fahrenheit son: $resultado")
}