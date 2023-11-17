package p397dm;

import p337z7.C9221d;
import p341ge.bog.mobilebank.broadcastreceiver.OTPCodeRetriever;

/* renamed from: dm.b */
public final /* synthetic */ class C12324b implements C9221d {

    /* renamed from: a */
    public final /* synthetic */ OTPCodeRetriever f36970a;

    public /* synthetic */ C12324b(OTPCodeRetriever oTPCodeRetriever) {
        this.f36970a = oTPCodeRetriever;
    }

    public final void onFailure(Exception exc) {
        OTPCodeRetriever.m51877k(this.f36970a, exc);
    }
}
