
fun main() {
    /*variable mutble*/
    var edad: Int = 29
    
    /*constante o variable inmutble*/
    val nombrePersona: String = "Didi"
    
    println("Hola  $nombrePersona tu edad es: " + edad)
    println("Hola  $nombrePersona tu edad es: ${devolverEdad()}")
    edad++
    println("Hola  $nombrePersona tu edad es: $edad")
	edad.toString()
    println(edad)
}

fun devolverEdad():Int{
    return 29
}

