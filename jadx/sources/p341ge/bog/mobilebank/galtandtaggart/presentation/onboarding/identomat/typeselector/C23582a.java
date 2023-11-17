package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector;

import ag0.C19239d;
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

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.typeselector.a */
public abstract class C23582a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f61551H;

    /* renamed from: I */
    private boolean f61552I;

    /* renamed from: J */
    private boolean f61553J = false;

    private void initializeComponentContext() {
        if (this.f61551H == null) {
            this.f61551H = C12066g.m44266b(super.getContext(), this);
            this.f61552I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f61552I) {
            return null;
        }
        initializeComponentContext();
        return this.f61551H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f61553J) {
            this.f61553J = true;
            ((C19239d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32662W1((C23583b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f61551H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
