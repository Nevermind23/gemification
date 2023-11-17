package p341ge.bog.mobilebank.model;

import jd1.C41399f;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;

/* renamed from: ge.bog.mobilebank.model.z */
public final /* synthetic */ class C33283z implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ Client f81387d;

    public /* synthetic */ C33283z(Client client) {
        this.f81387d = client;
    }

    public final void accept(Object obj) {
        this.f81387d.onLoansResponse((LoansWrapper) obj);
    }
}
