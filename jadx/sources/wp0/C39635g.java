package wp0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: wp0.g */
public enum C39635g {
    PERCENTAGE,
    AMOUNT;
    

    /* renamed from: d */
    public static final C39636a f94217d = null;

    /* renamed from: wp0.g$a */
    public static final class C39636a {
        private C39636a() {
        }

        public /* synthetic */ C39636a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39635g mo93351a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            if (C41536l.m120484d(str, PensionStatusResult.STATUS_ACTIVE)) {
                return C39635g.AMOUNT;
            }
            return C39635g.PERCENTAGE;
        }
    }

    static {
        f94217d = new C39636a((DefaultConstructorMarker) null);
    }
}
