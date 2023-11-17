package r81;

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

/* renamed from: r81.i */
abstract class C38314i extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f91819d;

    /* renamed from: e */
    private boolean f91820e;

    /* renamed from: f */
    private boolean f91821f = false;

    C38314i() {
    }

    private void initializeComponentContext() {
        if (this.f91819d == null) {
            this.f91819d = C12066g.m44266b(super.getContext(), this);
            this.f91820e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f91820e) {
            return null;
        }
        initializeComponentContext();
        return this.f91819d;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f91821f) {
            this.f91821f = true;
            ((C38312g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32590B2((C38311f) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f91819d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
