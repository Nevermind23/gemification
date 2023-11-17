package b00;

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

/* renamed from: b00.e */
public abstract class C19297e extends C19788a {

    /* renamed from: H */
    private ContextWrapper f53518H;

    /* renamed from: I */
    private boolean f53519I;

    /* renamed from: J */
    private boolean f53520J = false;

    private void initializeComponentContext() {
        if (this.f53518H == null) {
            this.f53518H = C12066g.m44266b(super.getContext(), this);
            this.f53519I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f53519I) {
            return null;
        }
        initializeComponentContext();
        return this.f53518H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f53520J) {
            this.f53520J = true;
            ((C19303i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32601E1((C19300h) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f53518H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
