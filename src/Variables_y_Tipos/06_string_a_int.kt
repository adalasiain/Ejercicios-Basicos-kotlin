fun main(){
    println("Ingresa un numero")
    val variable = readLine()?.toIntOrNull() ?: 0
    println("La variable se convitió de String a Int y es: $variable")
}