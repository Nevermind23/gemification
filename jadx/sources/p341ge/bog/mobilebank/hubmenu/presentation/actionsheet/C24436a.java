package p341ge.bog.mobilebank.hubmenu.presentation.actionsheet;

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
import vk0.C29108a;
import vk0.C29125f;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.actionsheet.a */
public abstract class C24436a extends C19788a {

    /* renamed from: H */
    private ContextWrapper f63038H;

    /* renamed from: I */
    private boolean f63039I;

    /* renamed from: J */
    private boolean f63040J = false;

    private void initializeComponentContext() {
        if (this.f63038H == null) {
            this.f63038H = C12066g.m44266b(super.getContext(), this);
            this.f63039I = C17343a.m60707a(super.getContext());
        }
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f63039I) {
            return null;
        }
        initializeComponentContext();
        return this.f63038H;
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f63040J) {
            this.f63040J = true;
            ((C29125f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32726n2((C29108a) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f63038H;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
