package p341ge.bog.mobilebank.categorypackages.presentation.application.navigator;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.C1483c;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p595ro.C17685c;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.navigator.e */
public abstract class C14498e extends C1483c implements C18155c {

    /* renamed from: t */
    private ContextWrapper f42319t;

    /* renamed from: u */
    private boolean f42320u;

    /* renamed from: v */
    private volatile C12066g f42321v;

    /* renamed from: w */
    private final Object f42322w = new Object();

    /* renamed from: x */
    private boolean f42323x = false;

    C14498e() {
    }

    private void initializeComponentContext() {
        if (this.f42319t == null) {
            this.f42319t = C12066g.m44266b(super.getContext(), this);
            this.f42320u = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f42321v == null) {
            synchronized (this.f42322w) {
                if (this.f42321v == null) {
                    this.f42321v = createComponentManager();
                }
            }
        }
        return this.f42321v;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42320u) {
            return null;
        }
        initializeComponentContext();
        return this.f42319t;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42323x) {
            this.f42323x = true;
            ((C17685c) generatedComponent()).mo32664X1((ApplicationNavigatorFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42319t;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
