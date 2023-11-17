package com.facetec.sdk;

import java.lang.reflect.Type;

/* renamed from: com.facetec.sdk.fb */
public final class C3064fb {
    /* renamed from: b */
    public static <T> Class<T> m12710b(Class<T> cls) {
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

    /* renamed from: e */
    public static boolean m12711e(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
