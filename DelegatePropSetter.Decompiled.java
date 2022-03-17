package com.example.samples;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"},
   d2 = {"Lcom/example/samples/Person;", "", "name", "", "lastname", "(Ljava/lang/String;Ljava/lang/String;)V", "getLastname", "()Ljava/lang/String;", "setLastname", "(Ljava/lang/String;)V", "value", "getName", "setName", "updateCount", "", "getUpdateCount", "()I", "setUpdateCount", "(I)V", "app_debug"}
)
public final class Person {
   @NotNull
   private String name;
   private int updateCount;
   @NotNull
   private String lastname;

   @NotNull
   public final String getName() {
      return this.name;
   }

   public final void setName(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      String var3 = value.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
      this.name = var3;
      int var10001 = this.updateCount++;
   }

   public final int getUpdateCount() {
      return this.updateCount;
   }

   public final void setUpdateCount(int var1) {
      this.updateCount = var1;
   }

   @NotNull
   public final String getLastname() {
      return this.lastname;
   }

   public final void setLastname(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lastname = var1;
   }

   public Person(@NotNull String name, @NotNull String lastname) {
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(lastname, "lastname");
      super();
      this.lastname = lastname;
      this.name = name;
   }
}
