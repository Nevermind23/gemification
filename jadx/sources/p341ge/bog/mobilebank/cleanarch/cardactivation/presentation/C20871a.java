package p341ge.bog.mobilebank.cleanarch.cardactivation.presentation;

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
import p920vq.C29133c;
import p920vq.C29152d;

/* renamed from: ge.bog.mobilebank.cleanarch.cardactivation.presentation.a */
public abstract class C20871a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f56159H;

    /* renamed from: I */
    private boolean f56160I;

    /* renamed from: J */
    private boolean f56161J = false;

    private void initializeComponentContext() {
        if (this.f56159H == null) {
            this.f56159H = C12066g.m44266b(super.getContext(), this);
            this.f56160I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f56160I) {
            return null;
        }
        initializeComponentContext();
        return this.f56159H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f56161J) {
            this.f56161J = true;
            ((C29152d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32669Z0((C29133c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f56159H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
