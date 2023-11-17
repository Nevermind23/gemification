package com.facetec.sdk;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.facetec.sdk.fu */
final class C3140fu extends C3139ft {

    /* renamed from: a */
    private static Class f10362a;

    /* renamed from: d */
    private final Object f10363d = m12888a();

    /* renamed from: e */
    private final Field f10364e = m12889c();

    C3140fu() {
    }

    /* renamed from: a */
    private static Object m12888a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f10362a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private boolean m12890c(AccessibleObject accessibleObject) {
        if (!(this.f10363d == null || this.f10364e == null)) {
            try {
                long longValue = ((Long) f10362a.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f10363d, new Object[]{this.f10364e})).longValue();
                f10362a.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f10363d, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo9330b(AccessibleObject accessibleObject) {
        if (!m12890c(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new C2997eb(sb.toString(), e);
            }
        }
    }

    /* renamed from: c */
    private static Field m12889c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
