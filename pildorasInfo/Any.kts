
fun dameTipo(obj:Any):Any{
    return obj::class.simpleName?:"Desconocido"
}

class Persona(val nombre:String){
    override fun toString():String{
        return "Nombre: $nombre"
    }
}

fun main() {
    val numero: Any = 1
    val letra: Any ="a"
    val p1: Any = Persona("Didier")
    
    println(p1)
    println(numero)
    println(letra)
    println(dameTipo(1))
    println(dameTipo(p1))
}