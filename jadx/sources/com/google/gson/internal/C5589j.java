package com.google.gson.internal;

import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.j */
public abstract class C5589j {
    /* renamed from: a */
    public static boolean m22238a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* renamed from: b */
    public static Class m22239b(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }
}
