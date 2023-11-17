package of0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: of0.g0 */
public abstract class C26961g0 extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f67735B;

    /* renamed from: C */
    private boolean f67736C;

    /* renamed from: D */
    private volatile C12066g f67737D;

    /* renamed from: E */
    private final Object f67738E = new Object();

    /* renamed from: F */
    private boolean f67739F = false;

    private void initializeComponentContext() {
        if (this.f67735B == null) {
            this.f67735B = C12066g.m44266b(super.getContext(), this);
            this.f67736C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f67737D == null) {
            synchronized (this.f67738E) {
                if (this.f67737D == null) {
                    this.f67737D = createComponentManager();
                }
            }
        }
        return this.f67737D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f67736C) {
            return null;
        }
        initializeComponentContext();
        return this.f67735B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f67739F) {
            this.f67739F = true;
            ((C26979m) generatedComponent()).mo32728o0((C26967l) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f67735B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
