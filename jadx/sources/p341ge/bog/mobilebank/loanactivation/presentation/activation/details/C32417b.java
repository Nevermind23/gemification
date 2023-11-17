package p341ge.bog.mobilebank.loanactivation.presentation.activation.details;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import aq0.C31017b;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.b */
public abstract class C32417b extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f79873d;

    /* renamed from: e */
    private boolean f79874e;

    /* renamed from: f */
    private boolean f79875f = false;

    C32417b() {
    }

    private void initializeComponentContext() {
        if (this.f79873d == null) {
            this.f79873d = C12066g.m44266b(super.getContext(), this);
            this.f79874e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f79874e) {
            return null;
        }
        initializeComponentContext();
        return this.f79873d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f79875f) {
            this.f79875f = true;
            ((C31017b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32766x2((ActivationDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f79873d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
