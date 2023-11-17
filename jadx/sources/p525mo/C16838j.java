package p525mo;

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

/* renamed from: mo.j */
public abstract class C16838j extends C19788a {

    /* renamed from: H */
    private ContextWrapper f47121H;

    /* renamed from: I */
    private boolean f47122I;

    /* renamed from: J */
    private boolean f47123J = false;

    private void initializeComponentContext() {
        if (this.f47121H == null) {
            this.f47121H = C12066g.m44266b(super.getContext(), this);
            this.f47122I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f47122I) {
            return null;
        }
        initializeComponentContext();
        return this.f47121H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f47123J) {
            this.f47123J = true;
            ((C16828c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32583A((C16815b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f47121H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
