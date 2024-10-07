fun main() {
    println("Ingresa un año:")
    val año = readLine()!!.toInt()
    val año_b = if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
        true
    } else {
        false
    }
    if (año_b) {
        println("$año es un año bisiesto.")
    } else {
        println("$año no es un año bisiesto.")
    }
}
