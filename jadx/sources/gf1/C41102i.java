package gf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: gf1.i */
public final class C41102i {

    /* renamed from: b */
    public static final C41104b f97025b = new C41104b((DefaultConstructorMarker) null);

    /* renamed from: c */
    private static final C41105c f97026c = new C41105c();

    /* renamed from: a */
    private final Object f97027a;

    /* renamed from: gf1.i$a */
    public static final class C41103a extends C41105c {

        /* renamed from: a */
        public final Throwable f97028a;

        public C41103a(Throwable th) {
            this.f97028a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C41103a) && C41536l.m120484d(this.f97028a, ((C41103a) obj).f97028a);
        }

        public int hashCode() {
            Throwable th = this.f97028a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f97028a + ')';
        }
    }

    /* renamed from: gf1.i$b */
    public static final class C41104b {
        private C41104b() {
        }

        public /* synthetic */ C41104b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Object mo95542a(Throwable th) {
            return C41102i.m119150b(new C41103a(th));
        }

        /* renamed from: b */
        public final Object mo95543b(Object obj) {
            return C41102i.m119150b(obj);
        }
    }

    /* renamed from: gf1.i$c */
    public static class C41105c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C41102i(Object obj) {
        this.f97027a = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C41102i m119149a(Object obj) {
        return new C41102i(obj);
    }

    /* renamed from: b */
    public static Object m119150b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m119151c(Object obj, Object obj2) {
        return (obj2 instanceof C41102i) && C41536l.m120484d(obj, ((C41102i) obj2).mo95537i());
    }

    /* renamed from: d */
    public static final Throwable m119152d(Object obj) {
        C41103a aVar = obj instanceof C41103a ? (C41103a) obj : null;
        if (aVar != null) {
            return aVar.f97028a;
        }
        return null;
    }

    /* renamed from: e */
    public static final Object m119153e(Object obj) {
        Throwable th;
        if (!(obj instanceof C41105c)) {
            return obj;
        }
        if (!(obj instanceof C41103a) || (th = ((C41103a) obj).f97028a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    /* renamed from: f */
    public static int m119154f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: g */
    public static final boolean m119155g(Object obj) {
        return obj instanceof C41103a;
    }

    /* renamed from: h */
    public static String m119156h(Object obj) {
        if (obj instanceof C41103a) {
            return ((C41103a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m119151c(this.f97027a, obj);
    }

    public int hashCode() {
        return m119154f(this.f97027a);
    }

    /* renamed from: i */
    public final /* synthetic */ Object mo95537i() {
        return this.f97027a;
    }

    public String toString() {
        return m119156h(this.f97027a);
    }
}
