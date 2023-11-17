package p537nm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nm.j */
public enum C17091j {
    STANDARD("STANDARD"),
    PAYROLL("PAYROLL"),
    INSTANT("INSTANT");
    

    /* renamed from: e */
    public static final C17092a f47807e = null;

    /* renamed from: d */
    private final String f47812d;

    /* renamed from: nm.j$a */
    public static final class C17092a {
        private C17092a() {
        }

        public /* synthetic */ C17092a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17091j mo44379a(String str) {
            C41536l.m120489i(str, "lookupValue");
            for (C17091j jVar : C17091j.values()) {
                if (C41536l.m120484d(jVar.mo44378b(), str)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    static {
        f47807e = new C17092a((DefaultConstructorMarker) null);
    }

    private C17091j(String str) {
        this.f47812d = str;
    }

    /* renamed from: b */
    public final String mo44378b() {
        return this.f47812d;
    }
}
