package fu0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rt0.C38339a;
import rt0.C38340b;

/* renamed from: fu0.a */
public enum C32010a {
    PAST("past", r12, C38339a.f91915c, C38339a.f91916d),
    CURRENT("current", r12, C38339a.f91920h, C38339a.f91921i),
    FUTURE("future", C38340b.icons_24_system_lock_on_fill, C38339a.f91917e, C38339a.f91918f);
    

    /* renamed from: h */
    public static final C32011a f78803h = null;

    /* renamed from: d */
    private final String f78808d;

    /* renamed from: e */
    private final int f78809e;

    /* renamed from: f */
    private final int f78810f;

    /* renamed from: g */
    private final int f78811g;

    /* renamed from: fu0.a$a */
    public static final class C32011a {
        private C32011a() {
        }

        public /* synthetic */ C32011a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32010a mo72507a(String str) {
            C41536l.m120489i(str, "state");
            for (C32010a aVar : C32010a.values()) {
                if (C41536l.m120484d(str, aVar.mo72506f())) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f78803h = new C32011a((DefaultConstructorMarker) null);
    }

    private C32010a(String str, int i, int i2, int i3) {
        this.f78808d = str;
        this.f78809e = i;
        this.f78810f = i2;
        this.f78811g = i3;
    }

    /* renamed from: b */
    public final int mo72503b() {
        return this.f78811g;
    }

    /* renamed from: c */
    public final int mo72504c() {
        return this.f78810f;
    }

    /* renamed from: e */
    public final int mo72505e() {
        return this.f78809e;
    }

    /* renamed from: f */
    public final String mo72506f() {
        return this.f78808d;
    }
}
