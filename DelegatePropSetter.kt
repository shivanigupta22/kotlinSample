class Person(name1: String, var lastname: String) {
   var updateCount = 0
   
   var name: String = name1
       set(value) {
           field = value.uppercase()
           updateCount++
       }
}
fun main() {
   val kotlin = Person("xxx","yyyy")
   println(kotlin.name)
   println(kotlin.updateCount)
  kotlin.name = "www"
  println(kotlin.name)
 println(kotlin.updateCount)
}
