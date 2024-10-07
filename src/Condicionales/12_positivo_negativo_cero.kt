fun main (){
    println("Ingresa un numero")
    val num1 = readln().toInt()

    if (num1 == 0 ){
        println("Los numero es cero")
    } else if(num1 > 0){
        println("El numero $num1 es Positivo")
    } else{
        println("El numero $num1 es Negativo")
    }

}