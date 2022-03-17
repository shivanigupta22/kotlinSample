// NavUtilWithRefToDestination.java
package com.example.samples;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"},
   d2 = {"Lcom/example/samples/NavUtilWithRefToDestination;", "Lcom/example/samples/NavigationUtil;", "navUtil", "(Lcom/example/samples/NavigationUtil;)V", "navigateTo", "", "navigateTo1", "navigateTo2", "app_debug"}
)
public final class NavUtilWithRefToDestination implements NavigationUtil {
   private final NavigationUtil navUtil;

   public void navigateTo1() {
      String var1 = "addition operation";
      System.out.print(var1);
      this.navUtil.navigateTo1();
   }

   public NavUtilWithRefToDestination(@NotNull NavigationUtil navUtil) {
      Intrinsics.checkNotNullParameter(navUtil, "navUtil");
      super();
      this.navUtil = navUtil;
   }

   public void navigateTo() {
      this.navUtil.navigateTo();
   }

   public void navigateTo2() {
      this.navUtil.navigateTo2();
   }
}
// NavigationUtil.java
package com.example.samples;

import kotlin.Metadata;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"},
   d2 = {"Lcom/example/samples/NavigationUtil;", "", "navigateTo", "", "navigateTo1", "navigateTo2", "app_debug"}
)
public interface NavigationUtil {
   void navigateTo();

   void navigateTo1();

   void navigateTo2();
}
// NavUtilImpl.java
package com.example.samples;

import kotlin.Metadata;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"},
   d2 = {"Lcom/example/samples/NavUtilImpl;", "Lcom/example/samples/NavigationUtil;", "()V", "navigateTo", "", "navigateTo1", "navigateTo2", "app_debug"}
)
public final class NavUtilImpl implements NavigationUtil {
   public void navigateTo() {
      String var1 = "navigated";
      System.out.print(var1);
   }

   public void navigateTo1() {
      String var1 = "navigated 1";
      System.out.print(var1);
   }

   public void navigateTo2() {
      String var1 = "navigated 2";
      System.out.print(var1);
   }
}
