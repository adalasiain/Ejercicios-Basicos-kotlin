fun main() {
    println("Ingresa un numero:")
    val num1 = readLine()!!.toDouble()
    println("Ingresa un numero:")
    val num2 = readLine()!!.toDouble()
    println("Elige una operación:")
    println("_______________MENU_______________")
    println("| Para Sumar escribe ' + '        |")
    println("| Para Restar escribe ' - '       |")
    println("| Para Multiplicar escribe ' * '  |")
    println("| Para Dividir escribe ' / '      |")
    println("|_________________________________|")
    val operacion = readLine()
    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> {
            println("Operación no válida")
            return
        } }
    println("El resultado de $num1 $operacion $num2 es: $resultado")
}
