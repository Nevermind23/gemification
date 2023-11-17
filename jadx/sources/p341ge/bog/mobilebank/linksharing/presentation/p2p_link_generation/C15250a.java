package p341ge.bog.mobilebank.linksharing.presentation.p2p_link_generation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.C1483c;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import mp0.C16893e;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.p2p_link_generation.a */
public abstract class C15250a extends C1483c implements C18155c {

    /* renamed from: t */
    private ContextWrapper f43620t;

    /* renamed from: u */
    private boolean f43621u;

    /* renamed from: v */
    private volatile C12066g f43622v;

    /* renamed from: w */
    private final Object f43623w = new Object();

    /* renamed from: x */
    private boolean f43624x = false;

    C15250a() {
    }

    private void initializeComponentContext() {
        if (this.f43620t == null) {
            this.f43620t = C12066g.m44266b(super.getContext(), this);
            this.f43621u = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f43622v == null) {
            synchronized (this.f43623w) {
                if (this.f43622v == null) {
                    this.f43622v = createComponentManager();
                }
            }
        }
        return this.f43622v;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f43621u) {
            return null;
        }
        initializeComponentContext();
        return this.f43620t;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f43624x) {
            this.f43624x = true;
            ((C16893e) generatedComponent()).mo32602E2((C15257d) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f43620t;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
