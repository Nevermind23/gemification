package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p381cl.C10493j;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.registermtplpolicy.b */
public abstract class C13733b extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f40945d;

    /* renamed from: e */
    private boolean f40946e;

    /* renamed from: f */
    private volatile C12066g f40947f;

    /* renamed from: g */
    private final Object f40948g = new Object();

    /* renamed from: h */
    private boolean f40949h = false;

    C13733b() {
    }

    private void initializeComponentContext() {
        if (this.f40945d == null) {
            this.f40945d = C12066g.m44266b(super.getContext(), this);
            this.f40946e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f40947f == null) {
            synchronized (this.f40948g) {
                if (this.f40947f == null) {
                    this.f40947f = createComponentManager();
                }
            }
        }
        return this.f40947f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f40946e) {
            return null;
        }
        initializeComponentContext();
        return this.f40945d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f40949h) {
            this.f40949h = true;
            ((C10493j) generatedComponent()).mo27205X0((RegisterMtplPolicyFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f40945d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
