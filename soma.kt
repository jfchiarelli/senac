import kotlin.random.Random

fun soma(a: Int, b:Int): Int {
    return a + b
}

fun main () { 
val n1 = Random.nextInt (1,10)  
val n2 = Random.nextInt (1,10)
val resultado = soma(n1,n2)
println("soma $n1 + $n2 = $resultado")

}