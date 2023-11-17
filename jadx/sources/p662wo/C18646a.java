package p662wo;

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

/* renamed from: wo.a */
public abstract class C18646a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f52233d;

    /* renamed from: e */
    private boolean f52234e;

    /* renamed from: f */
    private volatile C12066g f52235f;

    /* renamed from: g */
    private final Object f52236g = new Object();

    /* renamed from: h */
    private boolean f52237h = false;

    C18646a() {
    }

    private void initializeComponentContext() {
        if (this.f52233d == null) {
            this.f52233d = C12066g.m44266b(super.getContext(), this);
            this.f52234e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f52235f == null) {
            synchronized (this.f52236g) {
                if (this.f52235f == null) {
                    this.f52235f = createComponentManager();
                }
            }
        }
        return this.f52235f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f52234e) {
            return null;
        }
        initializeComponentContext();
        return this.f52233d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f52237h) {
            this.f52237h = true;
            ((C18650d) generatedComponent()).mo32746s2((C18648c) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f52233d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
