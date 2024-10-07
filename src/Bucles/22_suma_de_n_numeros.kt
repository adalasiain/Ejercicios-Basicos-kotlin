fun main() {
    println("Ingresa un número n:")
    val n = readLine()!!.toInt()
    val suma = (1..n).sum()

    println("La suma del 1 al $n es: $suma")
}
