fun main() {
    println("Ingresa un número:")
    val n = readLine()!!.toInt()
    var factorial = 1L //Long Int
    for (i in 1..n) {
        factorial *= i
    }

    println("El factorial de $n es: $factorial")
}
