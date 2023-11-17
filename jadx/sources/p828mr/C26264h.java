package p828mr;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: mr.h */
public enum C26264h {
    PERCENTAGE("P"),
    AMOUNT(PensionStatusResult.STATUS_ACTIVE);
    

    /* renamed from: e */
    public static final C26265a f66590e = null;

    /* renamed from: d */
    private final String f66594d;

    /* renamed from: mr.h$a */
    public static final class C26265a {
        private C26265a() {
        }

        public /* synthetic */ C26265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26264h mo65422a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C41536l.m120484d(str, PensionStatusResult.STATUS_ACTIVE)) {
                return C26264h.AMOUNT;
            }
            return C26264h.PERCENTAGE;
        }
    }

    static {
        f66590e = new C26265a((DefaultConstructorMarker) null);
    }

    private C26264h(String str) {
        this.f66594d = str;
    }
}
