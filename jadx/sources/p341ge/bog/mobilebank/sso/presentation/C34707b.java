package p341ge.bog.mobilebank.sso.presentation;

import android.content.Context;
import androidx.appcompat.app.C0218d;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12054a;
import l51.C37077f;
import p000a.C0001b;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.sso.presentation.b */
public abstract class C34707b extends C0218d implements C18155c {

    /* renamed from: n */
    private volatile C12054a f83885n;

    /* renamed from: o */
    private final Object f83886o = new Object();

    /* renamed from: p */
    private boolean f83887p = false;

    /* renamed from: ge.bog.mobilebank.sso.presentation.b$a */
    class C34708a implements C0001b {
        C34708a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34707b.this.mo84784R0();
        }
    }

    C34707b() {
        m101929O0();
    }

    /* renamed from: O0 */
    private void m101929O0() {
        addOnContextAvailableListener(new C34708a());
    }

    /* renamed from: P0 */
    public final C12054a mo84782P0() {
        if (this.f83885n == null) {
            synchronized (this.f83886o) {
                if (this.f83885n == null) {
                    this.f83885n = mo84783Q0();
                }
            }
        }
        return this.f83885n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C12054a mo84783Q0() {
        return new C12054a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo84784R0() {
        if (!this.f83887p) {
            this.f83887p = true;
            ((C37077f) generatedComponent()).mo32468e1((SsoWindowActivity) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo84782P0().generatedComponent();
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61451a(this, super.getDefaultViewModelProviderFactory());
    }
}
