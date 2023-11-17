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

/* renamed from: ge.bog.mobilebank.ui.fragments.m0 */
abstract class C35642m0 extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f86183d;

    /* renamed from: e */
    private boolean f86184e;

    /* renamed from: f */
    private boolean f86185f = false;

    C35642m0() {
    }

    private void initializeComponentContext() {
        if (this.f86183d == null) {
            this.f86183d = C12066g.m44266b(super.getContext(), this);
            this.f86184e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f86184e) {
            return null;
        }
        initializeComponentContext();
        return this.f86183d;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f86185f) {
            this.f86185f = true;
            ((C35672u) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32735q((C35669t) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f86183d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
