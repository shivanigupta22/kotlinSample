fun main() {
  val ns:String = "test"
    //let scope
    // used to group execution, null checks and return its result
    // can be used using it
    println(ns?.let {
    it.contains("e") // returns result to LHS
})// true
    
    //run scope
    //executes a code block and returns its result
    // can be used using this
    println(ns?.run {                                                 
        println("\tlength = $length") 
        println("\tstring = $this")                           
        length                                               
    })
    
    //with scope
    //doesn't return anything & doesn't check for null
   	//can access member functions without needing it or this
    println(with(ns) {
    println("${toString()}:$length")   
})
    //apply scope
    // executes a block of code on an object and returns the object itself.
    // the object is referenced by this
    // function is handy for initializing objects
    val jake:Person? = Person()                                     
	val stringDescription = jake?.apply {                    
    name = "Jake"                                    
    age = 30
    about = "Android developer"
    println(this.about)
}
    println(stringDescription)
    
    //also scope
    //executes a given block and returns the object called
    //object is referenced by it
    val jake1 = Person("Jake", 30, "Android developer")   
    jake1?.also {                                          
    println(it)
    }
}

data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}
