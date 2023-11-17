package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import ct0.C31414f;
import ct0.C31429h;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.b */
public abstract class C32793b extends C19788a {

    /* renamed from: H */
    private ContextWrapper f80641H;

    /* renamed from: I */
    private boolean f80642I;

    /* renamed from: J */
    private boolean f80643J = false;

    private void initializeComponentContext() {
        if (this.f80641H == null) {
            this.f80641H = C12066g.m44266b(super.getContext(), this);
            this.f80642I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f80642I) {
            return null;
        }
        initializeComponentContext();
        return this.f80641H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f80643J) {
            this.f80643J = true;
            ((C31429h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32771z((C31414f) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f80641H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
