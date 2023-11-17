package of0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.C23494d;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: of0.h0 */
public abstract class C26963h0 extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f67740B;

    /* renamed from: C */
    private boolean f67741C;

    /* renamed from: D */
    private volatile C12066g f67742D;

    /* renamed from: E */
    private final Object f67743E = new Object();

    /* renamed from: F */
    private boolean f67744F = false;

    private void initializeComponentContext() {
        if (this.f67740B == null) {
            this.f67740B = C12066g.m44266b(super.getContext(), this);
            this.f67741C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f67742D == null) {
            synchronized (this.f67743E) {
                if (this.f67742D == null) {
                    this.f67742D = createComponentManager();
                }
            }
        }
        return this.f67742D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f67741C) {
            return null;
        }
        initializeComponentContext();
        return this.f67740B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f67744F) {
            this.f67744F = true;
            ((C26959f0) generatedComponent()).mo32609G1((C23494d) C18157e.m62250a(this));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C12066g.m44267c(onGetLayoutInflater, this));
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f67740B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
