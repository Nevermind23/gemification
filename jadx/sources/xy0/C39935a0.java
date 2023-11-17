package xy0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;

/* renamed from: xy0.a0 */
public enum C39935a0 {
    CAS_CLIENT_SERVICE("CAS_CLIENT_SERVICE"),
    DEBIT_CARD("DEBIT_CARD"),
    DEPOSIT("DEPOSIT"),
    BNPL_APPLICATION("BNPL_APPLICATION"),
    CREDIT_APPLICATION("CREDIT_APPLICATION"),
    DEP_LOAN(TMXFlags.DEP_LOAN),
    INSURANCE("INSURANCE"),
    TRAVEL_CARD("TRAVEL_CARD"),
    DD_STO("DD_STO"),
    INVESTMENT("INVESTMENT");
    

    /* renamed from: e */
    public static final C39936a f94735e = null;

    /* renamed from: d */
    private final String f94747d;

    /* renamed from: xy0.a0$a */
    public static final class C39936a {
        private C39936a() {
        }

        public /* synthetic */ C39936a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39935a0 mo93672a(String str) {
            for (C39935a0 a0Var : C39935a0.values()) {
                if (C41536l.m120484d(a0Var.mo93671b(), str)) {
                    return a0Var;
                }
            }
            return null;
        }
    }

    static {
        f94735e = new C39936a((DefaultConstructorMarker) null);
    }

    private C39935a0(String str) {
        this.f94747d = str;
    }

    /* renamed from: b */
    public final String mo93671b() {
        return this.f94747d;
    }
}
