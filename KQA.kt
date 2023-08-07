//Q1 var immutable list vs val mutable list;; which one to choose?
// var list: List = listOf() vs val arraylist = arrayListOf()

var list: List = listOf("aa")
list = listOf("w") // possible
list?.add("") // not possible
//can be used where we only need to view the list as it's member functions won't be accessible on instance and content can't be altered

val arraylist = arrayListOf()
arraylist = arrayListOf("D") // not possible
arraylist.add("a") // possible
//can be used where list content requires modification

//immutable list are preferred as it is not going to be modified by multiple instances
//promotes functional programming as it passes value to the next function.


//Q2 lateinit usage
// dagger ==> @Inject lateinit var a:SomClass
// var that are init in lifecycle of android


//Q3 lazy init
class FastClass {
   private val slowObject: SlowClass by lazy {
       println("Slow Object initialised")
       SlowClass()
   } 
   
   fun access() {
       println(slowObject)
   }
}
fun main(args: Array<String>) {
   val fastClass = FastClass()
   println("FastClass initialised")
   fastClass.access() // here slow class will be initiated and only once
   fastClass.access()
}


//Q4 

