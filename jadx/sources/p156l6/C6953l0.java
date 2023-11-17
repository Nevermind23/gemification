package p156l6;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import p182n6.C7264i;

/* renamed from: l6.l0 */
public final class C6953l0 implements C3860c.C3862b, C3860c.C3863c {

    /* renamed from: b */
    public final C3847a f20826b;

    /* renamed from: c */
    private final boolean f20827c;

    /* renamed from: d */
    private C6955m0 f20828d;

    public C6953l0(C3847a aVar, boolean z) {
        this.f20826b = aVar;
        this.f20827c = z;
    }

    /* renamed from: b */
    private final C6955m0 m26954b() {
        C7264i.m27903l(this.f20828d, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f20828d;
    }

    /* renamed from: a */
    public final void mo21093a(C6955m0 m0Var) {
        this.f20828d = m0Var;
    }

    /* renamed from: k */
    public final void mo12102k(Bundle bundle) {
        m26954b().mo12102k(bundle);
    }

    /* renamed from: x */
    public final void mo12107x(int i) {
        m26954b().mo12107x(i);
    }

    /* renamed from: y */
    public final void mo12084y(ConnectionResult connectionResult) {
        m26954b().mo12100T1(connectionResult, this.f20826b, this.f20827c);
    }
}
