package p341ge.bog.mobilebank.serverstatus;

import android.content.Context;
import androidx.appcompat.app.C0218d;
import androidx.lifecycle.C1620q0;
import c11.C31253b;
import dagger.hilt.android.internal.managers.C12054a;
import p000a.C0001b;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.serverstatus.a */
public abstract class C34558a extends C0218d implements C18155c {

    /* renamed from: n */
    private volatile C12054a f83510n;

    /* renamed from: o */
    private final Object f83511o = new Object();

    /* renamed from: p */
    private boolean f83512p = false;

    /* renamed from: ge.bog.mobilebank.serverstatus.a$a */
    class C34559a implements C0001b {
        C34559a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34558a.this.mo84067R0();
        }
    }

    C34558a() {
        m101364O0();
    }

    /* renamed from: O0 */
    private void m101364O0() {
        addOnContextAvailableListener(new C34559a());
    }

    /* renamed from: P0 */
    public final C12054a mo84065P0() {
        if (this.f83510n == null) {
            synchronized (this.f83511o) {
                if (this.f83510n == null) {
                    this.f83510n = mo84066Q0();
                }
            }
        }
        return this.f83510n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C12054a mo84066Q0() {
        return new C12054a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo84067R0() {
        if (!this.f83512p) {
            this.f83512p = true;
            ((C31253b) generatedComponent()).mo32428S((OutOfServiceActivity) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo84065P0().generatedComponent();
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61451a(this, super.getDefaultViewModelProviderFactory());
    }
}
