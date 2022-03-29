//backing field is only used as a part of a property to hold its value in memory. Fields cannot be declared directly.
// If want to override default impl of setter/getter, backing field can be helpful in that case to provide reference to the accessor

class Person {
   var name:String = ""
    get() = field
    set(value) {
        field = value+"hiiiiii"
    }
//         var name:String
//     get() = name
//     set(value) {
//         name = value
//     }
//     
//     Error: Exception in thread "main" java.lang.StackOverflowError at Person.setName (File.kt:12) 
//     Here name = value tries to call setName(value) method everytime recursively
}

fun main() {
    val p = Person()
    p.name = "xxx"
    print("${p.name}")
}
