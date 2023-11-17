package j71;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: j71.i */
public enum C36756i {
    A(PensionStatusResult.STATUS_ACTIVE),
    E("E"),
    C("C"),
    D("D"),
    S("S"),
    P("P");
    

    /* renamed from: e */
    public static final C36757a f88709e = null;

    /* renamed from: d */
    private final String f88717d;

    /* renamed from: j71.i$a */
    public static final class C36757a {
        private C36757a() {
        }

        public /* synthetic */ C36757a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36756i mo89639a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            int hashCode = str.hashCode();
            if (hashCode != 65) {
                if (hashCode != 83) {
                    switch (hashCode) {
                        case 67:
                            if (str.equals("C")) {
                                return C36756i.C;
                            }
                            break;
                        case 68:
                            if (str.equals("D")) {
                                return C36756i.D;
                            }
                            break;
                        case 69:
                            if (str.equals("E")) {
                                return C36756i.E;
                            }
                            break;
                    }
                } else if (str.equals("S")) {
                    return C36756i.S;
                }
            } else if (str.equals(PensionStatusResult.STATUS_ACTIVE)) {
                return C36756i.A;
            }
            return C36756i.P;
        }
    }

    static {
        f88709e = new C36757a((DefaultConstructorMarker) null);
    }

    private C36756i(String str) {
        this.f88717d = str;
    }
}
