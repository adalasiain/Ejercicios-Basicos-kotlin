fun main() {
    print("Ingresa el valor de la primera variable: ")
    var a = readln()
    print("Ingresa el valor de la segunda variable: ")
    var b = readln()
    println("Variables : a = $a, b = $b")
    val xd = a
    a = b
    b = xd
    println("Variables cambiadas: a = $a, b = $b")
}
