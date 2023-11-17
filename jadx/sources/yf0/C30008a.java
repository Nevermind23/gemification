package yf0;

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

/* renamed from: yf0.a */
public abstract class C30008a extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f75829B;

    /* renamed from: C */
    private boolean f75830C;

    /* renamed from: D */
    private volatile C12066g f75831D;

    /* renamed from: E */
    private final Object f75832E = new Object();

    /* renamed from: F */
    private boolean f75833F = false;

    private void initializeComponentContext() {
        if (this.f75829B == null) {
            this.f75829B = C12066g.m44266b(super.getContext(), this);
            this.f75830C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f75831D == null) {
            synchronized (this.f75832E) {
                if (this.f75831D == null) {
                    this.f75831D = createComponentManager();
                }
            }
        }
        return this.f75831D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f75830C) {
            return null;
        }
        initializeComponentContext();
        return this.f75829B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f75833F) {
            this.f75833F = true;
            ((C30030g) generatedComponent()).mo32694f2((C30010c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f75829B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
