//If the val is known at compile time make it const
//compiler will inline usages of the constant, replacing the reference to the constant with its actual value
//However, the field will not be removed and therefore can be interacted with using reflection.?
//constants must be a top level prop, declared with object or declared with companion object.


const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"
//Decompile Java code
//  @NotNull
// public static final String SUBSYSTEM_DEPRECATED = "This subsystem is deprecated";

object Obj {
    val SUBSYSTEM_DEPRECATED2: String = "This subsystem is deprecated2"
   fun foo() {
        print("hii\n")
    }
}
// object is a declaration (singleton class)
// It internally returns INSTANCE of the class when needed
//The initialization of an object declaration is thread-safe and done on first access.
//Object declarations are initialized lazily, when accessed for the first time.

//Decompiled java code
// public final class Obj {
//    @NotNull
//    private static final String SUBSYSTEM_DEPRECATED2;
//    @NotNull
//    public static final Obj INSTANCE;

//    @NotNull
//    public final String getSUBSYSTEM_DEPRECATED2() {
//       return SUBSYSTEM_DEPRECATED2;
//    }

//    public final void foo() {
//       String var1 = "hii";
//       System.out.print(var1);
//    }

//    private Obj() {
//    }

//    static {
//       Obj var0 = new Obj();
//       INSTANCE = var0;
//       SUBSYSTEM_DEPRECATED2 = "This subsystem is deprecated2";
//    }
// }

class COM {
    companion object {
        val SUBSYSTEM_DEPRECATED3: String = "This subsystem is deprecated3"
    }
}
// companion object is a static final inner class
// companion object should be used only when you want to define something at class level and want to use at referance of class only
// avoid using constant declarations using companion object
// A companion object is initialized when the corresponding class is loaded (resolved) that matches the semantics of a Java static initializer.



//Decompiled java code
// public final class COM {
//    @NotNull
//    private static final String SUBSYSTEM_DEPRECATED3 = "This subsystem is deprecated3";
//    @NotNull
//    public static final COM.Companion Companion = new COM.Companion((DefaultConstructorMarker)null);

//    @Metadata(
//       mv = {1, 6, 0},
//       k = 1,
//       d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"},
//       d2 = {"Lcom/example/samples/COM$Companion;", "", "()V", "SUBSYSTEM_DEPRECATED3", "", "getSUBSYSTEM_DEPRECATED3", "()Ljava/lang/String;", "foo", "", "Samples.app"}
//    )
//    public static final class Companion {
//       @NotNull
//       public final String getSUBSYSTEM_DEPRECATED3() {
//          return COM.SUBSYSTEM_DEPRECATED3;
//       }

//       public final void foo() {
//          String var1 = "hii companion";
//          System.out.print(var1);
//       }

//       private Companion() {
//       }

//       // $FF: synthetic method
//       public Companion(DefaultConstructorMarker $constructor_marker) {
//          this();
//       }
//    }
// }
@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {  }
///** @deprecated */
//    @Deprecated(
//       message = "This subsystem is deprecated"
//    )
//    public static final void foo() {
//    }

fun main() {
    println(SUBSYSTEM_DEPRECATED)// it internally resolves in Obj.INSTANCE.SUBSYSTEM_DEPRECATED
    Obj.foo() // it internally resolves in Obj.INSTANCE.foo()
    println(Obj.SUBSYSTEM_DEPRECATED2)
    COM.foo() // it internally resolves in  COM.Companion.foo();
    println(COM.SUBSYSTEM_DEPRECATED3) //it internally resolves in  COM.Companion.getSUBSYSTEM_DEPRECATED3();
}

