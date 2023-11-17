package p341ge.bog.mobilebank.p2p.presentation.send;

import p341ge.bog.mobilebank.p2p.presentation.send.P2PSendFragment;

/* renamed from: ge.bog.mobilebank.p2p.presentation.send.b */
public final /* synthetic */ class C33535b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f81811d;

    /* renamed from: e */
    public final /* synthetic */ String f81812e;

    /* renamed from: f */
    public final /* synthetic */ P2PSendFragment f81813f;

    public /* synthetic */ C33535b(int i, String str, P2PSendFragment p2PSendFragment) {
        this.f81811d = i;
        this.f81812e = str;
        this.f81813f = p2PSendFragment;
    }

    public final void run() {
        P2PSendFragment.C33494e.m98359c(this.f81811d, this.f81812e, this.f81813f);
    }
}
