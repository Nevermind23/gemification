package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;
import p700zk.C19039a;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.providerlist.a */
public abstract class C13715a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f40904d;

    /* renamed from: e */
    private boolean f40905e;

    /* renamed from: f */
    private volatile C12066g f40906f;

    /* renamed from: g */
    private final Object f40907g = new Object();

    /* renamed from: h */
    private boolean f40908h = false;

    C13715a() {
    }

    private void initializeComponentContext() {
        if (this.f40904d == null) {
            this.f40904d = C12066g.m44266b(super.getContext(), this);
            this.f40905e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f40906f == null) {
            synchronized (this.f40907g) {
                if (this.f40906f == null) {
                    this.f40906f = createComponentManager();
                }
            }
        }
        return this.f40906f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f40905e) {
            return null;
        }
        initializeComponentContext();
        return this.f40904d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f40908h) {
            this.f40908h = true;
            ((C19039a) generatedComponent()).mo32675b((InsuranceProviderListFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f40904d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
