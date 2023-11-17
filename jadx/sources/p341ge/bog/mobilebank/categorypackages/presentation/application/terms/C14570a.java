package p341ge.bog.mobilebank.categorypackages.presentation.application.terms;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import p371bp.C10349c;
import p371bp.C10361d;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.application.terms.a */
public abstract class C14570a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f42472H;

    /* renamed from: I */
    private boolean f42473I;

    /* renamed from: J */
    private boolean f42474J = false;

    private void initializeComponentContext() {
        if (this.f42472H == null) {
            this.f42472H = C12066g.m44266b(super.getContext(), this);
            this.f42473I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42473I) {
            return null;
        }
        initializeComponentContext();
        return this.f42472H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42474J) {
            this.f42474J = true;
            ((C10361d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo26988T1((C10349c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42472H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
