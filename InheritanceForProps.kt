//Inheritance best practices

//overriding props
fun main() {
   val t = Temp2()
   println(t.a) //output 2
}
open class Temp {
    open val a:Int = 1
}

class Temp2:Temp() {
    override var a:Int =2
}
//1. val props can be overriden by val/var because val property essentially declares a get method,
//   and overriding it as a var additionally declares a set method in the derived class.
//2. var props can be overriden by var only


