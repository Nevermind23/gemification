package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import og0.C26996d;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.b */
public abstract class C23949b extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f62195d;

    /* renamed from: e */
    private boolean f62196e;

    /* renamed from: f */
    private boolean f62197f = false;

    C23949b() {
    }

    private void initializeComponentContext() {
        if (this.f62195d == null) {
            this.f62195d = C12066g.m44266b(super.getContext(), this);
            this.f62196e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62196e) {
            return null;
        }
        initializeComponentContext();
        return this.f62195d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62197f) {
            this.f62197f = true;
            ((C26996d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32742r2((C23939a) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62195d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
