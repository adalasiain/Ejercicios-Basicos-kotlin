fun main() {
    println("Ingresa un número entero:")
    var numero = readLine()!!.toInt()
    var digitos = 0
    println("El numero $numero")
    while (numero != 0) {
        numero /= 10
        digitos++
    }
    println("Tiene: $digitos dígitos.")
}
