package p341ge.bog.mobilebank.sso.presentation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import l51.C37076e;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.sso.presentation.a */
public abstract class C34706a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f83882d;

    /* renamed from: e */
    private boolean f83883e;

    /* renamed from: f */
    private boolean f83884f = false;

    C34706a() {
    }

    private void initializeComponentContext() {
        if (this.f83882d == null) {
            this.f83882d = C12066g.m44266b(super.getContext(), this);
            this.f83883e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f83883e) {
            return null;
        }
        initializeComponentContext();
        return this.f83882d;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f83884f) {
            this.f83884f = true;
            ((C37076e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32625K1((C34709c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f83882d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
