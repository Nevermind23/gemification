package p537nm;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nm.d0 */
public enum C17078d0 {
    DIGITAL("D"),
    PLASTIC("P");
    

    /* renamed from: e */
    public static final C17079a f47733e = null;

    /* renamed from: d */
    private final String f47737d;

    /* renamed from: nm.d0$a */
    public static final class C17079a {
        private C17079a() {
        }

        public /* synthetic */ C17079a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17078d0 mo44301a(String str) {
            C17078d0 d0Var;
            C17078d0[] values = C17078d0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d0Var = null;
                    break;
                }
                d0Var = values[i];
                if (C41536l.m120484d(d0Var.mo44300b(), str)) {
                    break;
                }
                i++;
            }
            if (d0Var == null) {
                return C17078d0.DIGITAL;
            }
            return d0Var;
        }
    }

    static {
        f47733e = new C17079a((DefaultConstructorMarker) null);
    }

    private C17078d0(String str) {
        this.f47737d = str;
    }

    /* renamed from: b */
    public final String mo44300b() {
        return this.f47737d;
    }
}
