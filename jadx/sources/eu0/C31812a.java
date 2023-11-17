package eu0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rt0.C38340b;

/* renamed from: eu0.a */
public enum C31812a {
    TRANSACTIONS("Transactions", r1),
    ACCOUNT("Account", C38340b.icons_24_accounts_accounts),
    CREDIT_CARD("Credit_Card", r1),
    DEPOSIT("Deposit", C38340b.f91925l),
    MORTGAGE("Mortgage", C38340b.icons_24_loan_house),
    LOANS("Loans", C38340b.f91926n);
    

    /* renamed from: f */
    public static final C31813a f78434f = null;

    /* renamed from: d */
    private final String f78442d;

    /* renamed from: e */
    private final int f78443e;

    /* renamed from: eu0.a$a */
    public static final class C31813a {
        private C31813a() {
        }

        public /* synthetic */ C31813a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31812a mo72253a(String str) {
            C41536l.m120489i(str, "name");
            for (C31812a aVar : C31812a.values()) {
                if (C41536l.m120484d(str, aVar.mo72251b())) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f78434f = new C31813a((DefaultConstructorMarker) null);
    }

    private C31812a(String str, int i) {
        this.f78442d = str;
        this.f78443e = i;
    }

    /* renamed from: b */
    public final String mo72251b() {
        return this.f78442d;
    }

    /* renamed from: c */
    public final int mo72252c() {
        return this.f78443e;
    }
}
