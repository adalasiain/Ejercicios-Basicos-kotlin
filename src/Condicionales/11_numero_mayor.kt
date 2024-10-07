fun main (){
    println("Ingresa un numero")
    val num1 = readln().toInt()
    println("Ingresa un numero")
    val num2 = readln().toInt()
    println("Los numeros son: $num1 y $num2")
    if (num1 == num2 ){
        println("Los numeros son iguales")
    } else if(num1 > num2){
        println("El numero $num1 es mayor que $num2")
    } else{
        println("El numero $num2 es mayor que $num1")
    }
}