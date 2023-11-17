package p666xe;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C41536l;
import p347af.C9851e;
import p680ye.C18881a;

/* renamed from: xe.a */
public final class C18705a {

    /* renamed from: a */
    private final C18881a f52354a;

    /* renamed from: b */
    private final C9851e f52355b;

    /* renamed from: xe.a$a */
    public static final class C18706a {

        /* renamed from: a */
        private final C18881a.C18882a f52356a;

        /* renamed from: b */
        private final C9851e.C9852a f52357b;

        public C18706a(C18881a.C18882a aVar, C9851e.C9852a aVar2) {
            C41536l.m120490j(aVar, "connectionFactory");
            C41536l.m120490j(aVar2, "serviceMethodExecutorFactory");
            this.f52356a = aVar;
            this.f52357b = aVar2;
        }

        /* renamed from: b */
        private final void m63350b(Class cls) {
            boolean z;
            if (cls.isInterface()) {
                Class[] interfaces = cls.getInterfaces();
                C41536l.m120485e(interfaces, "service.interfaces");
                if (interfaces.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("Service interfaces must not extend other interfaces.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Service declarations must be interfaces.".toString());
        }

        /* renamed from: a */
        public final C18705a mo46516a(Class cls) {
            C41536l.m120490j(cls, "serviceInterface");
            m63350b(cls);
            C18881a b = this.f52356a.mo46879b();
            return new C18705a(b, this.f52357b.mo26345a(cls, b));
        }
    }

    public C18705a(C18881a aVar, C9851e eVar) {
        C41536l.m120490j(aVar, "connection");
        C41536l.m120490j(eVar, "serviceMethodExecutor");
        this.f52354a = aVar;
        this.f52355b = eVar;
    }

    /* renamed from: a */
    public final Object mo46514a(Method method, Object[] objArr) {
        C41536l.m120490j(method, "method");
        C41536l.m120490j(objArr, "args");
        return this.f52355b.mo26344a(method, objArr);
    }

    /* renamed from: b */
    public final void mo46515b() {
        this.f52354a.mo46878c();
    }
}
