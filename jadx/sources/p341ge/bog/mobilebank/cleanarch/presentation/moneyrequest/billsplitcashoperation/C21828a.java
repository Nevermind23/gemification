package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation;

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
import s20.C28125c;
import s20.C28136d;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.billsplitcashoperation.a */
public abstract class C21828a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f58218H;

    /* renamed from: I */
    private boolean f58219I;

    /* renamed from: J */
    private boolean f58220J = false;

    private void initializeComponentContext() {
        if (this.f58218H == null) {
            this.f58218H = C12066g.m44266b(super.getContext(), this);
            this.f58219I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f58219I) {
            return null;
        }
        initializeComponentContext();
        return this.f58218H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f58220J) {
            this.f58220J = true;
            ((C28136d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32720m((C28125c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f58218H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
