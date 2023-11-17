package qq0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qq0.a */
public enum C38234a {
    N(true, true, true, true, true),
    I(false, false, false, false, false),
    C(false, false, false, false, false),
    R(false, true, true, false, true);
    

    /* renamed from: i */
    public static final C38235a f91713i = null;

    /* renamed from: d */
    private final boolean f91719d;

    /* renamed from: e */
    private final boolean f91720e;

    /* renamed from: f */
    private final boolean f91721f;

    /* renamed from: g */
    private final boolean f91722g;

    /* renamed from: h */
    private final boolean f91723h;

    /* renamed from: qq0.a$a */
    public static final class C38235a {
        private C38235a() {
        }

        public /* synthetic */ C38235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38234a mo91769a(String str) {
            for (C38234a aVar : C38234a.values()) {
                if (C41536l.m120484d(aVar.name(), str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f91713i = new C38235a((DefaultConstructorMarker) null);
    }

    private C38234a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f91719d = z;
        this.f91720e = z2;
        this.f91721f = z3;
        this.f91722g = z4;
        this.f91723h = z5;
    }

    /* renamed from: b */
    public final boolean mo91764b() {
        return this.f91719d;
    }

    /* renamed from: c */
    public final boolean mo91765c() {
        return this.f91721f;
    }

    /* renamed from: e */
    public final boolean mo91766e() {
        return this.f91723h;
    }

    /* renamed from: f */
    public final boolean mo91767f() {
        return this.f91722g;
    }

    /* renamed from: g */
    public final boolean mo91768g() {
        return this.f91720e;
    }
}
