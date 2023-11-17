package n41;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n41.c */
public enum C37353c {
    KA("KA", "GE"),
    EN("EN", (int) null, 2, (String) null);
    

    /* renamed from: f */
    public static final C37354a f89802f = null;

    /* renamed from: d */
    private final String f89806d;

    /* renamed from: e */
    private final String f89807e;

    /* renamed from: n41.c$a */
    public static final class C37354a {
        private C37354a() {
        }

        public /* synthetic */ C37354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37353c mo90437a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C37353c cVar : C37353c.values()) {
                boolean z = true;
                if (!C40439w.m117115s(cVar.mo90434c(), str, true) && !C40439w.m117115s(cVar.mo90433b(), str, true)) {
                    z = false;
                }
                if (z) {
                    return cVar;
                }
            }
            return null;
        }
    }

    static {
        f89802f = new C37354a((DefaultConstructorMarker) null);
    }

    private C37353c(String str, String str2) {
        this.f89806d = str;
        this.f89807e = str2;
    }

    /* renamed from: b */
    public final String mo90433b() {
        return this.f89807e;
    }

    /* renamed from: c */
    public final String mo90434c() {
        return this.f89806d;
    }

    /* renamed from: e */
    public final boolean mo90435e() {
        return this == EN;
    }

    /* renamed from: f */
    public final boolean mo90436f() {
        return this == KA;
    }
}
