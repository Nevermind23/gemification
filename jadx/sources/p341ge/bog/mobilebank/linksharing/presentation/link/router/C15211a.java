package p341ge.bog.mobilebank.linksharing.presentation.link.router;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import lp0.C16655c;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p558pf.C17343a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.link.router.a */
public abstract class C15211a extends C35651n1 {

    /* renamed from: d */
    private ContextWrapper f43550d;

    /* renamed from: e */
    private boolean f43551e;

    /* renamed from: f */
    private boolean f43552f = false;

    C15211a() {
    }

    private void initializeComponentContext() {
        if (this.f43550d == null) {
            this.f43550d = C12066g.m44266b(super.getContext(), this);
            this.f43551e = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f43551e) {
            return null;
        }
        initializeComponentContext();
        return this.f43550d;
    }

    public /* bridge */ /* synthetic */ C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f43552f) {
            this.f43552f = true;
            ((C16655c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32692f0((P2PLinkRouterFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f43550d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
