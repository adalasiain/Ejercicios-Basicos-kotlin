fun main() {
    println("Ingresa tu calificación :")
    val calificacion = readLine()!!.toInt()

    val letra = when (calificacion) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 0..59 -> "F"
        else -> {
            println("Calificación no válida")
            return
        }
    }
    println("La calificación en letra es: $letra")
}
