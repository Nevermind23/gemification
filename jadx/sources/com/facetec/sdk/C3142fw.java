package com.facetec.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.facetec.sdk.fw */
public class C3142fw<T> {

    /* renamed from: a */
    private int f10376a;

    /* renamed from: d */
    private Type f10377d;

    /* renamed from: e */
    private Class<? super T> f10378e;

    public C3142fw() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a = C3033et.m12666a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.f10377d = a;
            this.f10378e = C3033et.m12677d(a);
            this.f10376a = this.f10377d.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public static C3142fw<?> m12893c(Type type) {
        return new C3142fw<>(type);
    }

    /* renamed from: a */
    public final Class<? super T> mo9331a() {
        return this.f10378e;
    }

    /* renamed from: b */
    public final Type mo9332b() {
        return this.f10377d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3142fw) || !C3033et.m12675c(this.f10377d, ((C3142fw) obj).f10377d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10376a;
    }

    public final String toString() {
        return C3033et.m12681e(this.f10377d);
    }

    /* renamed from: b */
    public static <T> C3142fw<T> m12892b(Class<T> cls) {
        return new C3142fw<>(cls);
    }

    private C3142fw(Type type) {
        Type a = C3033et.m12666a((Type) C3014ep.m12632e(type));
        this.f10377d = a;
        this.f10378e = C3033et.m12677d(a);
        this.f10376a = this.f10377d.hashCode();
    }
}
