package fu0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rt0.C38339a;
import rt0.C38340b;

/* renamed from: fu0.b */
public enum C32012b {
    EXPRESS("MEMBER", C38340b.benefit_express, C38339a.f91919g),
    CLASSIC("CLASSIC_NEW", C38340b.benefit_classic, C38339a.f91922j),
    SILVER("SILVER_NEW", C38340b.benefit_silver, C38339a.f91913a),
    GOLD("GOLD_NEW", C38340b.benefit_gold, C38339a.f91923k);
    

    /* renamed from: g */
    public static final C32013a f78812g = null;

    /* renamed from: d */
    private final String f78818d;

    /* renamed from: e */
    private final int f78819e;

    /* renamed from: f */
    private final int f78820f;

    /* renamed from: fu0.b$a */
    public static final class C32013a {
        private C32013a() {
        }

        public /* synthetic */ C32013a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32012b mo72511a(String str) {
            C41536l.m120489i(str, "status");
            for (C32012b bVar : C32012b.values()) {
                if (C41536l.m120484d(str, bVar.mo72510e())) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f78812g = new C32013a((DefaultConstructorMarker) null);
    }

    private C32012b(String str, int i, int i2) {
        this.f78818d = str;
        this.f78819e = i;
        this.f78820f = i2;
    }

    /* renamed from: b */
    public final int mo72508b() {
        return this.f78820f;
    }

    /* renamed from: c */
    public final int mo72509c() {
        return this.f78819e;
    }

    /* renamed from: e */
    public final String mo72510e() {
        return this.f78818d;
    }
}
