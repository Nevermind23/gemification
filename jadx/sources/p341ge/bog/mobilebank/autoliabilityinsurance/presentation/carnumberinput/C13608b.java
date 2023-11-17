package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p591rk.C17629i;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carnumberinput.b */
public abstract class C13608b extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f40705d;

    /* renamed from: e */
    private boolean f40706e;

    /* renamed from: f */
    private volatile C12066g f40707f;

    /* renamed from: g */
    private final Object f40708g = new Object();

    /* renamed from: h */
    private boolean f40709h = false;

    C13608b() {
    }

    private void initializeComponentContext() {
        if (this.f40705d == null) {
            this.f40705d = C12066g.m44266b(super.getContext(), this);
            this.f40706e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f40707f == null) {
            synchronized (this.f40708g) {
                if (this.f40707f == null) {
                    this.f40707f = createComponentManager();
                }
            }
        }
        return this.f40707f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f40706e) {
            return null;
        }
        initializeComponentContext();
        return this.f40705d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f40709h) {
            this.f40709h = true;
            ((C17629i) generatedComponent()).mo32600E0((CarNumberInputFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f40705d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
