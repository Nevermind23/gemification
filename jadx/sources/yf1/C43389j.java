package yf1;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: yf1.j */
public final class C43389j {

    /* renamed from: d */
    public static final C43390a f101235d = new C43390a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Method f101236a;

    /* renamed from: b */
    private final Method f101237b;

    /* renamed from: c */
    private final Method f101238c;

    /* renamed from: yf1.j$a */
    public static final class C43390a {
        private C43390a() {
        }

        public /* synthetic */ C43390a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43389j mo102071a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method2 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method3 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method2 = null;
                method3 = null;
                method = null;
            }
            return new C43389j(method2, method, method3);
        }
    }

    public C43389j(Method method, Method method2, Method method3) {
        this.f101236a = method;
        this.f101237b = method2;
        this.f101238c = method3;
    }

    /* renamed from: a */
    public final Object mo102069a(String str) {
        C41536l.m120489i(str, "closer");
        Method method = this.f101236a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.f101237b;
                C41536l.m120486f(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo102070b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f101238c;
            C41536l.m120486f(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
