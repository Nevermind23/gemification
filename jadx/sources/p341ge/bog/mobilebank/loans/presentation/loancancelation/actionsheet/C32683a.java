package p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import es0.C31772c;
import es0.C31785d;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.a */
public abstract class C32683a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f80447H;

    /* renamed from: I */
    private boolean f80448I;

    /* renamed from: J */
    private boolean f80449J = false;

    private void initializeComponentContext() {
        if (this.f80447H == null) {
            this.f80447H = C12066g.m44266b(super.getContext(), this);
            this.f80448I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f80448I) {
            return null;
        }
        initializeComponentContext();
        return this.f80447H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f80449J) {
            this.f80449J = true;
            ((C31785d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32774z2((C31772c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f80447H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
