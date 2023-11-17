package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import p428fp.C12948c;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.edit.c */
public abstract class C14636c extends C19788a {

    /* renamed from: H */
    private ContextWrapper f42563H;

    /* renamed from: I */
    private boolean f42564I;

    /* renamed from: J */
    private boolean f42565J = false;

    private void initializeComponentContext() {
        if (this.f42563H == null) {
            this.f42563H = C12066g.m44266b(super.getContext(), this);
            this.f42564I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42564I) {
            return null;
        }
        initializeComponentContext();
        return this.f42563H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42565J) {
            this.f42565J = true;
            ((C12948c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32591C((EditPackageConfirmationActionSheet) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42563H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
