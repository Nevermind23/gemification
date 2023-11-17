package p341ge.bog.mobilebank.bnpl.presentation.details;

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
import p659wl.C18636z;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.k */
public abstract class C13876k extends C19788a {

    /* renamed from: H */
    private ContextWrapper f41191H;

    /* renamed from: I */
    private boolean f41192I;

    /* renamed from: J */
    private boolean f41193J = false;

    private void initializeComponentContext() {
        if (this.f41191H == null) {
            this.f41191H = C12066g.m44266b(super.getContext(), this);
            this.f41192I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f41192I) {
            return null;
        }
        initializeComponentContext();
        return this.f41191H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f41193J) {
            this.f41193J = true;
            ((C18636z) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32690e2((C13870i) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f41191H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
