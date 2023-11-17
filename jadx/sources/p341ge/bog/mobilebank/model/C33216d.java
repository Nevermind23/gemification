package p341ge.bog.mobilebank.model;

import jd1.C41399f;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;

/* renamed from: ge.bog.mobilebank.model.d */
public final /* synthetic */ class C33216d implements C41399f {

    /* renamed from: d */
    public final /* synthetic */ Client f81309d;

    public /* synthetic */ C33216d(Client client) {
        this.f81309d = client;
    }

    public final void accept(Object obj) {
        this.f81309d.onCreditCardsResponse((CreditCardsWrapper) obj);
    }
}
