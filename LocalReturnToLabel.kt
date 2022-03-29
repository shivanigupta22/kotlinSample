// return,break,continue to labels (local returns)
// adding a custom label helps in executing local return correctly to the label only

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach rit@{
        if (it == 3) return@rit // non-local return directly to the caller of foo()
        print("$it ")
    }
    println("this point is unreachable")
}

fun main() {
    foo()
}
