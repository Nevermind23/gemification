package p341ge.bog.mobilebank.kyc.presentation.occupation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import nn0.C17112b;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.kyc.presentation.occupation.a */
public abstract class C14905a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f43037d;

    /* renamed from: e */
    private boolean f43038e;

    /* renamed from: f */
    private volatile C12066g f43039f;

    /* renamed from: g */
    private final Object f43040g = new Object();

    /* renamed from: h */
    private boolean f43041h = false;

    C14905a() {
    }

    private void initializeComponentContext() {
        if (this.f43037d == null) {
            this.f43037d = C12066g.m44266b(super.getContext(), this);
            this.f43038e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f43039f == null) {
            synchronized (this.f43040g) {
                if (this.f43039f == null) {
                    this.f43039f = createComponentManager();
                }
            }
        }
        return this.f43039f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f43038e) {
            return null;
        }
        initializeComponentContext();
        return this.f43037d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f43041h) {
            this.f43041h = true;
            ((C17112b) generatedComponent()).mo32764x0((OccupationInputFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f43037d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
