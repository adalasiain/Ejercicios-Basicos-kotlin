fun main() {
    val numeros = arrayOf(1,2,3,1,3,5,9,5,0)
    val repetidos = numeros.groupBy { it }.filter { it.value.size > 1 }.keys
    println("Los números repetidos son: $repetidos")
}
