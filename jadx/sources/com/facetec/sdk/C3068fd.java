package com.facetec.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.facetec.sdk.fd */
public abstract class C3068fd {
    /* renamed from: d */
    public static C3068fd m12715d() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get((Object) null);
            final Method method = cls3.getMethod("allocateInstance", new Class[]{cls2});
            return new C3068fd() {
                /* renamed from: d */
                public final <T> T mo9283d(Class<T> cls) {
                    C3068fd.m12716e(cls);
                    return method.invoke(obj, new Object[]{cls});
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                final Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C3068fd() {
                    /* renamed from: d */
                    public final <T> T mo9283d(Class<T> cls) {
                        C3068fd.m12716e(cls);
                        return declaredMethod2.invoke((Object) null, new Object[]{cls, Integer.valueOf(intValue)});
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new C3068fd() {
                        /* renamed from: d */
                        public final <T> T mo9283d(Class<T> cls) {
                            C3068fd.m12716e(cls);
                            return declaredMethod3.invoke((Object) null, new Object[]{cls, Object.class});
                        }
                    };
                } catch (Exception unused3) {
                    return new C3068fd() {
                        /* renamed from: d */
                        public final <T> T mo9283d(Class<T> cls) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls)));
                        }
                    };
                }
            }
        }
    }

    /* renamed from: e */
    static void m12716e(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }

    /* renamed from: d */
    public abstract <T> T mo9283d(Class<T> cls);
}
