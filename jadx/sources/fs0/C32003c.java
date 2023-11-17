package fs0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fs0.c */
public enum C32003c {
    NEW_PMT("NEW_PMT"),
    SAME_PMT("SAME_PMT"),
    NO_RECALC("NO_RECALC"),
    NONE("");
    

    /* renamed from: e */
    public static final C32004a f78793e = null;

    /* renamed from: d */
    private final String f78799d;

    /* renamed from: fs0.c$a */
    public static final class C32004a {
        private C32004a() {
        }

        public /* synthetic */ C32004a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C32003c mo72500a(String str) {
            C32003c cVar;
            C32003c[] values = C32003c.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cVar = null;
                    break;
                }
                cVar = values[i];
                if (C41536l.m120484d(cVar.mo72499b(), str)) {
                    break;
                }
                i++;
            }
            return cVar == null ? C32003c.NONE : cVar;
        }
    }

    static {
        f78793e = new C32004a((DefaultConstructorMarker) null);
    }

    private C32003c(String str) {
        this.f78799d = str;
    }

    /* renamed from: b */
    public final String mo72499b() {
        return this.f78799d;
    }
}
