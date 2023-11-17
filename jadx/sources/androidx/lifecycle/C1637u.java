package androidx.lifecycle;

import android.support.p013v4.media.session.C0125b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: androidx.lifecycle.u */
public final class C1637u {

    /* renamed from: a */
    public static final C1637u f4661a = new C1637u();

    /* renamed from: b */
    private static final Map f4662b = new HashMap();

    /* renamed from: c */
    private static final Map f4663c = new HashMap();

    private C1637u() {
    }

    /* renamed from: a */
    private final C1588h m5709a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            C41536l.m120488h(newInstance, "{\n            constructo…tance(`object`)\n        }");
            C0125b.m366a(newInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private final Constructor m5710b(Class cls) {
        String str;
        boolean z;
        boolean z2;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            C41536l.m120488h(str, "fullPackage");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C41536l.m120488h(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                C41536l.m120488h(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C41536l.m120488h(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c = m5711c(canonicalName);
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                c = str + '.' + c;
            }
            Class<?> cls2 = Class.forName(c);
            C41536l.m120487g(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static final String m5711c(String str) {
        C41536l.m120489i(str, "className");
        return C40439w.m117103B(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private final int m5712d(Class cls) {
        Map map = f4662b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = m5715g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    /* renamed from: e */
    private final boolean m5713e(Class cls) {
        return cls != null && C1616p.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static final C1606m m5714f(Object obj) {
        C41536l.m120489i(obj, "object");
        boolean z = obj instanceof C1606m;
        boolean z2 = obj instanceof C1579f;
        if (z && z2) {
            return new DefaultLifecycleObserverAdapter((C1579f) obj, (C1606m) obj);
        }
        if (z2) {
            return new DefaultLifecycleObserverAdapter((C1579f) obj, (C1606m) null);
        }
        if (z) {
            return (C1606m) obj;
        }
        Class<?> cls = obj.getClass();
        C1637u uVar = f4661a;
        if (uVar.m5712d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        Object obj2 = f4663c.get(cls);
        C41536l.m120486f(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            uVar.m5709a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver((C1588h) null);
        }
        int size = list.size();
        C1588h[] hVarArr = new C1588h[size];
        for (int i = 0; i < size; i++) {
            f4661a.m5709a((Constructor) list.get(i), obj);
            hVarArr[i] = null;
        }
        return new CompositeGeneratedAdaptersObserver(hVarArr);
    }

    /* renamed from: g */
    private final int m5715g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b = m5710b(cls);
        if (b != null) {
            f4663c.put(cls, C41339p.m119900e(b));
            return 2;
        } else if (C1562c.f4559c.mo4845d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (m5713e(superclass)) {
                C41536l.m120488h(superclass, "superclass");
                if (m5712d(superclass) == 1) {
                    return 1;
                }
                Object obj = f4663c.get(superclass);
                C41536l.m120486f(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            C41536l.m120488h(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (m5713e(cls2)) {
                    C41536l.m120488h(cls2, "intrface");
                    if (m5712d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f4663c.get(cls2);
                    C41536l.m120486f(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4663c.put(cls, arrayList);
            return 2;
        }
    }
}
