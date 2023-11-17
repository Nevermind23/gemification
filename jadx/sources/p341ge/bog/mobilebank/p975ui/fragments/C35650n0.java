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

/* renamed from: ge.bog.mobilebank.ui.fragments.n0 */
abstract class C35650n0 extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f86204d;

    /* renamed from: e */
    private boolean f86205e;

    /* renamed from: f */
    private boolean f86206f = false;

    C35650n0() {
    }

    private void initializeComponentContext() {
        if (this.f86204d == null) {
            this.f86204d = C12066g.m44266b(super.getContext(), this);
            this.f86205e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f86205e) {
            return null;
        }
        initializeComponentContext();
        return this.f86204d;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f86206f) {
            this.f86206f = true;
            ((C35611i0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32683d((C35606h0) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f86204d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
