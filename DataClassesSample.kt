fun main() {
     val user1 = user("shiv",1)
                val user4 = user1.copy()             
      println(user4.hashCode())
            println(user4.hashCode() == user1.hashCode())
            println(user1.hashCode())

  
}

data class user(var name:String,var age:Int,var age2:Int) {
  
      constructor(name: String, age:Int): this(name, -1,3)  {
          this.age = age+4
          this.age2 = age+2
             //       println("constructor  $this")
      }

}
