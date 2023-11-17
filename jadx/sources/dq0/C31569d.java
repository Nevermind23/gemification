package dq0;

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

/* renamed from: dq0.d */
public abstract class C31569d extends C19788a {

    /* renamed from: H */
    private ContextWrapper f78141H;

    /* renamed from: I */
    private boolean f78142I;

    /* renamed from: J */
    private boolean f78143J = false;

    private void initializeComponentContext() {
        if (this.f78141H == null) {
            this.f78141H = C12066g.m44266b(super.getContext(), this);
            this.f78142I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f78142I) {
            return null;
        }
        initializeComponentContext();
        return this.f78141H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f78143J) {
            this.f78143J = true;
            ((C31568c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32758v2((C31566b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f78141H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
