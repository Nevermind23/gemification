package p552on;

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

/* renamed from: on.f */
public abstract class C17285f extends C19788a {

    /* renamed from: H */
    private ContextWrapper f48571H;

    /* renamed from: I */
    private boolean f48572I;

    /* renamed from: J */
    private boolean f48573J = false;

    private void initializeComponentContext() {
        if (this.f48571H == null) {
            this.f48571H = C12066g.m44266b(super.getContext(), this);
            this.f48572I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f48572I) {
            return null;
        }
        initializeComponentContext();
        return this.f48571H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f48573J) {
            this.f48573J = true;
            ((C17284e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32645Q1((C17271d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f48571H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
