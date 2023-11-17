package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import dm0.C20042a;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.a */
public abstract class C24593a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f63399d;

    /* renamed from: e */
    private boolean f63400e;

    /* renamed from: f */
    private boolean f63401f = false;

    C24593a() {
    }

    private void initializeComponentContext() {
        if (this.f63399d == null) {
            this.f63399d = C12066g.m44266b(super.getContext(), this);
            this.f63400e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f63400e) {
            return null;
        }
        initializeComponentContext();
        return this.f63399d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f63401f) {
            this.f63401f = true;
            ((C20042a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32706i2((InsuranceProvidersFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f63399d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
