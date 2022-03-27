//Inline functions:
  // func which copies the function code inside caller function at compile time
  // make function inline only in case of multiple lambdas passed as parameters to that function
  // inline functions are used to reduce the runtime overhead of storing lambas as object 
  // Memory allocations (both for function objects and classes) and virtual calls introduce runtime overhead.
  // don't use inline func for larger funcs, it will pay off in performance
  // inline func should have 2-3lines only
  
  // can declare any lambda as noinline whose code should not get copied inside the callerc func by declaring lambda with noinline keyword

class Person {
    var name: String? = null
    //Public var is accessible inside inline func
    var lastname: String? = null
    //private var fullName: String?= null
    //Error : Public-API inline function cannot access non-public-API 'private final var fullName: String? defined in Person'
    @PublishedApi internal var fullName: String?= null
    //Need to make var internal and annotate it as @PublishedApi to access it inside inline func

    inline fun setFullName(firstName: () -> String, lastName: () -> String) {
        name = "${firstName()}"
        lastname = "${lastName()}"
        print("firstName: ${firstName()} lastName: ${lastname}\n")
        fullName = "${firstName()} ${lastName()}"
        print("fullname : ${fullName}")
    }
}

fun main() {
    val per = Person()
    per.setFullName({
        return@setFullName "xxxx"
    }, {
        return@setFullName "ttttt"
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

