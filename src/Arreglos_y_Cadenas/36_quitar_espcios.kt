fun main() {
    println("Ingresa un texto:")
    val cadena = readLine()!!
    val cadena2 = cadena.replace(" ", "")
    println("Cadena sin espacios: $cadena2")
}
