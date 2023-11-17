package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import c00.C19417a;
import c00.C19432c;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.actionsheet.newproduct.a */
public abstract class C21364a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f57195H;

    /* renamed from: I */
    private boolean f57196I;

    /* renamed from: J */
    private boolean f57197J = false;

    private void initializeComponentContext() {
        if (this.f57195H == null) {
            this.f57195H = C12066g.m44266b(super.getContext(), this);
            this.f57196I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f57196I) {
            return null;
        }
        initializeComponentContext();
        return this.f57195H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f57197J) {
            this.f57197J = true;
            ((C19432c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32593C1((C19417a) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f57195H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
