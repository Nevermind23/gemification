package p341ge.bog.mobilebank.giftcards.presentation.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import ej0.C20252g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.purchase.d */
public abstract class C24360d extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f62910d;

    /* renamed from: e */
    private boolean f62911e;

    /* renamed from: f */
    private boolean f62912f = false;

    C24360d() {
    }

    private void initializeComponentContext() {
        if (this.f62910d == null) {
            this.f62910d = C12066g.m44266b(super.getContext(), this);
            this.f62911e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62911e) {
            return null;
        }
        initializeComponentContext();
        return this.f62910d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62912f) {
            this.f62912f = true;
            ((C20252g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32738q2((GiftCardsPurchaseFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62910d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
