package fs0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fs0.b */
public enum C32001b {
    PAYMENT("Y"),
    PREPAYMENT("P"),
    FULL_PREPAYMENT("F");
    

    /* renamed from: e */
    public static final C32002a f78787e = null;

    /* renamed from: d */
    private final String f78792d;

    /* renamed from: fs0.b$a */
    public static final class C32002a {
        private C32002a() {
        }

        public /* synthetic */ C32002a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32001b mo72498a(String str) {
            for (C32001b bVar : C32001b.values()) {
                if (C41536l.m120484d(bVar.mo72497b(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f78787e = new C32002a((DefaultConstructorMarker) null);
    }

    private C32001b(String str) {
        this.f78792d = str;
    }

    /* renamed from: b */
    public final String mo72497b() {
        return this.f78792d;
    }
}
