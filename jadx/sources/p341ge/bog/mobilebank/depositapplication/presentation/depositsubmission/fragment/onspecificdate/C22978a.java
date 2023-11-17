package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.C12066g;
import ib0.C25143e;
import ib0.C25159f;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.a */
public abstract class C22978a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f60431H;

    /* renamed from: I */
    private boolean f60432I;

    /* renamed from: J */
    private boolean f60433J = false;

    private void initializeComponentContext() {
        if (this.f60431H == null) {
            this.f60431H = C12066g.m44266b(super.getContext(), this);
            this.f60432I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f60432I) {
            return null;
        }
        initializeComponentContext();
        return this.f60431H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f60433J) {
            this.f60433J = true;
            ((C25159f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32768y0((C25143e) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f60431H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
