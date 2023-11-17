package p347af;

import ed1.C40744k;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import jd1.C41405l;
import jd1.C41407n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p446hf.C15495c;
import p652we.C18520a;
import p652we.C18523b;
import p652we.C18532c;
import p652we.C18539d;
import p652we.C18542e;
import p652we.C18551i;
import p652we.C18561l;

/* renamed from: af.a */
public abstract class C9822a {

    /* renamed from: a */
    public static final C9823a f26669a = new C9823a((DefaultConstructorMarker) null);

    /* renamed from: af.a$a */
    public static final class C9823a {
        private C9823a() {
        }

        public /* synthetic */ C9823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final Type m36114b(ParameterizedType parameterizedType) {
            return C15495c.m56049a(parameterizedType, 0);
        }
    }

    /* renamed from: af.a$b */
    public static final class C9824b {

        /* renamed from: a */
        private final Map f26670a = new LinkedHashMap();

        /* renamed from: b */
        private final C9839b f26671b;

        public C9824b(C9839b bVar) {
            C41536l.m120490j(bVar, "messageAdapterResolver");
            this.f26671b = bVar;
        }

        /* renamed from: b */
        private final C9827e m36115b(C18542e eVar) {
            if (this.f26670a.containsKey(eVar)) {
                Object obj = this.f26670a.get(eVar);
                if (obj == null) {
                    C41536l.m120500t();
                }
                return (C9827e) obj;
            }
            C9827e eVar2 = new C9827e(eVar);
            this.f26670a.put(eVar, eVar2);
            return eVar2;
        }

        /* renamed from: c */
        private final C18542e m36116c(ParameterizedType parameterizedType, Annotation[] annotationArr) {
            C9823a aVar = C9822a.f26669a;
            Type a = aVar.m36114b(parameterizedType);
            if (C41536l.m120484d(C15495c.m56050b(a), C18520a.class)) {
                if (a != null) {
                    a = aVar.m36114b((ParameterizedType) a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
            }
            return this.f26671b.mo26329b(a, annotationArr);
        }

        /* renamed from: a */
        public final C9822a mo26319a(ParameterizedType parameterizedType, Annotation[] annotationArr) {
            C41536l.m120490j(parameterizedType, "returnType");
            C41536l.m120490j(annotationArr, "annotations");
            Class b = C15495c.m56050b(C9822a.f26669a.m36114b(parameterizedType));
            Class<C18523b> cls = C18523b.class;
            if (C41536l.m120484d(b, cls)) {
                return C9826d.f26673b;
            }
            if (!cls.isAssignableFrom(b)) {
                Class<C18532c.C18533a> cls2 = C18532c.C18533a.class;
                if (C41536l.m120484d(cls2, b)) {
                    return C9833g.f26682c;
                }
                if (!cls2.isAssignableFrom(b)) {
                    Class<C18561l.C18562a> cls3 = C18561l.C18562a.class;
                    if (C41536l.m120484d(cls3, b)) {
                        return C9837i.f26688c;
                    }
                    if (!cls3.isAssignableFrom(b)) {
                        Class<C18551i> cls4 = C18551i.class;
                        if (C41536l.m120484d(cls4, b)) {
                            return C9835h.f26685c;
                        }
                        if (!cls4.isAssignableFrom(b)) {
                            C9827e b2 = m36115b(m36116c(parameterizedType, annotationArr));
                            if (C41536l.m120484d(b, C18520a.class)) {
                                return b2;
                            }
                            return new C9830f(b2);
                        }
                        throw new IllegalArgumentException("Subclasses of State is not supported".toString());
                    }
                    throw new IllegalArgumentException("Subclasses of WebSocket.Event is not supported".toString());
                }
                throw new IllegalArgumentException("Subclasses of Lifecycle.Event is not supported".toString());
            }
            throw new IllegalArgumentException("Subclasses of Event is not supported".toString());
        }
    }

    /* renamed from: af.a$c */
    public static final class C9825c extends C9822a {

        /* renamed from: b */
        private final Class f26672b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9825c(Class cls) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(cls, "clazz");
            this.f26672b = cls;
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            if (this.f26672b.isInstance(bVar)) {
                C40744k q = C40744k.m118000q(bVar);
                C41536l.m120485e(q, "Maybe.just(event as E)");
                return q;
            }
            C40744k k = C40744k.m117998k();
            C41536l.m120485e(k, "Maybe.empty()");
            return k;
        }
    }

    /* renamed from: af.a$d */
    public static final class C9826d extends C9822a {

        /* renamed from: b */
        public static final C9826d f26673b = new C9826d();

        private C9826d() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k q = C40744k.m118000q(bVar);
            C41536l.m120485e(q, "Maybe.just(event)");
            return q;
        }
    }

    /* renamed from: af.a$e */
    public static final class C9827e extends C9822a {

        /* renamed from: b */
        private final C9837i f26674b = C9837i.f26688c;

        /* renamed from: c */
        private final C18542e f26675c;

        /* renamed from: af.a$e$a */
        static final class C9828a implements C41407n {

            /* renamed from: d */
            public static final C9828a f26676d = new C9828a();

            C9828a() {
            }

            /* renamed from: a */
            public final boolean test(C18561l.C18562a aVar) {
                C41536l.m120490j(aVar, "it");
                return aVar instanceof C18561l.C18562a.C18567e;
            }
        }

