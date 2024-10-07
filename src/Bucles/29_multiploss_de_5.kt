fun main() {
    println("Ingresa un número n:")
    val num1 = readLine()!!.toInt()

    println("Multiplos de 5 entre 1 y $num1: ")
    for (i in 1..num1) {
        if (i % 5 == 0) {
            println(i)
        }
    }
}
