package p341ge.bog.mobilebank.giftcards.presentation.offersandapplications;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import lj0.C26038a;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import ue1.C43080q;
import zi0.C30310a;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.offersandapplications.a */
public abstract class C24313a extends C26038a {

    /* renamed from: f */
    private ContextWrapper f62830f;

    /* renamed from: g */
    private boolean f62831g;

    /* renamed from: h */
    private boolean f62832h = false;

    C24313a(C43080q qVar) {
        super(qVar);
    }

    private void initializeComponentContext() {
        if (this.f62830f == null) {
            this.f62830f = C12066g.m44266b(super.getContext(), this);
            this.f62831g = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62831g) {
            return null;
        }
        initializeComponentContext();
        return this.f62830f;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62832h) {
            this.f62832h = true;
            ((C30310a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32687e((OffersAndApplicationsDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62830f;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
