package p341ge.bog.mobilebank.giftcards.presentation.details;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import li0.C26029b;
import lj0.C26038a;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import ue1.C43080q;

/* renamed from: ge.bog.mobilebank.giftcards.presentation.details.d */
public abstract class C24209d extends C26038a {

    /* renamed from: f */
    private ContextWrapper f62658f;

    /* renamed from: g */
    private boolean f62659g;

    /* renamed from: h */
    private boolean f62660h = false;

    C24209d(C43080q qVar) {
        super(qVar);
    }

    private void initializeComponentContext() {
        if (this.f62658f == null) {
            this.f62658f = C12066g.m44266b(super.getContext(), this);
            this.f62659g = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f62659g) {
            return null;
        }
        initializeComponentContext();
        return this.f62658f;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f62660h) {
            this.f62660h = true;
            ((C26029b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32686d2((GiftCardDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f62658f;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
