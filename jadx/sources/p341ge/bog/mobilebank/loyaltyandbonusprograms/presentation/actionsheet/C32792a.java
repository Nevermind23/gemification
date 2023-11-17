package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import ct0.C31412d;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.a */
public abstract class C32792a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f80638H;

    /* renamed from: I */
    private boolean f80639I;

    /* renamed from: J */
    private boolean f80640J = false;

    private void initializeComponentContext() {
        if (this.f80638H == null) {
            this.f80638H = C12066g.m44266b(super.getContext(), this);
            this.f80639I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f80639I) {
            return null;
        }
        initializeComponentContext();
        return this.f80638H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f80640J) {
            this.f80640J = true;
            ((C31412d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32614H2((ClosePiggyBankActionSheet) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f80638H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
