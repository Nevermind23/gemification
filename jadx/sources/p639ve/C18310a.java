package p639ve;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ve.a */
public final class C18310a {

    /* renamed from: c */
    public static final C18311a f51746c = new C18311a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final AtomicReference f51747a;

    /* renamed from: b */
    private final C18312b f51748b;

    /* renamed from: ve.a$a */
    public static final class C18311a {
        private C18311a() {
        }

        public /* synthetic */ C18311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final C18310a m62632b(C18312b bVar, C43075l lVar) {
            C18315c cVar = new C18315c(bVar);
            lVar.invoke(cVar);
            return new C18310a(cVar.mo46074a(), (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C18310a mo46059a(C43075l lVar) {
            C41536l.m120490j(lVar, "init");
            return m62632b((C18312b) null, lVar);
        }
    }

    /* renamed from: ve.a$b */
    public static final class C18312b {

        /* renamed from: a */
        private final Object f51749a;

        /* renamed from: b */
        private final Map f51750b;

        /* renamed from: c */
        private final List f51751c;

        /* renamed from: ve.a$b$a */
        public static final class C18313a {

            /* renamed from: a */
            private final List f51752a = new ArrayList();

            /* renamed from: b */
            private final List f51753b = new ArrayList();

            /* renamed from: c */
            private final LinkedHashMap f51754c = new LinkedHashMap();

            /* renamed from: ve.a$b$a$a */
            public static final class C18314a {

                /* renamed from: a */
                private final Object f51755a;

                /* renamed from: b */
                private final Object f51756b;

                public C18314a(Object obj, Object obj2) {
                    C41536l.m120490j(obj, "toState");
                    this.f51755a = obj;
                    this.f51756b = obj2;
                }

                /* renamed from: a */
                public final Object mo46069a() {
                    return this.f51755a;
                }

                /* renamed from: b */
                public final Object mo46070b() {
                    return this.f51756b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C18314a)) {
                        return false;
                    }
                    C18314a aVar = (C18314a) obj;
                    return C41536l.m120484d(this.f51755a, aVar.f51755a) && C41536l.m120484d(this.f51756b, aVar.f51756b);
                }

                public int hashCode() {
                    Object obj = this.f51755a;
                    int i = 0;
                    int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
                    Object obj2 = this.f51756b;
                    if (obj2 != null) {
                        i = obj2.hashCode();
                    }
                    return hashCode + i;
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.f51755a + ", sideEffect=" + this.f51756b + ")";
                }
            }

            /* renamed from: a */
            public final List mo46066a() {
                return this.f51752a;
            }

            /* renamed from: b */
            public final List mo46067b() {
                return this.f51753b;
            }

            /* renamed from: c */
            public final LinkedHashMap mo46068c() {
                return this.f51754c;
            }
        }

        public C18312b(Object obj, Map map, List list) {
            C41536l.m120490j(obj, "initialState");
            C41536l.m120490j(map, "stateDefinitions");
            C41536l.m120490j(list, "onTransitionListeners");
            this.f51749a = obj;
            this.f51750b = map;
            this.f51751c = list;
        }

        /* renamed from: a */
        public final Object mo46060a() {
            return this.f51749a;
        }

        /* renamed from: b */
        public final List mo46061b() {
            return this.f51751c;
        }

        /* renamed from: c */
        public final Map mo46062c() {
            return this.f51750b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18312b)) {
                return false;
            }
            C18312b bVar = (C18312b) obj;
            return C41536l.m120484d(this.f51749a, bVar.f51749a) && C41536l.m120484d(this.f51750b, bVar.f51750b) && C41536l.m120484d(this.f51751c, bVar.f51751c);
        }

