package l20;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10320i;

/* renamed from: l20.b */
public enum C25801b {
    LOAN("home.collection.pop.up.loan.", C10320i.f28692ka),
    CREDITCARD("home.collection.pop.up.cc.", C10320i.f28689ea);
    

    /* renamed from: f */
    public static final C25802a f65628f = null;

    /* renamed from: d */
    private final String f65632d;

    /* renamed from: e */
    private final int f65633e;

    /* renamed from: l20.b$a */
    public static final class C25802a {
        private C25802a() {
        }

        public /* synthetic */ C25802a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C25801b mo64436a(String str) {
            C41536l.m120489i(str, "productCode");
            for (C25801b bVar : C25801b.values()) {
                if (C41536l.m120484d(bVar.name(), str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    static {
        f65628f = new C25802a((DefaultConstructorMarker) null);
    }

    private C25801b(String str, int i) {
        this.f65632d = str;
        this.f65633e = i;
    }

    /* renamed from: b */
    public final int mo64434b() {
        return this.f65633e;
    }

    /* renamed from: c */
    public final String mo64435c() {
        return this.f65632d;
    }
}
