package wg0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: wg0.j */
public abstract class C29390j extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f74472B;

    /* renamed from: C */
    private boolean f74473C;

    /* renamed from: D */
    private volatile C12066g f74474D;

    /* renamed from: E */
    private final Object f74475E = new Object();

    /* renamed from: F */
    private boolean f74476F = false;

    private void initializeComponentContext() {
        if (this.f74472B == null) {
            this.f74472B = C12066g.m44266b(super.getContext(), this);
            this.f74473C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f74474D == null) {
            synchronized (this.f74475E) {
                if (this.f74474D == null) {
                    this.f74474D = createComponentManager();
                }
            }
        }
        return this.f74474D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f74473C) {
            return null;
        }
        initializeComponentContext();
        return this.f74472B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f74476F) {
            this.f74476F = true;
            ((C29383c) generatedComponent()).mo32663X((C29372b) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f74472B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
