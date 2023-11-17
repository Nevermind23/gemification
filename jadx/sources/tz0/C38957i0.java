package tz0;

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

/* renamed from: tz0.i0 */
public abstract class C38957i0 extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f93065B;

    /* renamed from: C */
    private boolean f93066C;

    /* renamed from: D */
    private volatile C12066g f93067D;

    /* renamed from: E */
    private final Object f93068E = new Object();

    /* renamed from: F */
    private boolean f93069F = false;

    private void initializeComponentContext() {
        if (this.f93065B == null) {
            this.f93065B = C12066g.m44266b(super.getContext(), this);
            this.f93066C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f93067D == null) {
            synchronized (this.f93068E) {
                if (this.f93067D == null) {
                    this.f93067D = createComponentManager();
                }
            }
        }
        return this.f93067D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f93066C) {
            return null;
        }
        initializeComponentContext();
        return this.f93065B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f93069F) {
            this.f93069F = true;
            ((C38918b) generatedComponent()).mo32629L1((C38903a) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f93065B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
