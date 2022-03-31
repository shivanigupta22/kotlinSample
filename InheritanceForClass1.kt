// Derived class initialization order

open class Base(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int = 
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

fun main() {
    println("Constructing the derived class(\"hello\", \"world\")")
    Derived("hello", "world")
}

// baseClasssConstructor -> baseClassInit -> baseClassPropInit -> drivedClassConstructor -> drivedClassInit -> drivedClassPropInit

//output 
// Constructing the derived class("hello", "world")
// Argument for the base class: Hello
// Initializing a base class
// Initializing size in the base class: 5
// Initializing a derived class
// Initializing size in the derived class: 10
