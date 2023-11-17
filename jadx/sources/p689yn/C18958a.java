package p689yn;

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

/* renamed from: yn.a */
public abstract class C18958a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f52963H;

    /* renamed from: I */
    private boolean f52964I;

    /* renamed from: J */
    private boolean f52965J = false;

    private void initializeComponentContext() {
        if (this.f52963H == null) {
            this.f52963H = C12066g.m44266b(super.getContext(), this);
            this.f52964I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f52964I) {
            return null;
        }
        initializeComponentContext();
        return this.f52963H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f52965J) {
            this.f52965J = true;
            ((C18976e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32646R((C18961d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f52963H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
