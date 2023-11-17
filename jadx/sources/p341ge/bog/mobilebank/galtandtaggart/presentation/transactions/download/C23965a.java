package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.download;

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
import rg0.C28027e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.download.a */
public abstract class C23965a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f62232H;

    /* renamed from: I */
    private boolean f62233I;

    /* renamed from: J */
    private boolean f62234J = false;

    private void initializeComponentContext() {
        if (this.f62232H == null) {
            this.f62232H = C12066g.m44266b(super.getContext(), this);
            this.f62233I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62233I) {
            return null;
        }
        initializeComponentContext();
        return this.f62232H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62234J) {
            this.f62234J = true;
            ((C28027e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32655U0((C23966b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62232H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
