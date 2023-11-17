package p361bf;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bf.a */
public abstract class C10262a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C10262a f28500a;

    /* renamed from: b */
    public static final C10263a f28501b;

    /* renamed from: bf.a$a */
    public static final class C10263a {
        private C10263a() {
        }

        public /* synthetic */ C10263a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final C10262a m37441b() {
            try {
                Class.forName("java.util.Optional");
                return new C10265c();
            } catch (ClassNotFoundException unused) {
                return new C10264b();
            }
        }

        /* renamed from: c */
        public final C10262a mo26861c() {
            return C10262a.f28500a;
        }
    }

    /* renamed from: bf.a$b */
    public static final class C10264b extends C10262a {
        public C10264b() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: bf.a$c */
    public static final class C10265c extends C10262a {
        public C10265c() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public Object mo26859b(Method method, Class cls, Object obj, Object[]... objArr) {
            C41536l.m120490j(method, "method");
            C41536l.m120490j(cls, "declaringClass");
            C41536l.m120490j(obj, "proxy");
            C41536l.m120490j(objArr, "args");
            Constructor<MethodHandles.Lookup> declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
            C41536l.m120485e(declaredConstructor, "constructor");
            declaredConstructor.setAccessible(true);
            Object a = C10267c.m37446a(declaredConstructor.newInstance(new Object[]{cls, -1})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(new Object[]{objArr});
            C41536l.m120485e(a, "constructor.newInstance(…invokeWithArguments(args)");
            return a;
        }

        /* renamed from: c */
        public boolean mo26860c(Method method) {
            C41536l.m120490j(method, "method");
            return method.isDefault();
        }
    }

    static {
        C10263a aVar = new C10263a((DefaultConstructorMarker) null);
        f28501b = aVar;
        f28500a = aVar.m37441b();
    }

    private C10262a() {
    }

    public /* synthetic */ C10262a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public Object mo26859b(Method method, Class cls, Object obj, Object[]... objArr) {
        C41536l.m120490j(method, "method");
        C41536l.m120490j(cls, "declaringClass");
        C41536l.m120490j(obj, "proxy");
        C41536l.m120490j(objArr, "args");
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public boolean mo26860c(Method method) {
        C41536l.m120490j(method, "method");
        return false;
    }
}
