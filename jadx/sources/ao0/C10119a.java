package ao0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ao0.a */
public enum C10119a {
    CASHBACK,
    PRESENT,
    DISCOUNT,
    MR,
    PLUS,
    INSTALLMENT,
    BNPL;
    

    /* renamed from: d */
    public static final C10120a f27981d = null;

    /* renamed from: ao0.a$a */
    public static final class C10120a {
        private C10120a() {
        }

        public /* synthetic */ C10120a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10119a mo26583a(String str) {
            for (C10119a aVar : C10119a.values()) {
                if (C41536l.m120484d(aVar.name(), str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        f27981d = new C10120a((DefaultConstructorMarker) null);
    }
}
