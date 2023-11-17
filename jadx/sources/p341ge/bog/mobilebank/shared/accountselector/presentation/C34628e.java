package p341ge.bog.mobilebank.shared.accountselector.presentation;

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
import y11.C39992d;
import y11.C40011l;

/* renamed from: ge.bog.mobilebank.shared.accountselector.presentation.e */
public abstract class C34628e extends C19788a {

    /* renamed from: H */
    private ContextWrapper f83672H;

    /* renamed from: I */
    private boolean f83673I;

    /* renamed from: J */
    private boolean f83674J = false;

    private void initializeComponentContext() {
        if (this.f83672H == null) {
            this.f83672H = C12066g.m44266b(super.getContext(), this);
            this.f83673I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f83673I) {
            return null;
        }
        initializeComponentContext();
        return this.f83672H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f83674J) {
            this.f83674J = true;
            ((C40011l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32641P0((C39992d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f83672H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
