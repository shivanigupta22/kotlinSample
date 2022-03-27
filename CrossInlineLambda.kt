fun main() {
    doSomething()
}

fun doSomething() {
    print("doSomething start\n")
//     doSomethingElse {
//         print("doSomethingElse\n")
//         return
//     }
//     
//     output: doSomething start doSomethingElse
//if the lambda is passed to is inlined func, the return can be inlined, as well. So non local return is allowed here
//hence return in decompiled code will return from func without executing next print statement
    
//     doSomethingElse1 {
//         print("doSomethingElse\n")
//         return
//     }
    //Error: 'return' is not allowed here
//     make lambda as crossinline which prevents non local return in case of inlined func
//     
 doSomethingElse1 {
        print("doSomethingElse\n")
        return@doSomethingElse1
    }
    //     output: doSomething start doSomethingElse doSomething end̥
    print("doSomething end")
}

inline fun doSomethingElse(abc: () -> Unit) {
    abc()
}

inline fun doSomethingElse1(crossinline abc: () -> Unit) {
    abc()
}

