fun main() {
    println("Ingresa un texto:")
    val cadena = readLine()!!
    val vocales = "aeiouAEIOU"
    val conteoVocales = cadena.count { it in vocales }
    println("El texto tiene: $conteoVocales voacles")
}
