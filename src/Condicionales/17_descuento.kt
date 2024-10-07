fun main() {
    println("Ingresa el precio del producto: ")
    val precio = readLine()!!.toDouble()
    if (precio > 1000) {
        precio * 0.80
        println("¡¡¡Felicidades, obtuviste un descuento del 20%!!!")
        println("El precio final del producto es: $precio")
    }
    else{
        println("El precio final del producto es: $precio")
    }
}
