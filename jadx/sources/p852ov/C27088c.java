package p852ov;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ov.c */
public enum C27088c {
    PARALLEL_LOAN("P"),
    BOG_REFINANCING_LOAN("R"),
    BOG_AND_OTHER_BANK_REFINANCING_LOAN("M");
    

    /* renamed from: e */
    public static final C27089a f68041e = null;

    /* renamed from: d */
    private final String f68046d;

    /* renamed from: ov.c$a */
    public static final class C27089a {
        private C27089a() {
        }

        public /* synthetic */ C27089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27088c mo66360a(String str) {
            for (C27088c cVar : C27088c.values()) {
                if (C41536l.m120484d(cVar.mo66359b(), str)) {
                    return cVar;
                }
            }
            return null;
        }
    }

    static {
        f68041e = new C27089a((DefaultConstructorMarker) null);
    }

    private C27088c(String str) {
        this.f68046d = str;
    }

    /* renamed from: b */
    public final String mo66359b() {
        return this.f68046d;
    }
}
