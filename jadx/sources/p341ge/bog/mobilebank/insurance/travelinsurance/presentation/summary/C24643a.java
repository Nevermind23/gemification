package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import hm0.C25041d;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.a */
public abstract class C24643a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f63482d;

    /* renamed from: e */
    private boolean f63483e;

    /* renamed from: f */
    private boolean f63484f = false;

    C24643a() {
    }

    private void initializeComponentContext() {
        if (this.f63482d == null) {
            this.f63482d = C12066g.m44266b(super.getContext(), this);
            this.f63483e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f63483e) {
            return null;
        }
        initializeComponentContext();
        return this.f63482d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f63484f) {
            this.f63484f = true;
            ((C25041d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32681c1((InsuranceSummaryFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f63482d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
