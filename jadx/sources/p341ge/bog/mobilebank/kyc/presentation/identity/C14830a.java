package p341ge.bog.mobilebank.kyc.presentation.identity;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import kn0.C16498k;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.kyc.presentation.identity.a */
public abstract class C14830a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f42905d;

    /* renamed from: e */
    private boolean f42906e;

    /* renamed from: f */
    private volatile C12066g f42907f;

    /* renamed from: g */
    private final Object f42908g = new Object();

    /* renamed from: h */
    private boolean f42909h = false;

    C14830a() {
    }

    private void initializeComponentContext() {
        if (this.f42905d == null) {
            this.f42905d = C12066g.m44266b(super.getContext(), this);
            this.f42906e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f42907f == null) {
            synchronized (this.f42908g) {
                if (this.f42907f == null) {
                    this.f42907f = createComponentManager();
                }
            }
        }
        return this.f42907f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42906e) {
            return null;
        }
        initializeComponentContext();
        return this.f42905d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42909h) {
            this.f42909h = true;
            ((C16498k) generatedComponent()).mo32755v((IdentityDataInputFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42905d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
