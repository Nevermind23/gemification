package pn0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p341ge.bog.mobilebank.kyc.presentation.selectcity.CitySelectorActionSheet;
import p349ah.C9860d;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: pn0.q */
public abstract class C17454q extends C9860d implements C18155c {

    /* renamed from: B */
    private ContextWrapper f48865B;

    /* renamed from: C */
    private boolean f48866C;

    /* renamed from: D */
    private volatile C12066g f48867D;

    /* renamed from: E */
    private final Object f48868E = new Object();

    /* renamed from: F */
    private boolean f48869F = false;

    private void initializeComponentContext() {
        if (this.f48865B == null) {
            this.f48865B = C12066g.m44266b(super.getContext(), this);
            this.f48866C = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f48867D == null) {
            synchronized (this.f48868E) {
                if (this.f48867D == null) {
                    this.f48867D = createComponentManager();
                }
            }
        }
        return this.f48867D;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f48866C) {
            return null;
        }
        initializeComponentContext();
        return this.f48865B;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f48869F) {
            this.f48869F = true;
            ((C17430b) generatedComponent()).mo32691f((CitySelectorActionSheet) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f48865B;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
