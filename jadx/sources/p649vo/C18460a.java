package p649vo;

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

/* renamed from: vo.a */
public abstract class C18460a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f51924d;

    /* renamed from: e */
    private boolean f51925e;

    /* renamed from: f */
    private volatile C12066g f51926f;

    /* renamed from: g */
    private final Object f51927g = new Object();

    /* renamed from: h */
    private boolean f51928h = false;

    C18460a() {
    }

    private void initializeComponentContext() {
        if (this.f51924d == null) {
            this.f51924d = C12066g.m44266b(super.getContext(), this);
            this.f51925e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f51926f == null) {
            synchronized (this.f51927g) {
                if (this.f51926f == null) {
                    this.f51926f = createComponentManager();
                }
            }
        }
        return this.f51926f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f51925e) {
            return null;
        }
        initializeComponentContext();
        return this.f51924d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f51928h) {
            this.f51928h = true;
            ((C18479g) generatedComponent()).mo32659V1((C18465f) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f51924d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
