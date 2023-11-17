package t51;

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

/* renamed from: t51.i */
public abstract class C38668i extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f92542d;

    /* renamed from: e */
    private boolean f92543e;

    /* renamed from: f */
    private volatile C12066g f92544f;

    /* renamed from: g */
    private final Object f92545g = new Object();

    /* renamed from: h */
    private boolean f92546h = false;

    C38668i() {
    }

    private void initializeComponentContext() {
        if (this.f92542d == null) {
            this.f92542d = C12066g.m44266b(super.getContext(), this);
            this.f92543e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f92544f == null) {
            synchronized (this.f92545g) {
                if (this.f92544f == null) {
                    this.f92544f = createComponentManager();
                }
            }
        }
        return this.f92544f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f92543e) {
            return null;
        }
        initializeComponentContext();
        return this.f92542d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f92546h) {
            this.f92546h = true;
            ((C38701y) generatedComponent()).mo32763x((C38686x) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f92542d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
