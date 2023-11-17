package p537nm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: nm.c0 */
public enum C17075c0 {
    BOTH(PensionStatusResult.STATUS_ACTIVE),
    PLASTIC("N"),
    DIGITAL("Y");
    

    /* renamed from: e */
    public static final C17076a f47724e = null;

    /* renamed from: d */
    private final String f47729d;

    /* renamed from: nm.c0$a */
    public static final class C17076a {
        private C17076a() {
        }

        public /* synthetic */ C17076a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17075c0 mo44293a(String str) {
            C41536l.m120489i(str, "lookupValue");
            C17075c0 c0Var = C17075c0.PLASTIC;
            if (C41536l.m120484d(str, c0Var.mo44292b())) {
                return c0Var;
            }
            C17075c0 c0Var2 = C17075c0.DIGITAL;
            if (C41536l.m120484d(str, c0Var2.mo44292b())) {
                return c0Var2;
            }
            return C17075c0.BOTH;
        }
    }

    static {
        f47724e = new C17076a((DefaultConstructorMarker) null);
    }

    private C17075c0(String str) {
        this.f47729d = str;
    }

    /* renamed from: b */
    public final String mo44292b() {
        return this.f47729d;
    }
}
