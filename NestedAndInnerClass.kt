fun main() {
val demo = Outer().Nested().foo() // == 1
val demo2 = Outer.Nested2().foo() // == 2
}
class Outer {
    private val bar: Int = 1
    init {
        println(Nested().foo())
        println(Nested2().foo())
    }
    inner class Nested {
        fun foo() = bar // inner class can access outer class members
      fun foo2() = 2
    }
    class Nested2 {
        fun foo() = bar // will not accessible
    }
}
