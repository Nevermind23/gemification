package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.Hilt_MoreFragment */
public abstract class Hilt_MoreFragment extends C35651n1 {
    private ContextWrapper componentContext;
    private boolean disableGetContextFix;
    private boolean injected = false;

    Hilt_MoreFragment() {
    }

    private void initializeComponentContext() {
        if (this.componentContext == null) {
            this.componentContext = C12066g.m44266b(super.getContext(), this);
            this.disableGetContextFix = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.disableGetContextFix) {
            return null;
        }
        initializeComponentContext();
        return this.componentContext;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.injected) {
            this.injected = true;
            ((MoreFragment_GeneratedInjector) ((C18155c) C18157e.m62250a(this)).generatedComponent()).injectMoreFragment((MoreFragment) C18157e.m62250a(this));
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

    Hilt_MoreFragment(int i) {
        super(i);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.componentContext;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
