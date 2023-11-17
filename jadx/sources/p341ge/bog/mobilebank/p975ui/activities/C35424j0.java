package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30733pa;
import android.content.Context;
import androidx.appcompat.app.C0218d;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12054a;
import p000a.C0001b;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.j0 */
public abstract class C35424j0 extends C0218d implements C18155c {

    /* renamed from: n */
    private volatile C12054a f85707n;

    /* renamed from: o */
    private final Object f85708o = new Object();

    /* renamed from: p */
    private boolean f85709p = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.j0$a */
    class C35425a implements C0001b {
        C35425a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35424j0.this.mo37460R0();
        }
    }

    C35424j0() {
        m105164O0();
    }

    /* renamed from: O0 */
    private void m105164O0() {
        addOnContextAvailableListener(new C35425a());
    }

    /* renamed from: P0 */
    public final C12054a mo86467P0() {
        if (this.f85707n == null) {
            synchronized (this.f85708o) {
                if (this.f85707n == null) {
                    this.f85707n = mo86468Q0();
                }
            }
        }
        return this.f85707n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C12054a mo86468Q0() {
        return new C12054a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85709p) {
            this.f85709p = true;
            ((C30733pa) generatedComponent()).mo32420P0((C35388f2) C18157e.m62250a(this));
        }
    }

    public final Object generatedComponent() {
        return mo86467P0().generatedComponent();
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61451a(this, super.getDefaultViewModelProviderFactory());
    }
}
