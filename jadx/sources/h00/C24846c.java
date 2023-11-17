package h00;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: h00.c */
public enum C24846c {
    A(PensionStatusResult.STATUS_ACTIVE),
    P("P"),
    W(BankApiResponse.CODE_STATUS_WARNING),
    N("N"),
    C("C"),
    R("R"),
    F("F"),
    M("M"),
    B("B"),
    I(PensionStatusResult.STATUS_INACTIVE),
    O("O"),
    D("D"),
    G("G"),
    ERROR("ERROR"),
    TIME_OUT("TIME_OUT");
    

    /* renamed from: e */
    public static final C24847a f63808e = null;

    /* renamed from: d */
    private final String f63825d;

    /* renamed from: h00.c$a */
    public static final class C24847a {
        private C24847a() {
        }

        public /* synthetic */ C24847a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C24846c mo63281a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C24846c cVar : C24846c.values()) {
                if (C41536l.m120484d(cVar.mo63280b(), str)) {
                    return cVar;
                }
            }
            return null;
        }
    }

    static {
        f63808e = new C24847a((DefaultConstructorMarker) null);
    }

    private C24846c(String str) {
        this.f63825d = str;
    }

    /* renamed from: b */
    public final String mo63280b() {
        return this.f63825d;
    }
}
