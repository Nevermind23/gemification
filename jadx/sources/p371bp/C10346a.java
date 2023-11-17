package p371bp;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bp.a */
public enum C10346a {
    MONTHLY_INCOME("CONDITION.1"),
    DEPOSIT("CONDITION.2"),
    LOAN("CONDITION.3");
    

    /* renamed from: e */
    public static final C10347a f29519e = null;

    /* renamed from: d */
    private final String f29524d;

    /* renamed from: bp.a$a */
    public static final class C10347a {
        private C10347a() {
        }

        public /* synthetic */ C10347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10346a mo26978a(String str) {
            C10346a aVar = C10346a.MONTHLY_INCOME;
            if (C41536l.m120484d(str, aVar.mo26977b())) {
                return aVar;
            }
            C10346a aVar2 = C10346a.DEPOSIT;
            if (C41536l.m120484d(str, aVar2.mo26977b())) {
                return aVar2;
            }
            C10346a aVar3 = C10346a.LOAN;
            if (C41536l.m120484d(str, aVar3.mo26977b())) {
                return aVar3;
            }
            return null;
        }
    }

    static {
        f29519e = new C10347a((DefaultConstructorMarker) null);
    }

    private C10346a(String str) {
        this.f29524d = str;
    }

    /* renamed from: b */
    public final String mo26977b() {
        return this.f29524d;
    }
}
