package h00;

import he1.C41233s;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.CardApplicationDetails;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10318g;
import ue1.C43075l;

/* renamed from: h00.b */
public final class C24844b {

    /* renamed from: a */
    public static final C24844b f63805a = new C24844b();

    /* renamed from: b */
    private static final Map f63806b;

    /* renamed from: h00.b$a */
    static final class C24845a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24845a f63807d = new C24845a();

        C24845a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(String str) {
            return Integer.valueOf(C10318g.applications_status_ordered);
        }
    }

    static {
        int i = C10318g.applications_status_ordered;
        int i2 = C10318g.applications_status_rejected;
        f63806b = C41340p0.m119902b(C41344r0.m119931m(C41233s.m119492a(PensionStatusResult.STATUS_ACTIVE, Integer.valueOf(C10318g.applications_status_done)), C41233s.m119492a("M", Integer.valueOf(i)), C41233s.m119492a("P", Integer.valueOf(i)), C41233s.m119492a("B", Integer.valueOf(i)), C41233s.m119492a("C", Integer.valueOf(i)), C41233s.m119492a(PensionStatusResult.STATUS_INACTIVE, Integer.valueOf(i)), C41233s.m119492a(BankApiResponse.CODE_STATUS_WARNING, Integer.valueOf(i)), C41233s.m119492a("O", Integer.valueOf(i)), C41233s.m119492a("E", Integer.valueOf(i2)), C41233s.m119492a("R", Integer.valueOf(i2)), C41233s.m119492a((Object) null, Integer.valueOf(i))), C24845a.f63807d);
    }

    private C24844b() {
    }

    /* renamed from: a */
    public static final int m79503a(Application application) {
        CardApplicationDetails cardDetails;
        C41536l.m120489i(application, "application");
        String status = application.getStatus();
        String appType = application.getAppType();
        C24842a aVar = C24842a.DEBIT_CARD;
        String str = null;
        if (C41536l.m120484d(appType, aVar.mo63277b()) && (cardDetails = application.getCardDetails()) != null) {
            str = cardDetails.cardStatus;
        }
        if (!C41536l.m120484d(status, PensionStatusResult.STATUS_ACTIVE) || C41536l.m120484d(str, "M") || C41536l.m120484d(str, "E") || !C41536l.m120484d(application.getAppType(), aVar.mo63277b())) {
            return ((Number) C41344r0.m119929k(f63806b, status)).intValue();
        }
        return ((Number) C41344r0.m119929k(f63806b, str)).intValue();
    }
}
