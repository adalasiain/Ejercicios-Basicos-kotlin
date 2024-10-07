fun main() {
    println("Ingresa un número:")
    val num1 = readLine()!!.toInt()
    var primo = true

    if (num1 <= 1) {
        primo = false
    } else {
        for (i in 2 until num1) {
            if (num1 % i == 0) {
                primo = false
                break
            }
        }
    }

    if (primo) {
        println("$num1 es un número primo.")
    } else {
        println("$num1 no es un número primo.")
    }
}
