package p652we;

import de1.C40640a;
import ed1.C40757w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p347af.C9822a;
import p347af.C9839b;
import p347af.C9841c;
import p347af.C9851e;
import p347af.C9853f;
import p361bf.C10262a;
import p375cf.C10413a;
import p375cf.C10415c;
import p390df.C12108a;
import p404ef.C12437a;
import p404ef.C12438b;
import p418ff.C12868a;
import p652we.C18542e;
import p652we.C18559k;
import p652we.C18561l;
import p666xe.C18705a;
import p680ye.C18881a;

/* renamed from: we.f */
public final class C18544f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10262a f52035a;

    /* renamed from: b */
    private final C18705a.C18706a f52036b;

    /* renamed from: we.f$a */
    public static final class C18545a {

        /* renamed from: g */
        private static final C10413a f52037g = new C10413a((C10415c) null, 1, (DefaultConstructorMarker) null);

        /* renamed from: h */
        private static final long f52038h = 1000;

        /* renamed from: i */
        private static final long f52039i = f52039i;

        /* renamed from: j */
        private static final C12438b f52040j = new C12438b(1000, f52039i);

        /* renamed from: k */
        private static final C40757w f52041k;

        /* renamed from: l */
        public static final C18546a f52042l = new C18546a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private C18561l.C18568b f52043a;

        /* renamed from: b */
        private C18532c f52044b = f52037g;

        /* renamed from: c */
        private C12437a f52045c = f52040j;

        /* renamed from: d */
        private final List f52046d = new ArrayList();

        /* renamed from: e */
        private final List f52047e = new ArrayList();

        /* renamed from: f */
        private final C10262a f52048f = C10262a.f28501b.mo26861c();

        /* renamed from: we.f$a$a */
        private static final class C18546a {
            private C18546a() {
            }

            public /* synthetic */ C18546a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            C40757w a = C40640a.m117457a();
            C41536l.m120485e(a, "Schedulers.computation()");
            f52041k = a;
        }

        /* renamed from: d */
        private final C18881a.C18882a m63054d() {
            C18532c cVar = this.f52044b;
            C18561l.C18568b bVar = this.f52043a;
            if (bVar != null) {
                return new C18881a.C18882a(cVar, bVar, this.f52045c, f52041k);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: e */
        private final C9839b m63055e() {
            List list = this.f52046d;
            list.add(new C12108a());
            return new C9839b(C41358y.m120036z0(list));
        }

        /* renamed from: f */
        private final C18705a.C18706a m63056f() {
            return new C18705a.C18706a(m63054d(), m63057g());
        }

        /* renamed from: g */
        private final C9851e.C9852a m63057g() {
            C9839b e = m63055e();
            C9853f h = m63058h();
            C9822a.C9824b bVar = new C9822a.C9824b(e);
            return new C9851e.C9852a(this.f52048f, new C9841c.C9848d.C9849a(e), new C9841c.C9844c.C9845a(f52041k, bVar, h));
        }

        /* renamed from: h */
        private final C9853f m63058h() {
            List list = this.f52047e;
            list.add(new C12868a());
            return new C9853f(C41358y.m120036z0(list));
        }

        /* renamed from: a */
        public final C18545a mo46357a(C18542e.C18543a aVar) {
            C41536l.m120490j(aVar, "factory");
            this.f52046d.add(aVar);
            return this;
        }

        /* renamed from: b */
        public final C18545a mo46358b(C18559k.C18560a aVar) {
            C41536l.m120490j(aVar, "factory");
            this.f52047e.add(aVar);
            return this;
        }

        /* renamed from: c */
        public final C18544f mo46359c() {
            return new C18544f(this.f52048f, m63056f());
        }

        /* renamed from: i */
        public final C18545a mo46360i(C18532c cVar) {
            C41536l.m120490j(cVar, "lifecycle");
            this.f52044b = cVar;
            return this;
        }

        /* renamed from: j */
        public final C18545a mo46361j(C18561l.C18568b bVar) {
            C41536l.m120490j(bVar, "factory");
            this.f52043a = bVar;
            return this;
        }
    }

    /* renamed from: we.f$b */
    static final class C18547b implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ C18544f f52049a;

        /* renamed from: b */
        final /* synthetic */ Class f52050b;

        /* renamed from: c */
        final /* synthetic */ C18705a f52051c;

        C18547b(C18544f fVar, Class cls, C18705a aVar) {
            this.f52049a = fVar;
            this.f52050b = cls;
            this.f52051c = aVar;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Object[] objArr2 = objArr;
            C10262a a = this.f52049a.f52035a;
            C41536l.m120485e(method, "method");
            if (a.mo26860c(method)) {
                C10262a a2 = this.f52049a.f52035a;
                Class cls = this.f52050b;
                C41536l.m120485e(obj, "proxy");
                return a2.mo26859b(method, cls, obj, objArr2);
            } else if (!this.f52049a.m63051j(method)) {
                return this.f52051c.mo46514a(method, objArr2);
            } else {
                C18544f fVar = this.f52049a;
                C18705a aVar = this.f52051c;
                Class cls2 = this.f52050b;
                C41536l.m120485e(obj, "proxy");
                return fVar.m63047f(method, aVar, cls2, obj, objArr2);
            }
        }
    }

    public C18544f(C10262a aVar, C18705a.C18706a aVar2) {
        C41536l.m120490j(aVar, "runtimePlatform");
        C41536l.m120490j(aVar2, "serviceFactory");
        this.f52035a = aVar;
        this.f52036b = aVar2;
    }

    /* renamed from: e */
    private final InvocationHandler m63046e(Class cls, C18705a aVar) {
        return new C18547b(this, cls, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final Object m63047f(Method method, C18705a aVar, Class cls, Object obj, Object[] objArr) {
        if (m63049h(method)) {
            boolean z = false;
            if (obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (m63052k(method)) {
            return "Scarlet service implementation for " + cls.getName();
        } else if (m63050i(method)) {
            return Integer.valueOf(aVar.hashCode());
        } else {
            throw new IllegalStateException("Cannot execute " + method);
        }
    }

    /* renamed from: g */
    private final Object m63048g(Class cls) {
        C18705a a = this.f52036b.mo46516a(cls);
        a.mo46515b();
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, m63046e(cls, a)));
    }

    /* renamed from: h */
    private final boolean m63049h(Method method) {
        if (!C41536l.m120484d(method.getName(), "equals")) {
            return false;
        }
        Class[] clsArr = {Object.class};
        Class[] parameterTypes = method.getParameterTypes();
        C41536l.m120485e(parameterTypes, "method.parameterTypes");
        return Arrays.equals(clsArr, parameterTypes);
    }

    /* renamed from: i */
    private final boolean m63050i(Method method) {
        if (!C41536l.m120484d(method.getName(), "hashCode")) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        C41536l.m120485e(parameterTypes, "method.parameterTypes");
        return parameterTypes.length == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m63051j(Method method) {
        return C41536l.m120484d(method.getDeclaringClass(), Object.class);
    }

    /* renamed from: k */
    private final boolean m63052k(Method method) {
        if (!C41536l.m120484d(method.getName(), "toString")) {
            return false;
        }
        Class[] parameterTypes = method.getParameterTypes();
        C41536l.m120485e(parameterTypes, "method.parameterTypes");
        return parameterTypes.length == 0;
    }

    /* renamed from: d */
    public final Object mo46356d(Class cls) {
        C41536l.m120490j(cls, "service");
        return m63048g(cls);
    }
}
