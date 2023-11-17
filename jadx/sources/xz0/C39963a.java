package xz0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.C1483c;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: xz0.a */
public abstract class C39963a extends C1483c implements C18155c {

    /* renamed from: t */
    private ContextWrapper f94949t;

    /* renamed from: u */
    private boolean f94950u;

    /* renamed from: v */
    private volatile C12066g f94951v;

    /* renamed from: w */
    private final Object f94952w = new Object();

    /* renamed from: x */
    private boolean f94953x = false;

    C39963a() {
    }

    private void initializeComponentContext() {
        if (this.f94949t == null) {
            this.f94949t = C12066g.m44266b(super.getContext(), this);
            this.f94950u = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f94951v == null) {
            synchronized (this.f94952w) {
                if (this.f94951v == null) {
                    this.f94951v = createComponentManager();
                }
            }
        }
        return this.f94951v;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f94950u) {
            return null;
        }
        initializeComponentContext();
        return this.f94949t;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f94953x) {
            this.f94953x = true;
            ((C39981g) generatedComponent()).mo32607G((C39968f) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f94949t;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
