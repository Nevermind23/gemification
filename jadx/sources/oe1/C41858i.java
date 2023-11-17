package oe1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C41536l;

/* renamed from: oe1.i */
final class C41858i {

    /* renamed from: a */
    public static final C41858i f98233a = new C41858i();

    /* renamed from: b */
    private static final C41859a f98234b = new C41859a((Method) null, (Method) null, (Method) null);

    /* renamed from: c */
    private static C41859a f98235c;

    /* renamed from: oe1.i$a */
    private static final class C41859a {

        /* renamed from: a */
        public final Method f98236a;

        /* renamed from: b */
        public final Method f98237b;

        /* renamed from: c */
        public final Method f98238c;

        public C41859a(Method method, Method method2, Method method3) {
            this.f98236a = method;
            this.f98237b = method2;
            this.f98238c = method3;
        }
    }

    private C41858i() {
    }

    /* renamed from: a */
    private final C41859a m121276a(C41850a aVar) {
        try {
            C41859a aVar2 = new C41859a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f98235c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            C41859a aVar3 = f98234b;
            f98235c = aVar3;
            return aVar3;
        }
    }

    /* renamed from: b */
    public final String mo96654b(C41850a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        C41536l.m120489i(aVar, "continuation");
        C41859a aVar2 = f98235c;
        if (aVar2 == null) {
            aVar2 = m121276a(aVar);
        }
        if (aVar2 == f98234b) {
            return null;
        }
        Method method = aVar2.f98236a;
        if (method != null) {
            obj = method.invoke(aVar.getClass(), new Object[0]);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        Method method2 = aVar2.f98237b;
        if (method2 != null) {
            obj2 = method2.invoke(obj, new Object[0]);
        } else {
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        Method method3 = aVar2.f98238c;
        if (method3 != null) {
            obj3 = method3.invoke(obj2, new Object[0]);
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            return (String) obj3;
        }
        return null;
    }
}
