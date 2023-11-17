package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails;

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
import p658wk.C18603b;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydetails.a */
public abstract class C13673a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f40831d;

    /* renamed from: e */
    private boolean f40832e;

    /* renamed from: f */
    private volatile C12066g f40833f;

    /* renamed from: g */
    private final Object f40834g = new Object();

    /* renamed from: h */
    private boolean f40835h = false;

    C13673a() {
    }

    private void initializeComponentContext() {
        if (this.f40831d == null) {
            this.f40831d = C12066g.m44266b(super.getContext(), this);
            this.f40832e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f40833f == null) {
            synchronized (this.f40834g) {
                if (this.f40833f == null) {
                    this.f40833f = createComponentManager();
                }
            }
        }
        return this.f40833f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f40832e) {
            return null;
        }
        initializeComponentContext();
        return this.f40831d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f40835h) {
            this.f40835h = true;
            ((C18603b) generatedComponent()).mo32635N0((PolicyDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f40831d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
