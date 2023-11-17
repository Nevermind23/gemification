package p341ge.bog.mobilebank.p975ui.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.fragments.o0 */
public abstract class C35653o0 extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f86208d;

    /* renamed from: e */
    private boolean f86209e;

    /* renamed from: f */
    private boolean f86210f = false;

    C35653o0() {
    }

    private void initializeComponentContext() {
        if (this.f86208d == null) {
            this.f86208d = C12066g.m44266b(super.getContext(), this);
            this.f86209e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f86209e) {
            return null;
        }
        initializeComponentContext();
        return this.f86208d;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f86210f) {
            this.f86210f = true;
            ((C35628j1) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32587B((C35612i1) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f86208d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
