package yg0;

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

/* renamed from: yg0.l */
public abstract class C30055l extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f75884B;

    /* renamed from: C */
    private boolean f75885C;

    /* renamed from: D */
    private volatile C12066g f75886D;

    /* renamed from: E */
    private final Object f75887E = new Object();

    /* renamed from: F */
    private boolean f75888F = false;

    private void initializeComponentContext() {
        if (this.f75884B == null) {
            this.f75884B = C12066g.m44266b(super.getContext(), this);
            this.f75885C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f75886D == null) {
            synchronized (this.f75887E) {
                if (this.f75886D == null) {
                    this.f75886D = createComponentManager();
                }
            }
        }
        return this.f75886D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f75885C) {
            return null;
        }
        initializeComponentContext();
        return this.f75884B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f75888F) {
            this.f75888F = true;
            ((C30049f) generatedComponent()).mo32737q1((C30036e) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f75884B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
