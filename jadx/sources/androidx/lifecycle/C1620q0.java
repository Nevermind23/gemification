package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p163m0.C7052d;

/* renamed from: androidx.lifecycle.q0 */
public class C1620q0 {

    /* renamed from: a */
    private final C1636t0 f4636a;

    /* renamed from: b */
    private final C1624b f4637b;

    /* renamed from: c */
    private final C7047a f4638c;

    /* renamed from: androidx.lifecycle.q0$b */
    public interface C1624b {
        /* renamed from: a */
        C1613n0 mo4803a(Class cls, C7047a aVar);

        /* renamed from: b */
        C1613n0 mo4804b(Class cls);
    }

    /* renamed from: androidx.lifecycle.q0$c */
    public static class C1625c implements C1624b {

        /* renamed from: a */
        public static final C1626a f4644a = new C1626a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static C1625c f4645b;

        /* renamed from: c */
        public static final C7047a.C7049b f4646c = C1626a.C1627a.f4647a;

        /* renamed from: androidx.lifecycle.q0$c$a */
        public static final class C1626a {

            /* renamed from: androidx.lifecycle.q0$c$a$a */
            private static final class C1627a implements C7047a.C7049b {

                /* renamed from: a */
                public static final C1627a f4647a = new C1627a();

                private C1627a() {
                }
            }

            private C1626a() {
            }

            public /* synthetic */ C1626a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1625c mo4940a() {
                if (C1625c.f4645b == null) {
                    C1625c.f4645b = new C1625c();
                }
                C1625c c = C1625c.f4645b;
                C41536l.m120486f(c);
                return c;
            }
        }

        /* renamed from: a */
        public /* synthetic */ C1613n0 mo4803a(Class cls, C7047a aVar) {
            return C1630r0.m5685b(this, cls, aVar);
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            C41536l.m120489i(cls, "modelClass");
            try {
                Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C41536l.m120488h(newInstance, "{\n                modelC…wInstance()\n            }");
                return (C1613n0) newInstance;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }
    }

    /* renamed from: androidx.lifecycle.q0$d */
    public static class C1628d {
        /* renamed from: c */
        public abstract void mo4841c(C1613n0 n0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1620q0(C1636t0 t0Var, C1624b bVar) {
        this(t0Var, bVar, (C7047a) null, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(t0Var, "store");
        C41536l.m120489i(bVar, "factory");
    }

    /* renamed from: a */
    public C1613n0 mo4936a(Class cls) {
        C41536l.m120489i(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4937b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public C1613n0 mo4937b(String str, Class cls) {
        C1613n0 n0Var;
        C1628d dVar;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cls, "modelClass");
        C1613n0 b = this.f4636a.mo4953b(str);
        if (cls.isInstance(b)) {
            C1624b bVar = this.f4637b;
            if (bVar instanceof C1628d) {
                dVar = (C1628d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                C41536l.m120486f(b);
                dVar.mo4841c(b);
            }
            C41536l.m120487g(b, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b;
        }
        C7052d dVar2 = new C7052d(this.f4638c);
        dVar2.mo21274c(C1625c.f4646c, str);
        try {
            n0Var = this.f4637b.mo4803a(cls, dVar2);
        } catch (AbstractMethodError unused) {
            n0Var = this.f4637b.mo4804b(cls);
        }
        this.f4636a.mo4955d(str, n0Var);
        return n0Var;
    }

    /* renamed from: androidx.lifecycle.q0$a */
    public static class C1621a extends C1625c {

        /* renamed from: e */
        public static final C1622a f4639e = new C1622a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static C1621a f4640f;

        /* renamed from: g */
        public static final C7047a.C7049b f4641g = C1622a.C1623a.f4643a;

        /* renamed from: d */
        private final Application f4642d;

        /* renamed from: androidx.lifecycle.q0$a$a */
        public static final class C1622a {

            /* renamed from: androidx.lifecycle.q0$a$a$a */
            private static final class C1623a implements C7047a.C7049b {

                /* renamed from: a */
                public static final C1623a f4643a = new C1623a();

                private C1623a() {
                }
            }

            private C1622a() {
            }

            public /* synthetic */ C1622a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C1624b mo4938a(C1638u0 u0Var) {
                C41536l.m120489i(u0Var, "owner");
                if (u0Var instanceof C1591i) {
                    return ((C1591i) u0Var).getDefaultViewModelProviderFactory();
                }
                return C1625c.f4644a.mo4940a();
            }

            /* renamed from: b */
            public final C1621a mo4939b(Application application) {
                C41536l.m120489i(application, "application");
                if (C1621a.f4640f == null) {
                    C1621a.f4640f = new C1621a(application);
                }
                C1621a e = C1621a.f4640f;
                C41536l.m120486f(e);
                return e;
            }
        }

        private C1621a(Application application, int i) {
            this.f4642d = application;
        }

        /* renamed from: g */
        private final C1613n0 m5670g(Class cls, Application application) {
            if (!C1560b.class.isAssignableFrom(cls)) {
                return super.mo4804b(cls);
            }
            try {
                C1613n0 n0Var = (C1613n0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                C41536l.m120488h(n0Var, "{\n                try {\n…          }\n            }");
                return n0Var;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        /* renamed from: a */
        public C1613n0 mo4803a(Class cls, C7047a aVar) {
            C41536l.m120489i(cls, "modelClass");
            C41536l.m120489i(aVar, "extras");
            if (this.f4642d != null) {
                return mo4804b(cls);
            }
            Application application = (Application) aVar.mo21270a(f4641g);
            if (application != null) {
                return m5670g(cls, application);
            }
            if (!C1560b.class.isAssignableFrom(cls)) {
                return super.mo4804b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        /* renamed from: b */
        public C1613n0 mo4804b(Class cls) {
            C41536l.m120489i(cls, "modelClass");
            Application application = this.f4642d;
            if (application != null) {
                return m5670g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public C1621a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C1621a(Application application) {
            this(application, 0);
            C41536l.m120489i(application, "application");
        }
    }

    public C1620q0(C1636t0 t0Var, C1624b bVar, C7047a aVar) {
        C41536l.m120489i(t0Var, "store");
        C41536l.m120489i(bVar, "factory");
        C41536l.m120489i(aVar, "defaultCreationExtras");
        this.f4636a = t0Var;
        this.f4637b = bVar;
        this.f4638c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1620q0(C1636t0 t0Var, C1624b bVar, C7047a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0Var, bVar, (i & 4) != 0 ? C7047a.C7048a.f20987b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1620q0(C1638u0 u0Var) {
        this(u0Var.getViewModelStore(), C1621a.f4639e.mo4938a(u0Var), C1634s0.m5704a(u0Var));
        C41536l.m120489i(u0Var, "owner");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1620q0(C1638u0 u0Var, C1624b bVar) {
        this(u0Var.getViewModelStore(), bVar, C1634s0.m5704a(u0Var));
        C41536l.m120489i(u0Var, "owner");
        C41536l.m120489i(bVar, "factory");
    }
}
