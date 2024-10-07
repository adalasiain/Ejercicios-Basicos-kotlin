fun main() {
    println("Ingresa un número entero:")
    var numero = readLine()!!.toInt()
    var suma :Int = 0
    while (numero != 0) {
        suma += numero % 10
        numero /= 10
    }

    println("La suma de loss dígitos es: $suma")
}
