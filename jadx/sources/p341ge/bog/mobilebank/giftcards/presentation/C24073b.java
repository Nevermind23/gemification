package p341ge.bog.mobilebank.giftcards.presentation;

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
import yh0.C30064i;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.b */
public abstract class C24073b extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f62434d;

    /* renamed from: e */
    private boolean f62435e;

    /* renamed from: f */
    private boolean f62436f = false;

    C24073b() {
    }

    private void initializeComponentContext() {
        if (this.f62434d == null) {
            this.f62434d = C12066g.m44266b(super.getContext(), this);
            this.f62435e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62435e) {
            return null;
        }
        initializeComponentContext();
        return this.f62434d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62436f) {
            this.f62436f = true;
            ((C30064i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32769y1((C24054a) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62434d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
