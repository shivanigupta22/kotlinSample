fun main() {
val demo = Outer().Nested().foo() // == 1
val demo2 = Outer.Nested2().foo() // == 2
}
class Outer {
    private val bar: Int = 1
    init {
        println(Nested().foo()) // 1
        println(Nested2().foo()) // 2
        println(b1) // not accessible
        println(b2) // not accessible
    }
    inner class Nested {
        val b1= 4
        fun foo() = bar // inner class can access outer class members
      fun foo2() = 2
    }
    class Nested2 {
         val b2= 5
        fun foo() = bar // will not accessible
    }
}
