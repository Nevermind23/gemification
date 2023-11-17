package p00;

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

/* renamed from: p00.a */
public abstract class C27103a extends C1483c implements C18155c {

    /* renamed from: t */
    private ContextWrapper f68069t;

    /* renamed from: u */
    private boolean f68070u;

    /* renamed from: v */
    private volatile C12066g f68071v;

    /* renamed from: w */
    private final Object f68072w = new Object();

    /* renamed from: x */
    private boolean f68073x = false;

    C27103a() {
    }

    private void initializeComponentContext() {
        if (this.f68069t == null) {
            this.f68069t = C12066g.m44266b(super.getContext(), this);
            this.f68070u = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f68071v == null) {
            synchronized (this.f68072w) {
                if (this.f68071v == null) {
                    this.f68071v = createComponentManager();
                }
            }
        }
        return this.f68071v;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f68070u) {
            return null;
        }
        initializeComponentContext();
        return this.f68069t;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f68073x) {
            this.f68073x = true;
            ((C27125l) generatedComponent()).mo32716l((C27113k) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f68069t;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
