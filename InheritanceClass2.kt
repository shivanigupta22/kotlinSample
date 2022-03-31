//when the base class constructor is executed, the properties declared or overridden in the derived class have not yet been initialized
//using any of these props may result in incorrect as below
//When designing a base class, avoid using open members in the constructors, property initializers, or init blocks.

fun main() {
   val t = Derived()
}
open class Base {
    open val size: Int = 0
    init { println("size = $size") } // throwing NPE
    //here $size is accessing drived class prop hence getting NPE
}

class Derived : Base() {
    val items = mutableListOf(1, 2, 3)
    override val size: Int get() = items.size
}
