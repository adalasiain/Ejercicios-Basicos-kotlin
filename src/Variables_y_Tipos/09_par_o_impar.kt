fun main (){
    println("Ingresa un numero para saber si es par")
    val num = readln().toInt();
    if(num % 2 == 0){
        println("El numero $num es Par")
    } else {
        println("El numero $num es Impar")
    }
}