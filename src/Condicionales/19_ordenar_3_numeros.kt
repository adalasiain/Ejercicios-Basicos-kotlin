fun main() {
    println("Ingresa un número:")
    val num1 = readLine()!!.toInt()
    println("Ingresa un número:")
    val num2 = readLine()!!.toInt()
    println("Ingresa un número:")
    val num3 = readLine()!!.toInt()

    val numeros = listOf(num1, num2, num3)

    val numeros2 = numeros.sorted()

    println("El numero Menor es: ${numeros2[0]}")
    println("El numero de enmedio es: ${numeros2[1]}")
    println("El numero Mayor es: ${numeros2[2]}")
}
