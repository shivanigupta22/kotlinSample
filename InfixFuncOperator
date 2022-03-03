fun main() {
    //infix
    //can use it without dot operator & paranthesis
   println(2 add 3) //result 5
    println(2 add1 3) //error
   println(2 add2) //error
   
   //Rules
   //must have a single value parameter
   //should not have varargs or parameters with default values
   //should be member/extension function

}

infix fun Int.add(num:Int):Int {
    return this + num
}

infix fun Int.add1(num:Int,num2:Int):Int {
    return this + num + num2 //'infix' modifier is inapplicable on this function: must have a single value parameter
}
infix fun Int.add2(num:Int = 0):Int {
    return this + num //'infix' modifier is inapplicable on this function: should not have varargs or parameters with default values
}
