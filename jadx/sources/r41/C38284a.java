package r41;

import com.google.gson.Gson;
import kotlin.jvm.internal.C41536l;
import of1.C41880d0;
import of1.C41884e0;
import of1.C41935w;
import p341ge.bog.mobilebank.shared2.network.NetworkException;
import p341ge.bog.mobilebank.shared2.network.models.BffApiError;
import p341ge.bog.mobilebank.shared2.network.models.BffApiErrorResponse;
import p341ge.bog.mobilebank.shared2.network.models.BffApiResponse;
import q41.C38129b;
import uf1.C43092e;
import x41.C39780a;

/* renamed from: r41.a */
public final class C38284a implements C41935w {

    /* renamed from: a */
    private final Gson f91789a;

    /* renamed from: b */
    private final C39780a f91790b;

    public C38284a(Gson gson, C39780a aVar) {
        C41536l.m120489i(gson, "gson");
        C41536l.m120489i(aVar, "serverStatusMonitor");
        this.f91789a = gson;
        this.f91790b = aVar;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C41536l.m120489i(aVar, "chain");
        C41880d0 a = aVar.mo97008a(aVar.mo97011w());
        if (a.mo96747q() >= 400 && C43092e.m123640b(a) && !C38129b.m112243a(a.mo96753w())) {
            C41884e0 a2 = a.mo96739a();
            C41536l.m120486f(a2);
            if (C38129b.m112245c(a2)) {
                BffApiResponse bffApiResponse = (BffApiResponse) this.f91789a.mo18170l(C38129b.m112244b(a), BffApiResponse.class);
                if (a.mo96747q() == 401 && bffApiResponse.isInvalidSession()) {
                    return a;
                }
                if (!bffApiResponse.isServerUnderMaintenance()) {
                    String code = bffApiResponse.getCode();
                    BffApiErrorResponse error = bffApiResponse.getError();
                    if (error != null) {
                        str = error.getName();
                    } else {
                        str = null;
                    }
                    BffApiErrorResponse error2 = bffApiResponse.getError();
                    if (error2 != null) {
                        str2 = error2.getContext();
                    } else {
                        str2 = null;
                    }
                    BffApiErrorResponse error3 = bffApiResponse.getError();
                    if (error3 != null) {
                        str3 = error3.getValue();
                    } else {
                        str3 = null;
                    }
                    BffApiErrorResponse error4 = bffApiResponse.getError();
                    if (error4 != null) {
                        str4 = error4.getKey();
                    } else {
                        str4 = null;
                    }
                    throw new BffApiError(code, str, str2, str3, str4);
                }
                this.f91790b.mo93513b();
                throw NetworkException.ServerUnderMaintenanceException.f83829d;
            }
        }
        return a;
    }
}
