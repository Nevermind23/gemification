package p341ge.bog.mobilebank.statements.presentation.landing;

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
import t51.C38660f;
import t51.C38665g;

/* renamed from: ge.bog.mobilebank.statements.presentation.landing.a */
public abstract class C34723a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f83933H;

    /* renamed from: I */
    private boolean f83934I;

    /* renamed from: J */
    private boolean f83935J = false;

    private void initializeComponentContext() {
        if (this.f83933H == null) {
            this.f83933H = C12066g.m44266b(super.getContext(), this);
            this.f83934I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f83934I) {
            return null;
        }
        initializeComponentContext();
        return this.f83933H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f83935J) {
            this.f83935J = true;
            ((C38665g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32594C2((C38660f) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f83933H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
