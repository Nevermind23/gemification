package qn0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.kyc.presentation.selectcountry.CountrySelectorActionSheet;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: qn0.l */
public abstract class C17571l extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f49125B;

    /* renamed from: C */
    private boolean f49126C;

    /* renamed from: D */
    private volatile C12066g f49127D;

    /* renamed from: E */
    private final Object f49128E = new Object();

    /* renamed from: F */
    private boolean f49129F = false;

    private void initializeComponentContext() {
        if (this.f49125B == null) {
            this.f49125B = C12066g.m44266b(super.getContext(), this);
            this.f49126C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f49127D == null) {
            synchronized (this.f49128E) {
                if (this.f49127D == null) {
                    this.f49127D = createComponentManager();
                }
            }
        }
        return this.f49127D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f49126C) {
            return null;
        }
        initializeComponentContext();
        return this.f49125B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f49129F) {
            this.f49129F = true;
            ((C17555a) generatedComponent()).mo32697g1((CountrySelectorActionSheet) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f49125B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
