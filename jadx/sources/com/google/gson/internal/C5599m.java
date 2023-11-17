package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.m */
public abstract class C5599m {

    /* renamed from: a */
    public static final C5599m f17783a = m22251c();

    /* renamed from: com.google.gson.internal.m$a */
    class C5600a extends C5599m {

        /* renamed from: b */
        final /* synthetic */ Method f17784b;

        /* renamed from: c */
        final /* synthetic */ Object f17785c;

        C5600a(Method method, Object obj) {
            this.f17784b = method;
            this.f17785c = obj;
        }

        /* renamed from: d */
        public Object mo18437d(Class cls) {
            C5599m.m22250b(cls);
            return this.f17784b.invoke(this.f17785c, new Object[]{cls});
        }
    }

    /* renamed from: com.google.gson.internal.m$b */
    class C5601b extends C5599m {

        /* renamed from: b */
        final /* synthetic */ Method f17786b;

        /* renamed from: c */
        final /* synthetic */ int f17787c;

        C5601b(Method method, int i) {
            this.f17786b = method;
            this.f17787c = i;
        }

        /* renamed from: d */
        public Object mo18437d(Class cls) {
            C5599m.m22250b(cls);
            return this.f17786b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f17787c)});
        }
    }

    /* renamed from: com.google.gson.internal.m$c */
    class C5602c extends C5599m {

        /* renamed from: b */
        final /* synthetic */ Method f17788b;

        C5602c(Method method) {
            this.f17788b = method;
        }

        /* renamed from: d */
        public Object mo18437d(Class cls) {
            C5599m.m22250b(cls);
            return this.f17788b.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    /* renamed from: com.google.gson.internal.m$d */
    class C5603d extends C5599m {
        C5603d() {
        }

        /* renamed from: d */
        public Object mo18437d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22250b(Class cls) {
        String a = C5557c.m22189a(cls);
        if (a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a);
        }
    }

    /* renamed from: c */
    private static C5599m m22251c() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new C5600a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C5601b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new C5602c(declaredMethod3);
                } catch (Exception unused3) {
                    return new C5603d();
                }
            }
        }
    }

    /* renamed from: d */
    public abstract Object mo18437d(Class cls);
}
