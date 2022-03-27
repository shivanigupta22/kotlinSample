//Inline functions:
  // func which copies the function code inside caller function at compile time
  // make function inline only in case of multiple lambdas passed as parameters to that function
  // inline functions are used to reduce the runtime overhead of storing lambas as object 
  // Memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.
  // don't use inline func for larger funcs, it will pay off in performance
  // inline func should have 2-3lines only
  
  // can declare any lambda as noinline whose code should not get copied inside the callerc func by declaring lambda as noinline

class Person {
    var name: String? = null
    var lastname: String? = null

    inline fun setFullName(firstName: () -> String, lastName: () -> String) {
        print("${firstName()} ${lastName()}")
    }
}

fun main() {
    val per = Person()
    per.name = "xxxx"
    per.lastname = "ttttt"
    per.setFullName({
        return@setFullName per.name!!
    }, {
        return@setFullName per.lastname!!
    })
}
//decompile byte code of main function
//  public static final void main() {
//       Person per = new Person();
//       per.setName("xxxx");
//       per.setLastname("ttttt");
//       int $i$f$setFullName = false;
//       StringBuilder var5 = new StringBuilder();
//       int var3 = false;
//       String var10000 = per.getName();
//       Intrinsics.checkNotNull(var10000);
//       String var6 = var10000;
//       var5 = var5.append(var6).append(' ');
//       var3 = false;
//       var10000 = per.getLastname();
//       Intrinsics.checkNotNull(var10000);
//       var6 = var10000;
//       String var4 = var5.append(var6).toString();
//       System.out.print(var4);
//    }
