fun main() {
    println("Ingresa un número:")
    val num1 = readLine()!!.toInt()
    println("Ingresa un número:")
    val num2 = readLine()!!.toInt()
    var resultado : Int = 0;

    for (i in 1..num2) {
        resultado += num1
    }

    println("El numero $num1 por $num2 es: $resultado")
}