package s41;

import com.google.gson.Gson;
import kotlin.jvm.internal.C41536l;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41935w;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.shared2.network.NetworkException;
import q41.C38129b;
import uf1.C43092e;
import x41.C39780a;

/* renamed from: s41.a */
public final class C38426a implements C41935w {

    /* renamed from: a */
    private final Gson f92071a;

    /* renamed from: b */
    private final C39780a f92072b;

    public C38426a(Gson gson, C39780a aVar) {
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(aVar, "serverStatusMonitor");
        this.f92071a = gson;
        this.f92072b = aVar;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        BankApiResponse bankApiResponse;
        C41536l.m120489i(aVar, "chain");
        C41880d0 a = aVar.mo97008a(aVar.mo97011w());
        if (!a.mo96752u0() || !C43092e.m123640b(a) || C38129b.m112243a(a.mo96753w())) {
            return a;
        }
        C41884e0 a2 = a.mo96739a();
        C41536l.m120486f(a2);
        if (!C38129b.m112245c(a2)) {
            return a;
        }
        try {
            bankApiResponse = (BankApiResponse) this.f92071a.mo18170l(C38129b.m112244b(a), BankApiResponse.class);
        } catch (Exception unused) {
            bankApiResponse = null;
        }
        if (bankApiResponse == null) {
            return a;
        }
        if (bankApiResponse.isInvalidSession()) {
            return a.mo96736Q().mo96766g(TextTypeView.SEPARATOR_BEFORE_ICON).mo96773n("UnAuthorized").mo96764c();
        }
        if (!bankApiResponse.isServerUnderMaintenance()) {
            return a;
        }
        this.f92072b.mo93513b();
        throw NetworkException.ServerUnderMaintenanceException.f83829d;
    }
}
