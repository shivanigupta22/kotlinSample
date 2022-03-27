//Sometimes you need to access a type passed as a parameter then reified will help here
//In kotlin reified keyword is used with inline impl. 
//By inlining a func reified knows the type of generic passed parameter at the compile time.
//Type Erasure: Compiler changes all type info with base object then adds necessary type cast at compile time
// compiler while inlining func it replaces generic reified types with actual types.
//reified cannot be used in java


fun main() {
  genericsExample(33)
  //val num:String = showNum("23.4")
}

inline fun <reified T> genericsExample(value: T) {
    println(value)
    println("Type of T: ${T::class.java}")
}
//decompiled byte code

//public static final void main() {
//       Object value$iv = 33;
//       int $i$f$genericsExample = false;
//       System.out.println(value$iv);
//       String var2 = "Type of T: " + Integer.class;
//       System.out.println(var2);
//    }

 // $FF: synthetic method
//    public static final void genericsExample(Object value) {
//       int $i$f$genericsExample = 0;
//       System.out.println(value);
//       StringBuilder var10000 = (new StringBuilder()).append("Type of T: ");
//       Intrinsics.reifiedOperationMarker(4, "T");
//       String var2 = var10000.append(Object.class).toString();
//       System.out.println(var2);
//    }

inline fun <reified T> showNum(num:String):T {
            println("Type of T: ${T::class.java}")
    	 return when(T::class) {
             Int::class -> num.toInt() as T
             Float::class -> num.toFloat()  as T
             else -> num  as T
         }

}
