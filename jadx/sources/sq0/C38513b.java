package sq0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: sq0.b */
public enum C38513b {
    CONSUMER,
    CONSUMERLOAN,
    STUDENTLOAN,
    BUSINESSLOAN,
    OTHER,
    LEASINGFINANCIALS,
    INSTALLMENT,
    OVERDRAFT,
    CREDITCARD,
    PAWNLOAN;
    

    /* renamed from: d */
    public static final C38514a f92323d = null;

    /* renamed from: sq0.b$a */
    public static final class C38514a {
        private C38514a() {
        }

        public /* synthetic */ C38514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38513b mo92083a(String str) {
            for (C38513b bVar : C38513b.values()) {
                if (C41536l.m120484d(bVar.name(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f92323d = new C38514a((DefaultConstructorMarker) null);
    }
}
