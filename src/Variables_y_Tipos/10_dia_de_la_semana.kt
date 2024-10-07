fun main() {
    var num: Int?
    do {
        print("Ingresa un número del 1 al 7: ")
        num = readLine()?.toIntOrNull()
        if (num == null || num !in 1..7) {
            println("Número no válido, por favor ingresa un número entre 1 y 7.")
        }
    } while (num == null || num !in 1..7)
    val diaSemana = when (num) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Ingresaste un numero fuera del rango (1-7)"
    }

    println("El día de la semana es: $diaSemana")
}
