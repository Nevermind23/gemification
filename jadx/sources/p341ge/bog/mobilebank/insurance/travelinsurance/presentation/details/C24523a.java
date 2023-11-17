package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.details;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import wl0.C29468c;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.details.a */
public abstract class C24523a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f63237d;

    /* renamed from: e */
    private boolean f63238e;

    /* renamed from: f */
    private boolean f63239f = false;

    C24523a() {
    }

    private void initializeComponentContext() {
        if (this.f63237d == null) {
            this.f63237d = C12066g.m44266b(super.getContext(), this);
            this.f63238e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f63238e) {
            return null;
        }
        initializeComponentContext();
        return this.f63237d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f63239f) {
            this.f63239f = true;
            ((C29468c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32721m1((TravelInsuranceDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f63237d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
