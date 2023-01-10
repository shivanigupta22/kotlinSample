// sealed classes are abstract by itself and can have abstract members
// cannot be directly instantiated
// used when some restricted implmentation or bounded class hierarchies required e.g at module level, at compile time
// can be treated as Enum with additional functionality of having data
// Direct subclasses of sealed classes and interfaces must be declared in the same package. 
// They may be top-level or nested inside any number of other named classes, named interfaces, or named objects. 
// enum classes cannot extend sealed class but can implement sealed interface
// -> kotlin 1.6 makes sealed class when exhaustion warning
// -> kotlin 1.7 will make sealed class when exhausion error


fun main() {
 var r = Demo.A(2) // Sealed class is abstract, cannot be instantiated
r.printVal()
// var dI = DemoInherit(23)
// dI.printVal()
}
//won't work in case of private constructor
// class DemoInherit(var inV:Int) : Demo(inV) {
//     override fun printVal() {
//         println(vall)
//     }
// }

sealed class Demo {
    var vall:Any? = null
    private constructor(value:Any) {
        vall = value
    }
    
//constructor in sealed classes are by default protected
//constructor can also be declared as private and then it is only get accessed by subclass
    
   class A(val value:Int) : Demo(value) {
       override fun printVal() {
           println("$vall")
       }
   }
   class B(val value:String): Demo(value) {
        override fun printVal() {
           println("$vall")
       }
   }
   abstract fun printVal()
}
