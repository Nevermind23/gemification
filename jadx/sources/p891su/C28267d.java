package p891su;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su.d */
public enum C28267d {
    BANK_OF_GEORGIA("BAGAGE22");
    

    /* renamed from: e */
    public static final C28268a f71752e = null;

    /* renamed from: d */
    private final String f71755d;

    /* renamed from: su.d$a */
    public static final class C28268a {
        private C28268a() {
        }

        public /* synthetic */ C28268a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28267d mo67881a(String str) {
            for (C28267d dVar : C28267d.values()) {
                if (C41536l.m120484d(dVar.mo67880b(), str)) {
                    return dVar;
                }
            }
            return null;
        }
    }

    static {
        f71752e = new C28268a((DefaultConstructorMarker) null);
    }

    private C28267d(String str) {
        this.f71755d = str;
    }

    /* renamed from: b */
    public final String mo67880b() {
        return this.f71755d;
    }
}
