package p156l6;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3847a;
import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p182n6.C7249c;
import p182n6.C7264i;
import p274u7.C8644d;
import p274u7.C8645e;
import p287v7.C8709a;

/* renamed from: l6.j0 */
public final class C6949j0 extends C8709a implements C3860c.C3862b, C3860c.C3863c {

    /* renamed from: i */
    private static final C3847a.C3848a f20818i = C8644d.f24424c;

    /* renamed from: b */
    private final Context f20819b;

    /* renamed from: c */
    private final Handler f20820c;

    /* renamed from: d */
    private final C3847a.C3848a f20821d;

    /* renamed from: e */
    private final Set f20822e;

    /* renamed from: f */
    private final C7249c f20823f;

    /* renamed from: g */
    private C8645e f20824g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C6947i0 f20825h;

    public C6949j0(Context context, Handler handler, C7249c cVar) {
        C3847a.C3848a aVar = f20818i;
        this.f20819b = context;
        this.f20820c = handler;
        this.f20823f = (C7249c) C7264i.m27903l(cVar, "ClientSettings must not be null");
        this.f20822e = cVar.mo21621g();
        this.f20821d = aVar;
    }

    /* renamed from: C2 */
    static /* bridge */ /* synthetic */ void m26946C2(C6949j0 j0Var, zak zak) {
        ConnectionResult v = zak.mo15013v();
        if (v.mo11855f0()) {
            zav zav = (zav) C7264i.m27902k(zak.mo15014w());
            ConnectionResult v2 = zav.mo12314v();
            if (!v2.mo11855f0()) {
                String valueOf = String.valueOf(v2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                j0Var.f20825h.mo12149c(v2);
                j0Var.f20824g.mo11918b();
                return;
            }
            j0Var.f20825h.mo12148b(zav.mo12315w(), j0Var.f20822e);
        } else {
            j0Var.f20825h.mo12149c(v);
        }
        j0Var.f20824g.mo11918b();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, u7.e] */
    /* renamed from: D2 */
    public final void mo21091D2(C6947i0 i0Var) {
        C8645e eVar = this.f20824g;
        if (eVar != null) {
            eVar.mo11918b();
        }
        this.f20823f.mo21626l(Integer.valueOf(System.identityHashCode(this)));
        C3847a.C3848a aVar = this.f20821d;
        Context context = this.f20819b;
        Looper looper = this.f20820c.getLooper();
        C7249c cVar = this.f20823f;
        this.f20824g = aVar.mo113c(context, looper, cVar, cVar.mo21622h(), this, this);
        this.f20825h = i0Var;
        Set set = this.f20822e;
        if (set == null || set.isEmpty()) {
            this.f20820c.post(new C6943g0(this));
        } else {
            this.f20824g.mo14999l();
        }
    }

    /* renamed from: E2 */
    public final void mo21092E2() {
        C8645e eVar = this.f20824g;
        if (eVar != null) {
            eVar.mo11918b();
        }
    }

    /* renamed from: V */
    public final void mo12151V(zak zak) {
        this.f20820c.post(new C6945h0(this, zak));
    }

    /* renamed from: k */
    public final void mo12102k(Bundle bundle) {
        this.f20824g.mo14998j(this);
    }

    /* renamed from: x */
    public final void mo12107x(int i) {
        this.f20824g.mo11918b();
    }

    /* renamed from: y */
    public final void mo12084y(ConnectionResult connectionResult) {
        this.f20825h.mo12149c(connectionResult);
    }
}
