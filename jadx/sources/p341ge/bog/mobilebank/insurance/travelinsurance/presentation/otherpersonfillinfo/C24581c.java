package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import cm0.C19785e;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.otherpersonfillinfo.c */
public abstract class C24581c extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f63379d;

    /* renamed from: e */
    private boolean f63380e;

    /* renamed from: f */
    private boolean f63381f = false;

    C24581c() {
    }

    private void initializeComponentContext() {
        if (this.f63379d == null) {
            this.f63379d = C12066g.m44266b(super.getContext(), this);
            this.f63380e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f63380e) {
            return null;
        }
        initializeComponentContext();
        return this.f63379d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f63381f) {
            this.f63381f = true;
            ((C19785e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32752u0((FillOtherPersonInsuranceInfo) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f63379d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
