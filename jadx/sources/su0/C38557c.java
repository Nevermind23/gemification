package su0;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: su0.c */
public enum C38557c {
    LOAN("LOAN"),
    CREDIT_CARD("CREDITCARD"),
    OFFER("OFFER"),
    LIMIT_BANNER("LIMIT_BANNER");
    

    /* renamed from: e */
    public static final C38558a f92404e = null;

    /* renamed from: d */
    private final String f92410d;

    /* renamed from: su0.c$a */
    public static final class C38558a {
        private C38558a() {
        }

        public /* synthetic */ C38558a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38557c mo92158a(String str) {
            for (C38557c cVar : C38557c.values()) {
                if (C41536l.m120484d(cVar.mo92157b(), str)) {
                    return cVar;
                }
            }
            return null;
        }
    }

    static {
        f92404e = new C38558a((DefaultConstructorMarker) null);
    }

    private C38557c(String str) {
        this.f92410d = str;
    }

    /* renamed from: b */
    public final String mo92157b() {
        return this.f92410d;
    }
}
