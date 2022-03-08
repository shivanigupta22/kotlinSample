// used when some restricted implmentation or bounded class hierarchies required e.g at module level at compile time
// can be treated as Enum with additional functionality of having data
// Direct subclasses of sealed classes and interfaces must be declared in the same package. 
// They may be top-level or nested inside any number of other named classes, named interfaces, or named objects. 
// -> kotlin 1.6 makes sealed class when exhaustion warning
// -> kotlin 1.7 will make sealed class when exhausion error


fun main() {
 var r = Demo(true) // Sealed class is abstract, cannot be instantiated
 var r1 = Demo.A(3)
r1.printVal()
}

sealed class Demo {

//constructor in sealed classes are by default protected and can be declared as private as well
    
   class A(val value:Int) : Demo() {
       override fun printVal() {
           println("$value")
       }
   }
   class B(val value:String): Demo() {
        override fun printVal() {
           println("$value")
       }
   }
   abstract fun printVal()
}
