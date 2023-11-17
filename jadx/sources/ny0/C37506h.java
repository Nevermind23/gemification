package ny0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ny0.h */
public enum C37506h {
    CALL("CALL"),
    CHILD("CHILD"),
    ENLARG("ENLARG"),
    ENLARGSOLO("ENLARGSOLO"),
    SAVING("SAVING"),
    TERM("TERM"),
    INVEST("INVEST"),
    IPO("IPO"),
    PREMIUM("PREMIUM"),
    EXPRESS("EXPRESS");
    

    /* renamed from: e */
    public static final C37507a f90200e = null;

    /* renamed from: d */
    private final String f90212d;

    /* renamed from: ny0.h$a */
    public static final class C37507a {
        private C37507a() {
        }

        public /* synthetic */ C37507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37506h mo90719a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C37506h hVar : C37506h.values()) {
                if (C41536l.m120484d(hVar.mo90718b(), str)) {
                    return hVar;
                }
            }
            return null;
        }
    }

    static {
        f90200e = new C37507a((DefaultConstructorMarker) null);
    }

    private C37506h(String str) {
        this.f90212d = str;
    }

    /* renamed from: b */
    public final String mo90718b() {
        return this.f90212d;
    }
}
