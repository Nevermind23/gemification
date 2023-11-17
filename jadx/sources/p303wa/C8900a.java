package p303wa;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: wa.a */
public abstract class C8900a {

    /* renamed from: a */
    private static final C8902b f24913a;

    /* renamed from: wa.a$b */
    private static abstract class C8902b {
        private C8902b() {
        }

        /* renamed from: a */
        public abstract Method mo24329a(Class cls, Field field);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Constructor mo24330b(Class cls);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract String[] mo24331c(Class cls);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract boolean mo24332d(Class cls);
    }

    /* renamed from: wa.a$c */
    private static class C8903c extends C8902b {
        private C8903c() {
            super();
        }

        /* renamed from: a */
        public Method mo24329a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Constructor mo24330b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String[] mo24331c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo24332d(Class cls) {
            return false;
        }
    }

    /* renamed from: wa.a$d */
    private static class C8904d extends C8902b {

        /* renamed from: a */
        private final Method f24914a;

        /* renamed from: b */
        private final Method f24915b;

        /* renamed from: c */
        private final Method f24916c;

        /* renamed from: d */
        private final Method f24917d;

        /* renamed from: a */
        public Method mo24329a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e) {
                throw C8900a.m33066d(e);
            }
        }

        /* renamed from: b */
        public Constructor mo24330b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f24915b.invoke(cls, new Object[0]);
                Class[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.f24917d.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw C8900a.m33066d(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String[] mo24331c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f24915b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.f24916c.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw C8900a.m33066d(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo24332d(Class cls) {
            try {
                return ((Boolean) this.f24914a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw C8900a.m33066d(e);
            }
        }

        private C8904d() {
            super();
            Class<Class> cls = Class.class;
            this.f24914a = cls.getMethod("isRecord", new Class[0]);
            Method method = cls.getMethod("getRecordComponents", new Class[0]);
            this.f24915b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f24916c = componentType.getMethod("getName", new Class[0]);
            this.f24917d = componentType.getMethod("getType", new Class[0]);
        }
    }

    static {
        C8902b bVar;
        try {
            bVar = new C8904d();
        } catch (NoSuchMethodException unused) {
            bVar = new C8903c();
        }
        f24913a = bVar;
    }

    /* renamed from: b */
    private static void m33064b(AccessibleObject accessibleObject, StringBuilder sb) {
        Class[] clsArr;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            clsArr = ((Method) accessibleObject).getParameterTypes();
        } else {
            clsArr = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(clsArr[i].getSimpleName());
        }
        sb.append(')');
    }

    /* renamed from: c */
    public static String m33065c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m33064b(constructor, sb);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static RuntimeException m33066d(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    /* renamed from: e */
    public static RuntimeException m33067e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* renamed from: f */
    public static String m33068f(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            Field field = (Field) accessibleObject;
            str = "field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m33064b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m33065c((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: g */
    public static Method m33069g(Class cls, Field field) {
        return f24913a.mo24329a(cls, field);
    }

    /* renamed from: h */
    public static Constructor m33070h(Class cls) {
        return f24913a.mo24330b(cls);
    }

    /* renamed from: i */
    public static String[] m33071i(Class cls) {
        return f24913a.mo24331c(cls);
    }

    /* renamed from: j */
    public static boolean m33072j(Class cls) {
        return f24913a.mo24332d(cls);
    }

    /* renamed from: k */
    public static void m33073k(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String f = m33068f(accessibleObject, false);
            throw new JsonIOException("Failed making " + f + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", e);
        }
    }

    /* renamed from: l */
    public static String m33074l(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + m33065c(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
        }
    }
}