        public int hashCode() {
            Object obj = this.f51749a;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Map map = this.f51750b;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
            List list = this.f51751c;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "Graph(initialState=" + this.f51749a + ", stateDefinitions=" + this.f51750b + ", onTransitionListeners=" + this.f51751c + ")";
        }
    }

    /* renamed from: ve.a$c */
    public static final class C18315c {

        /* renamed from: a */
        private Object f51757a;

        /* renamed from: b */
        private final LinkedHashMap f51758b;

        /* renamed from: c */
        private final ArrayList f51759c;

        /* renamed from: ve.a$c$a */
        public final class C18316a {

            /* renamed from: a */
            private final C18312b.C18313a f51760a = new C18312b.C18313a();

            /* renamed from: ve.a$c$a$a */
            static final class C18317a extends C41537m implements C43079p {

                /* renamed from: d */
                final /* synthetic */ C43079p f51762d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18317a(C43079p pVar) {
                    super(2);
                    this.f51762d = pVar;
                }

                /* renamed from: a */
                public final C18312b.C18313a.C18314a invoke(Object obj, Object obj2) {
                    C41536l.m120490j(obj, "state");
                    C41536l.m120490j(obj2, "event");
                    return (C18312b.C18313a.C18314a) this.f51762d.invoke(obj, obj2);
                }
            }

            /* renamed from: ve.a$c$a$b */
            static final class C18318b extends C41537m implements C43079p {

                /* renamed from: d */
                final /* synthetic */ C43079p f51763d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C18318b(C43079p pVar) {
                    super(2);
                    this.f51763d = pVar;
                }

                /* renamed from: a */
                public final void mo46084a(Object obj, Object obj2) {
                    C41536l.m120490j(obj, "state");
                    C41536l.m120490j(obj2, "cause");
                    this.f51763d.invoke(obj, obj2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    mo46084a(obj, obj2);
                    return C41238w.f97225a;
                }
            }

            public C18316a() {
            }

            /* renamed from: c */
            public static /* synthetic */ C18312b.C18313a.C18314a m62646c(C18316a aVar, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    obj2 = null;
                }
                return aVar.mo46079b(obj, obj2);
            }

            /* renamed from: g */
            public static /* synthetic */ C18312b.C18313a.C18314a m62647g(C18316a aVar, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                return aVar.mo46082f(obj, obj2, obj3);
            }

            /* renamed from: a */
            public final C18312b.C18313a mo46078a() {
                return this.f51760a;
            }

            /* renamed from: b */
            public final C18312b.C18313a.C18314a mo46079b(Object obj, Object obj2) {
                C41536l.m120490j(obj, "receiver$0");
                return mo46082f(obj, obj, obj2);
            }

            /* renamed from: d */
            public final void mo46080d(C18319d dVar, C43079p pVar) {
                C41536l.m120490j(dVar, "eventMatcher");
                C41536l.m120490j(pVar, "createTransitionTo");
                this.f51760a.mo46068c().put(dVar, new C18317a(pVar));
            }

            /* renamed from: e */
            public final boolean mo46081e(C43079p pVar) {
                C41536l.m120490j(pVar, "listener");
                return this.f51760a.mo46066a().add(new C18318b(pVar));
            }

            /* renamed from: f */
            public final C18312b.C18313a.C18314a mo46082f(Object obj, Object obj2, Object obj3) {
                C41536l.m120490j(obj, "receiver$0");
                C41536l.m120490j(obj2, "state");
                return new C18312b.C18313a.C18314a(obj2, obj3);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = r3.mo46062c();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C18315c(p639ve.C18310a.C18312b r3) {
            /*
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L_0x000a
                java.lang.Object r0 = r3.mo46060a()
                goto L_0x000b
            L_0x000a:
                r0 = 0
            L_0x000b:
                r2.f51757a = r0
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                if (r3 == 0) goto L_0x0018
                java.util.Map r1 = r3.mo46062c()
                if (r1 == 0) goto L_0x0018
                goto L_0x001c
            L_0x0018:
                java.util.Map r1 = ie1.C41344r0.m119928j()
            L_0x001c:
                r0.<init>(r1)
                r2.f51758b = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                if (r3 == 0) goto L_0x002c
                java.util.List r3 = r3.mo46061b()
                if (r3 == 0) goto L_0x002c
                goto L_0x0030
            L_0x002c:
                java.util.List r3 = ie1.C41341q.m119907j()
            L_0x0030:
                r0.<init>(r3)
                r2.f51759c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p639ve.C18310a.C18315c.<init>(ve.a$b):void");
        }

        /* renamed from: a */
        public final C18312b mo46074a() {
            Object obj = this.f51757a;
            if (obj != null) {
                return new C18312b(obj, C41344r0.m119941w(this.f51758b), C41358y.m120036z0(this.f51759c));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        /* renamed from: b */
        public final void mo46075b(Object obj) {
            C41536l.m120490j(obj, "initialState");
            this.f51757a = obj;
        }

        /* renamed from: c */
        public final void mo46076c(C43075l lVar) {
            C41536l.m120490j(lVar, "listener");
            this.f51759c.add(lVar);
        }

        /* renamed from: d */
        public final void mo46077d(C18319d dVar, C43075l lVar) {
            C41536l.m120490j(dVar, "stateMatcher");
            C41536l.m120490j(lVar, "init");
            LinkedHashMap linkedHashMap = this.f51758b;
            C18316a aVar = new C18316a();
            lVar.invoke(aVar);
            linkedHashMap.put(dVar, aVar.mo46078a());
        }
    }

    /* renamed from: ve.a$e */
    public static abstract class C18323e {

        /* renamed from: ve.a$e$a */
        public static final class C18324a extends C18323e {

            /* renamed from: a */
            private final Object f51769a;

            /* renamed from: b */
            private final Object f51770b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18324a(Object obj, Object obj2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(obj, "fromState");
                C41536l.m120490j(obj2, "event");
                this.f51769a = obj;
                this.f51770b = obj2;
            }

            /* renamed from: a */
            public Object mo46090a() {
                return this.f51769a;
            }

            /* renamed from: b */
            public Object mo46091b() {
                return this.f51770b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C18324a)) {
                    return false;
                }
                C18324a aVar = (C18324a) obj;
                return C41536l.m120484d(mo46090a(), aVar.mo46090a()) && C41536l.m120484d(mo46091b(), aVar.mo46091b());
            }

            public int hashCode() {
                Object a = mo46090a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                Object b = mo46091b();
                if (b != null) {
                    i = b.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                return "Invalid(fromState=" + mo46090a() + ", event=" + mo46091b() + ")";
            }
        }

        /* renamed from: ve.a$e$b */
        public static final class C18325b extends C18323e {

            /* renamed from: a */
            private final Object f51771a;

            /* renamed from: b */
            private final Object f51772b;

            /* renamed from: c */
            private final Object f51773c;

            /* renamed from: d */
            private final Object f51774d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C18325b(Object obj, Object obj2, Object obj3, Object obj4) {
                super((DefaultConstructorMarker) null);
                C41536l.m120490j(obj, "fromState");
                C41536l.m120490j(obj2, "event");
                C41536l.m120490j(obj3, "toState");
                this.f51771a = obj;
                this.f51772b = obj2;
                this.f51773c = obj3;
                this.f51774d = obj4;
            }

            /* renamed from: a */
            public Object mo46090a() {
                return this.f51771a;
            }

            /* renamed from: b */
            public Object mo46095b() {
                return this.f51772b;
            }

            /* renamed from: c */
            public final Object mo46096c() {
                return this.f51773c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C18325b)) {
                    return false;
                }
                C18325b bVar = (C18325b) obj;
                return C41536l.m120484d(mo46090a(), bVar.mo46090a()) && C41536l.m120484d(mo46095b(), bVar.mo46095b()) && C41536l.m120484d(this.f51773c, bVar.f51773c) && C41536l.m120484d(this.f51774d, bVar.f51774d);
            }

            public int hashCode() {
                Object a = mo46090a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                Object b = mo46095b();
                int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
                Object obj = this.f51773c;
                int hashCode3 = (hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
                Object obj2 = this.f51774d;
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                return hashCode3 + i;
            }

            public String toString() {
                return "Valid(fromState=" + mo46090a() + ", event=" + mo46095b() + ", toState=" + this.f51773c + ", sideEffect=" + this.f51774d + ")";
            }
        }

        private C18323e() {
        }

        public /* synthetic */ C18323e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract Object mo46090a();
    }

    private C18310a(C18312b bVar) {
        this.f51748b = bVar;
        this.f51747a = new AtomicReference(bVar.mo46060a());
    }

    /* renamed from: a */
    private final C18312b.C18313a m62625a(Object obj) {
        Map c = this.f51748b.mo46062c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c.entrySet()) {
            if (((C18319d) entry.getKey()).mo46085b(obj)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry value : linkedHashMap.entrySet()) {
            arrayList.add((C18312b.C18313a) value.getValue());
        }
        C18312b.C18313a aVar = (C18312b.C18313a) C41358y.m120009Y(arrayList);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Missing definition for state " + obj.getClass().getSimpleName() + '!').toString());
    }

    /* renamed from: c */
    private final C18323e m62626c(Object obj, Object obj2) {
        for (Map.Entry entry : m62625a(obj).mo46068c().entrySet()) {
            C43079p pVar = (C43079p) entry.getValue();
            if (((C18319d) entry.getKey()).mo46085b(obj2)) {
                C18312b.C18313a.C18314a aVar = (C18312b.C18313a.C18314a) pVar.invoke(obj, obj2);
                return new C18323e.C18325b(obj, obj2, aVar.mo46069a(), aVar.mo46070b());
            }
        }
        return new C18323e.C18324a(obj, obj2);
    }

    /* renamed from: d */
    private final void m62627d(Object obj, Object obj2) {
        for (C43079p invoke : m62625a(obj).mo46066a()) {
            invoke.invoke(obj, obj2);
        }
    }

    /* renamed from: e */
    private final void m62628e(Object obj, Object obj2) {
        for (C43079p invoke : m62625a(obj).mo46067b()) {
            invoke.invoke(obj, obj2);
        }
    }

    /* renamed from: f */
    private final void m62629f(C18323e eVar) {
        for (C43075l invoke : this.f51748b.mo46061b()) {
            invoke.invoke(eVar);
        }
    }

    /* renamed from: b */
    public final Object mo46057b() {
        Object obj = this.f51747a.get();
        C41536l.m120485e(obj, "stateRef.get()");
        return obj;
    }

    /* renamed from: g */
    public final C18323e mo46058g(Object obj) {
        C18323e c;
        C41536l.m120490j(obj, "event");
        synchronized (this) {
            Object obj2 = this.f51747a.get();
            C41536l.m120485e(obj2, "fromState");
            c = m62626c(obj2, obj);
            if (c instanceof C18323e.C18325b) {
                this.f51747a.set(((C18323e.C18325b) c).mo46096c());
            }
        }
        m62629f(c);
        if (c instanceof C18323e.C18325b) {
            C18323e.C18325b bVar = (C18323e.C18325b) c;
            m62628e(bVar.mo46090a(), obj);
            m62627d(bVar.mo46096c(), obj);
        }
        return c;
    }

    /* renamed from: ve.a$d */
    public static final class C18319d {

        /* renamed from: c */
        public static final C18320a f51764c = new C18320a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final List f51765a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Class f51766b;

        /* renamed from: ve.a$d$a */
        public static final class C18320a {
            private C18320a() {
            }

            public /* synthetic */ C18320a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C18319d mo46087a(Class cls) {
                C41536l.m120490j(cls, "clazz");
                return new C18319d(cls, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: ve.a$d$b */
        static final class C18321b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18319d f51767d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18321b(C18319d dVar) {
                super(1);
                this.f51767d = dVar;
            }

            /* renamed from: a */
            public final boolean mo46088a(Object obj) {
                C41536l.m120490j(obj, "it");
                return this.f51767d.f51766b.isInstance(obj);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo46088a(obj));
            }
        }

        /* renamed from: ve.a$d$c */
        static final class C18322c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f51768d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18322c(C43075l lVar) {
                super(1);
                this.f51768d = lVar;
            }

            /* renamed from: a */
            public final boolean mo46089a(Object obj) {
                C41536l.m120490j(obj, "it");
                return ((Boolean) this.f51768d.invoke(obj)).booleanValue();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(mo46089a(obj));
            }
        }

        private C18319d(Class cls) {
            this.f51766b = cls;
            this.f51765a = C41341q.m119913p(new C18321b(this));
        }

        /* renamed from: b */
        public final boolean mo46085b(Object obj) {
            C41536l.m120490j(obj, C11755a.C11756a.f34100b);
            List<C43075l> list = this.f51765a;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (C43075l invoke : list) {
                if (!((Boolean) invoke.invoke(obj)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: c */
        public final C18319d mo46086c(C43075l lVar) {
            C41536l.m120490j(lVar, "predicate");
            this.f51765a.add(new C18322c(lVar));
            return this;
        }

        public /* synthetic */ C18319d(Class cls, DefaultConstructorMarker defaultConstructorMarker) {
            this(cls);
        }
    }

    public /* synthetic */ C18310a(C18312b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }
}
