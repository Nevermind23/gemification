package lg0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.C23824d;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: lg0.i0 */
public abstract class C25992i0 extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f66058B;

    /* renamed from: C */
    private boolean f66059C;

    /* renamed from: D */
    private volatile C12066g f66060D;

    /* renamed from: E */
    private final Object f66061E = new Object();

    /* renamed from: F */
    private boolean f66062F = false;

    private void initializeComponentContext() {
        if (this.f66058B == null) {
            this.f66058B = C12066g.m44266b(super.getContext(), this);
            this.f66059C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f66060D == null) {
            synchronized (this.f66061E) {
                if (this.f66060D == null) {
                    this.f66060D = createComponentManager();
                }
            }
        }
        return this.f66060D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f66059C) {
            return null;
        }
        initializeComponentContext();
        return this.f66058B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f66062F) {
            this.f66062F = true;
            ((C25990h0) generatedComponent()).mo32757v1((C23824d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f66058B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
