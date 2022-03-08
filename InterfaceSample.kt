// Interface can have abstract props
// Can have function body
fun main() {
InterImpl().abc()
}

class InterImpl :Inter {
    override var b = 22
    override fun abc() {
        b = 56
        println("printABCImpl $a $b")
        super.abc()
    }
}

interface Inter {
    val a:Int  get() =5
   	val b:Int
    fun abc() {
		println("printABC")  
    }
}
