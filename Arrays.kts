fun main() {
 //Formas de declarar arrays

  val mesesDelAnio: Array<String> = arrayOf("Enero", "Febrero", "Marzo")

   val miArray = Array(5) {0}

   miArray[0] = 1
   miArray[1] = 12
   miArray[2] = 113
   miArray[3] = 1114
   miArray[4] = 11115
   
   val newArr = intArrayOf(12,15,1,126,45)

   /* Declarar un array vacio */
   lateinit var voidArr:Array<String>
   
   println(miArray.joinToString())
   println(mesesDelAnio.joinToString())
   println(newArr.joinToString())

}