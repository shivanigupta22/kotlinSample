// used when some restricted implmentation or bounded class hierarchies required e.g at module level at compile time
// can be treated as Enum
// kotlin 1.5 introduced sealed interface 
// sealed interface restricts at library level
// sealed interface can be used in case of multiple inheritance
// sealed interface can be used with other type of classes e.g enum class

fun main() {
for(f in Constant.values())
		println("${f.testin1(22,44)}")
}

sealed interface Test {
    fun testin1(a:Int,b:Int):Int
}

enum class Constant : Test {
    PLUS {
        override fun testin1(a:Int,b:Int):Int = a+b
    },
    MINUS {
        override fun testin1(a:Int,b:Int):Int = a-b
    }
}
