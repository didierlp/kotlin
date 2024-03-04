
fun main(args:Array<String>) {

   /* it es la convención para referirce a una funcion lambda */
   val numeros = args.map{it.toInt()}.toIntArray()
   
   val suma = numeros.sum()
   
    println("Has introduciodo ${numeros.size} números.")
   
   
   for(numero in numeros){
       println("Número: $numero")
   }
   println("La suma de los valores es: $suma")
         
}