        /* renamed from: af.a$e$b */
        static final class C9829b implements C41405l {

            /* renamed from: d */
            final /* synthetic */ C9827e f26677d;

            C9829b(C9827e eVar) {
                this.f26677d = eVar;
            }

            /* renamed from: a */
            public final C18520a apply(C18561l.C18562a aVar) {
                C41536l.m120490j(aVar, "it");
                return this.f26677d.m36121c(((C18561l.C18562a.C18567e) aVar).mo46399a());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9827e(C18542e eVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(eVar, "messageAdapter");
            this.f26675c = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final C18520a m36121c(C18539d dVar) {
            try {
                return new C18520a.C18522b(this.f26675c.mo26871a(dVar));
            } catch (Throwable th) {
                return new C18520a.C18521a(th);
            }
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k r = this.f26674b.mo26318a(bVar).mo94952l(C9828a.f26676d).mo94956r(new C9829b(this));
            C41536l.m120485e(r, "toWebSocketEvent.mapToDa…).message.deserialize() }");
            return r;
        }
    }

    /* renamed from: af.a$f */
    public static final class C9830f extends C9822a {

        /* renamed from: b */
        private final C9827e f26678b;

        /* renamed from: af.a$f$a */
        static final class C9831a implements C41407n {

            /* renamed from: d */
            public static final C9831a f26679d = new C9831a();

            C9831a() {
            }

            /* renamed from: a */
            public final boolean test(C18520a aVar) {
                C41536l.m120490j(aVar, "it");
                return aVar instanceof C18520a.C18522b;
            }
        }

        /* renamed from: af.a$f$b */
        static final class C9832b implements C41405l {

            /* renamed from: d */
            public static final C9832b f26680d = new C9832b();

            C9832b() {
            }

            /* renamed from: a */
            public final Object apply(C18520a aVar) {
                C41536l.m120490j(aVar, "it");
                return ((C18520a.C18522b) aVar).mo46331a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9830f(C9827e eVar) {
            super((DefaultConstructorMarker) null);
            C41536l.m120490j(eVar, "toDeserialization");
            this.f26678b = eVar;
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k r = this.f26678b.mo26318a(bVar).mo94952l(C9831a.f26679d).mo94956r(C9832b.f26680d);
            C41536l.m120485e(r, "toDeserialization.mapToD…lization.Success).value }");
            return r;
        }
    }

    /* renamed from: af.a$g */
    public static final class C9833g extends C9822a {

        /* renamed from: b */
        private static final C9825c f26681b = new C9825c(C18523b.C18524a.C18525a.class);

        /* renamed from: c */
        public static final C9833g f26682c = new C9833g();

        /* renamed from: af.a$g$a */
        static final class C9834a implements C41405l {

            /* renamed from: d */
            public static final C9834a f26683d = new C9834a();

            C9834a() {
            }

            /* renamed from: a */
            public final C18532c.C18533a apply(C18523b.C18524a.C18525a aVar) {
                C41536l.m120490j(aVar, "it");
                return aVar.mo46335a();
            }
        }

        private C9833g() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k r = f26681b.mo26318a(bVar).mo94956r(C9834a.f26683d);
            C41536l.m120485e(r, "filterEventType.mapToData(event).map { it.state }");
            return r;
        }
    }

    /* renamed from: af.a$h */
    public static final class C9835h extends C9822a {

        /* renamed from: b */
        private static final C9825c f26684b = new C9825c(C18523b.C18528c.class);

        /* renamed from: c */
        public static final C9835h f26685c = new C9835h();

        /* renamed from: af.a$h$a */
        static final class C9836a implements C41405l {

            /* renamed from: d */
            public static final C9836a f26686d = new C9836a();

            C9836a() {
            }

            /* renamed from: a */
            public final C18551i apply(C18523b.C18528c cVar) {
                C41536l.m120490j(cVar, "it");
                return cVar.mo46339a();
            }
        }

        private C9835h() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k r = f26684b.mo26318a(bVar).mo94956r(C9836a.f26686d);
            C41536l.m120485e(r, "filterEventType.mapToData(event).map { it.state }");
            return r;
        }
    }

    /* renamed from: af.a$i */
    public static final class C9837i extends C9822a {

        /* renamed from: b */
        private static final C9825c f26687b = new C9825c(C18523b.C18529d.C18530a.class);

        /* renamed from: c */
        public static final C9837i f26688c = new C9837i();

        /* renamed from: af.a$i$a */
        static final class C9838a implements C41405l {

            /* renamed from: d */
            public static final C9838a f26689d = new C9838a();

            C9838a() {
            }

            /* renamed from: a */
            public final C18561l.C18562a apply(C18523b.C18529d.C18530a aVar) {
                C41536l.m120490j(aVar, "it");
                return aVar.mo46343a();
            }
        }

        private C9837i() {
            super((DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public C40744k mo26318a(C18523b bVar) {
            C41536l.m120490j(bVar, "event");
            C40744k r = f26687b.mo26318a(bVar).mo94956r(C9838a.f26689d);
            C41536l.m120485e(r, "filterEventType.mapToData(event).map { it.event }");
            return r;
        }
    }

    private C9822a() {
    }

    public /* synthetic */ C9822a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract C40744k mo26318a(C18523b bVar);
}
