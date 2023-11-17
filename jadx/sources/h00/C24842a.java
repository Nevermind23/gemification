package h00;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: h00.a */
public enum C24842a {
    DEBIT_CARD("DEBIT_CARD"),
    DEPOSIT("DEPOSIT"),
    CREDIT_APPLICATION("CREDIT_APPLICATION"),
    CREDIT_LIMIT_APP("CREDIT_LIMIT_APP"),
    BNPL_LIMIT_APP("BNPL_LIMIT_APP");
    

    /* renamed from: e */
    public static final C24843a f63797e = null;

    /* renamed from: d */
    private final String f63804d;

    /* renamed from: h00.a$a */
    public static final class C24843a {
        private C24843a() {
        }

        public /* synthetic */ C24843a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo63278a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C24842a b : C24842a.values()) {
                if (C41536l.m120484d(b.mo63277b(), str)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        f63797e = new C24843a((DefaultConstructorMarker) null);
    }

    private C24842a(String str) {
        this.f63804d = str;
    }

    /* renamed from: b */
    public final String mo63277b() {
        return this.f63804d;
    }
}
