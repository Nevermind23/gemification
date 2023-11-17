package p341ge.bog.mobilebank.giftcards.presentation.received;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import gj0.C24731c;
import gj0.C24747d;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.received.a */
public abstract class C24362a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f62928H;

    /* renamed from: I */
    private boolean f62929I;

    /* renamed from: J */
    private boolean f62930J = false;

    private void initializeComponentContext() {
        if (this.f62928H == null) {
            this.f62928H = C12066g.m44266b(super.getContext(), this);
            this.f62929I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62929I) {
            return null;
        }
        initializeComponentContext();
        return this.f62928H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62930J) {
            this.f62930J = true;
            ((C24747d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32615I((C24731c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62928H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
