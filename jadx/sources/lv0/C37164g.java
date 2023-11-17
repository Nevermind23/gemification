package lv0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.selectbank.C33374e;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: lv0.g */
public abstract class C37164g extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f89500B;

    /* renamed from: C */
    private boolean f89501C;

    /* renamed from: D */
    private volatile C12066g f89502D;

    /* renamed from: E */
    private final Object f89503E = new Object();

    /* renamed from: F */
    private boolean f89504F = false;

    private void initializeComponentContext() {
        if (this.f89500B == null) {
            this.f89500B = C12066g.m44266b(super.getContext(), this);
            this.f89501C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f89502D == null) {
            synchronized (this.f89503E) {
                if (this.f89502D == null) {
                    this.f89502D = createComponentManager();
                }
            }
        }
        return this.f89502D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f89501C) {
            return null;
        }
        initializeComponentContext();
        return this.f89500B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f89504F) {
            this.f89504F = true;
            ((C37166i) generatedComponent()).mo32658V0((C33374e) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f89500B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
