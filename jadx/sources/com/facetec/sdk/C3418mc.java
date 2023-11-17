package com.facetec.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.facetec.sdk.mc */
final class C3418mc<T> {

    /* renamed from: a */
    private final Class<?> f11231a;

    /* renamed from: b */
    private final Class[] f11232b;

    /* renamed from: c */
    private final String f11233c;

    C3418mc(Class<?> cls, String str, Class... clsArr) {
        this.f11231a = cls;
        this.f11233c = str;
        this.f11232b = clsArr;
    }

    /* renamed from: b */
    private Object m13597b(T t, Object... objArr) {
        Method d = m13599d(t.getClass());
        if (d == null) {
            return null;
        }
        try {
            return d.invoke(t, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private Method m13599d(Class<?> cls) {
        Class<?> cls2;
        String str = this.f11233c;
        if (str == null) {
            return null;
        }
        Method e = m13600e(cls, str, this.f11232b);
        if (e == null || (cls2 = this.f11231a) == null || cls2.isAssignableFrom(e.getReturnType())) {
            return e;
        }
        return null;
    }

    /* renamed from: a */
    public final Object mo9815a(T t, Object... objArr) {
        try {
            return m13598c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: c */
    public final boolean mo9816c(T t) {
        return m13599d(t.getClass()) != null;
    }

    /* renamed from: e */
    public final Object mo9817e(T t, Object... objArr) {
        try {
            return m13597b(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: c */
    private Object m13598c(T t, Object... objArr) {
        Method d = m13599d(t.getClass());
        if (d != null) {
            try {
                return d.invoke(t, objArr);
            } catch (IllegalAccessException e) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(String.valueOf(d)));
                assertionError.initCause(e);
                throw assertionError;
            }
        } else {
            StringBuilder sb = new StringBuilder("Method ");
            sb.append(this.f11233c);
            sb.append(" not supported for object ");
            sb.append(t);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: e */
    private static Method m13600e(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }
}
