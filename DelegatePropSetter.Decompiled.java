// Person.java
package com.example.samples;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"},
   d2 = {"Lcom/example/samples/Person;", "", "()V", "<set-?>", "", "lastname", "getLastname", "()Ljava/lang/String;", "setLastname", "(Ljava/lang/String;)V", "lastname$delegate", "Lcom/example/samples/Delegate;", "name", "getName", "setName", "name$delegate", "updateCount", "", "getUpdateCount", "()I", "setUpdateCount", "(I)V", "app_debug"}
)
public final class Person {
   // $FF: synthetic field
   static final KProperty[] $$delegatedProperties = new KProperty[]{(KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Person.class, "name", "getName()Ljava/lang/String;", 0)), (KProperty)Reflection.mutableProperty1(new MutablePropertyReference1Impl(Person.class, "lastname", "getLastname()Ljava/lang/String;", 0))};
   @NotNull
   private final Delegate name$delegate = new Delegate();
   @NotNull
   private final Delegate lastname$delegate = new Delegate();
   private int updateCount;

   @NotNull
   public final String getName() {
      return this.name$delegate.getValue(this, $$delegatedProperties[0]);
   }

   public final void setName(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.name$delegate.setValue(this, $$delegatedProperties[0], var1);
   }

   @NotNull
   public final String getLastname() {
      return this.lastname$delegate.getValue(this, $$delegatedProperties[1]);
   }

   public final void setLastname(@NotNull String var1) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.lastname$delegate.setValue(this, $$delegatedProperties[1], var1);
   }

   public final int getUpdateCount() {
      return this.updateCount;
   }

   public final void setUpdateCount(int var1) {
      this.updateCount = var1;
   }
}
// Delegate.java
package com.example.samples;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 6, 0},
   k = 1,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0086\u0002J'\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"},
   d2 = {"Lcom/example/samples/Delegate;", "", "()V", "formattedString", "", "getValue", "thisRef", "prop", "Lkotlin/reflect/KProperty;", "setValue", "", "value", "app_debug"}
)
public final class Delegate {
   private String formattedString = "";

   @NotNull
   public final String getValue(@Nullable Object thisRef, @NotNull KProperty prop) {
      Intrinsics.checkNotNullParameter(prop, "prop");
      return this.formattedString;
   }

   public final void setValue(@Nullable Object thisRef, @NotNull KProperty prop, @NotNull String value) {
      Intrinsics.checkNotNullParameter(prop, "prop");
      Intrinsics.checkNotNullParameter(value, "value");
      if (thisRef instanceof Person) {
         ((Person)thisRef).setUpdateCount(((Person)thisRef).getUpdateCount() + 1);
      }

      String var5 = value.toUpperCase(Locale.ROOT);
      Intrinsics.checkNotNullExpressionValue(var5, "this as java.lang.String).toUpperCase(Locale.ROOT)");
      this.formattedString = var5;
   }
}

