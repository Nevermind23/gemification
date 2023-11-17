package fj0;

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
import p725cr.C19788a;

/* renamed from: fj0.e */
public abstract class C20510e extends C19788a {

    /* renamed from: H */
    private ContextWrapper f55521H;

    /* renamed from: I */
    private boolean f55522I;

    /* renamed from: J */
    private boolean f55523J = false;

    private void initializeComponentContext() {
        if (this.f55521H == null) {
            this.f55521H = C12066g.m44266b(super.getContext(), this);
            this.f55522I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f55522I) {
            return null;
        }
        initializeComponentContext();
        return this.f55521H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f55523J) {
            this.f55523J = true;
            ((C20509d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32661W0((C20497c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f55521H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
