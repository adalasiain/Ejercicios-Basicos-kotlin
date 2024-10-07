fun main() {
    println("Ingresa una palabra:")
    val palabra = readLine()!!
    val palindromo = palabra == palabra.reversed()

    if (palindromo) {
        println("$palabra es un palíndromo.")
    } else {
        println("$palabra no es un palíndromo.")
    }
}
