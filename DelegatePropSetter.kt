//Delegate props are used when want to have a common impl for prop while using setter/getter
//Delegate props provides helper object for setter/getters


import kotlin.reflect.KProperty
fun main() {
   val kotlin = Person()
   println(kotlin.name)
   println(kotlin.updateCount)
       println(kotlin.lastname)

  kotlin.name = "shivi"
  println(kotlin.name)
 println(kotlin.updateCount)
    kotlin.lastname = "pandey"

    println(kotlin.lastname)

 println(kotlin.updateCount)


}

class Person() {
   var updateCount = 0 
//    var name: String = ""
//        set(value) {
//            field = value.uppercase()
//            updateCount++
//        }
//       var lastname: String = ""
//         set(value) {
//             field = value.uppercase()
//             updateCount++
//         }
//         
var name:String by Delegate()
var lastname:String by Delegate()

}


class Delegate() {
       private var formattedString: String = ""
// using thisRef we can modify the passed instance value
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {        
        return formattedString
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) { 
         if (thisRef is Person) {
      			 thisRef.updateCount++
   }
        formattedString = value.uppercase()
    }
}
