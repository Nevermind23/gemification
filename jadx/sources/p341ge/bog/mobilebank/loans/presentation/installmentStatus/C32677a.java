package p341ge.bog.mobilebank.loans.presentation.installmentStatus;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import cs0.C31397b;
import cs0.C31406c;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.loans.presentation.installmentStatus.a */
public abstract class C32677a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f80434H;

    /* renamed from: I */
    private boolean f80435I;

    /* renamed from: J */
    private boolean f80436J = false;

    private void initializeComponentContext() {
        if (this.f80434H == null) {
            this.f80434H = C12066g.m44266b(super.getContext(), this);
            this.f80435I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f80435I) {
            return null;
        }
        initializeComponentContext();
        return this.f80434H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f80436J) {
            this.f80436J = true;
            ((C31406c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32597D1((C31397b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f80434H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
