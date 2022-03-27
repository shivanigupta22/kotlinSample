//In Kotlin, you can only use a normal, unqualified return to exit a named function or an anonymous function
//Return alone cannot be used with lambda directly, To exit a lambda, use a label

fun main() {
    doSomething()
}

fun doSomething() {
    print("doSomething start\n")
    doSomethingElse {
        print("doSomethingElse\n")
        //To exit a lambda, use a label
        return@doSomethingElse
    }
    print("doSomething end")
}

//     Error for below function : Return is not allowed here for lambdas because a lambda cannot make the enclosing function return

// fun doSomething() {
//     print("doSomething start\n")
//     doSomethingElse {
//         print("doSomethingElse\n")
//         return
//     }
//     print("doSomething end")
// }

fun doSomethingElse(abc: () -> Unit) {
    abc()
}
