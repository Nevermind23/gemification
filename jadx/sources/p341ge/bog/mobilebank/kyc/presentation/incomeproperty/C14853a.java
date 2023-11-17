package p341ge.bog.mobilebank.kyc.presentation.incomeproperty;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import ln0.C16627u;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.kyc.presentation.incomeproperty.a */
public abstract class C14853a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f42950d;

    /* renamed from: e */
    private boolean f42951e;

    /* renamed from: f */
    private volatile C12066g f42952f;

    /* renamed from: g */
    private final Object f42953g = new Object();

    /* renamed from: h */
    private boolean f42954h = false;

    C14853a() {
    }

    private void initializeComponentContext() {
        if (this.f42950d == null) {
            this.f42950d = C12066g.m44266b(super.getContext(), this);
            this.f42951e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f42952f == null) {
            synchronized (this.f42953g) {
                if (this.f42952f == null) {
                    this.f42952f = createComponentManager();
                }
            }
        }
        return this.f42952f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42951e) {
            return null;
        }
        initializeComponentContext();
        return this.f42950d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42954h) {
            this.f42954h = true;
            ((C16627u) generatedComponent()).mo32642P1((IncomeSourceSelectorFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42950d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
