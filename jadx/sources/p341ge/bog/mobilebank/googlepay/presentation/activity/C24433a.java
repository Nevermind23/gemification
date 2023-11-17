package p341ge.bog.mobilebank.googlepay.presentation.activity;

import android.content.Context;
import androidx.appcompat.app.C0218d;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12054a;
import hk0.C25035a;
import p000a.C0001b;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.googlepay.presentation.activity.a */
public abstract class C24433a extends C0218d implements C18155c {

    /* renamed from: n */
    private volatile C12054a f63021n;

    /* renamed from: o */
    private final Object f63022o = new Object();

    /* renamed from: p */
    private boolean f63023p = false;

    /* renamed from: ge.bog.mobilebank.googlepay.presentation.activity.a$a */
    class C24434a implements C0001b {
        C24434a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C24433a.this.mo62193R0();
        }
    }

    C24433a() {
        m78462O0();
    }

    /* renamed from: O0 */
    private void m78462O0() {
        addOnContextAvailableListener(new C24434a());
    }

    /* renamed from: P0 */
    public final C12054a mo62191P0() {
        if (this.f63021n == null) {
            synchronized (this.f63022o) {
                if (this.f63021n == null) {
                    this.f63021n = mo62192Q0();
                }
            }
        }
        return this.f63021n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C12054a mo62192Q0() {
        return new C12054a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo62193R0() {
        if (!this.f63023p) {
            this.f63023p = true;
            ((C25035a) generatedComponent()).mo32507r1((GooglePayActivity) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo62191P0().generatedComponent();
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61451a(this, super.getDefaultViewModelProviderFactory());
    }
}
