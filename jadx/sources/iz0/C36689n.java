package iz0;

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

/* renamed from: iz0.n */
public abstract class C36689n extends C19788a {

    /* renamed from: H */
    private ContextWrapper f88519H;

    /* renamed from: I */
    private boolean f88520I;

    /* renamed from: J */
    private boolean f88521J = false;

    private void initializeComponentContext() {
        if (this.f88519H == null) {
            this.f88519H = C12066g.m44266b(super.getContext(), this);
            this.f88520I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f88520I) {
            return null;
        }
        initializeComponentContext();
        return this.f88519H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f88521J) {
            this.f88521J = true;
            ((C36671d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32627L((C36657c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f88519H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
