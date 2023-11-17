package s11;

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

/* renamed from: s11.f */
public abstract class C38417f extends C19788a {

    /* renamed from: H */
    private ContextWrapper f92001H;

    /* renamed from: I */
    private boolean f92002I;

    /* renamed from: J */
    private boolean f92003J = false;

    private void initializeComponentContext() {
        if (this.f92001H == null) {
            this.f92001H = C12066g.m44266b(super.getContext(), this);
            this.f92002I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f92002I) {
            return null;
        }
        initializeComponentContext();
        return this.f92001H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f92003J) {
            this.f92003J = true;
            ((C38416e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32596D0((C38406d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f92001H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
