package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
final class C1562c {

    /* renamed from: c */
    static C1562c f4559c = new C1562c();

    /* renamed from: a */
    private final Map f4560a = new HashMap();

    /* renamed from: b */
    private final Map f4561b = new HashMap();

    /* renamed from: androidx.lifecycle.c$a */
    static class C1563a {

        /* renamed from: a */
        final Map f4562a = new HashMap();

        /* renamed from: b */
        final Map f4563b;

        C1563a(Map map) {
            this.f4563b = map;
            for (Map.Entry entry : map.entrySet()) {
                C1593j.C1594a aVar = (C1593j.C1594a) entry.getValue();
                List list = (List) this.f4562a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f4562a.put(aVar, list);
                }
                list.add((C1564b) entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m5562b(List list, C1619q qVar, C1593j.C1594a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C1564b) list.get(size)).mo4847a(qVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4846a(C1619q qVar, C1593j.C1594a aVar, Object obj) {
            m5562b((List) this.f4562a.get(aVar), qVar, aVar, obj);
            m5562b((List) this.f4562a.get(C1593j.C1594a.ON_ANY), qVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    static final class C1564b {

        /* renamed from: a */
        final int f4564a;

        /* renamed from: b */
        final Method f4565b;

        C1564b(int i, Method method) {
            this.f4564a = i;
            this.f4565b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4847a(C1619q qVar, C1593j.C1594a aVar, Object obj) {
            try {
                int i = this.f4564a;
                if (i == 0) {
                    this.f4565b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f4565b.invoke(obj, new Object[]{qVar});
                } else if (i == 2) {
                    this.f4565b.invoke(obj, new Object[]{qVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1564b)) {
                return false;
            }
            C1564b bVar = (C1564b) obj;
            if (this.f4564a != bVar.f4564a || !this.f4565b.getName().equals(bVar.f4565b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f4564a * 31) + this.f4565b.getName().hashCode();
        }
    }

    C1562c() {
    }

    /* renamed from: a */
    private C1563a m5557a(Class cls, Method[] methodArr) {
        int i;
        C1563a c;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c = mo4844c(superclass)) == null)) {
            hashMap.putAll(c.f4563b);
        }
        for (Class c2 : cls.getInterfaces()) {
            for (Map.Entry entry : mo4844c(c2).f4563b.entrySet()) {
                m5559e(hashMap, (C1564b) entry.getKey(), (C1593j.C1594a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m5558b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1646z zVar = (C1646z) method.getAnnotation(C1646z.class);
            if (zVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (C1619q.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1593j.C1594a value = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!C1593j.C1594a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1593j.C1594a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m5559e(hashMap, new C1564b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1563a aVar = new C1563a(hashMap);
        this.f4560a.put(cls, aVar);
        this.f4561b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m5558b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m5559e(Map map, C1564b bVar, C1593j.C1594a aVar, Class cls) {
        C1593j.C1594a aVar2 = (C1593j.C1594a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f4565b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C1563a mo4844c(Class cls) {
        C1563a aVar = (C1563a) this.f4560a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m5557a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo4845d(Class cls) {
        Boolean bool = (Boolean) this.f4561b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b = m5558b(cls);
        for (Method annotation : b) {
            if (((C1646z) annotation.getAnnotation(C1646z.class)) != null) {
                m5557a(cls, b);
                return true;
            }
        }
        this.f4561b.put(cls, Boolean.FALSE);
        return false;
    }
}
