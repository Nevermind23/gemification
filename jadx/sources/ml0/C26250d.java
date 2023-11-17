package ml0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ml0.d */
public enum C26250d {
    NONE("NONE"),
    AUTO("TPL"),
    TRAVEL("TRI");
    

    /* renamed from: e */
    public static final C26251a f66472e = null;

    /* renamed from: d */
    private final String f66477d;

    /* renamed from: ml0.d$a */
    public static final class C26251a {
        private C26251a() {
        }

        public /* synthetic */ C26251a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26250d mo65284a(String str) {
            C26250d dVar;
            C26250d[] values = C26250d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    dVar = null;
                    break;
                }
                dVar = values[i];
                if (C41536l.m120484d(dVar.mo65283b(), str)) {
                    break;
                }
                i++;
            }
            if (dVar == null) {
                return C26250d.NONE;
            }
            return dVar;
        }
    }

    static {
        f66472e = new C26251a((DefaultConstructorMarker) null);
    }

    private C26250d(String str) {
        this.f66477d = str;
    }

    /* renamed from: b */
    public final String mo65283b() {
        return this.f66477d;
    }
}
