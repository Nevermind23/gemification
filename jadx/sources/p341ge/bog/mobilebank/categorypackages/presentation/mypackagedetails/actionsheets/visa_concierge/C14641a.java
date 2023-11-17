package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import dagger.hilt.android.internal.managers.C12066g;
import p484jp.C16310b;
import p558pf.C17343a;
import p600sf.C17766a;
import p627uf.C18155c;
import p627uf.C18156d;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.actionsheets.visa_concierge.a */
public abstract class C14641a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f42580d;

    /* renamed from: e */
    private boolean f42581e;

    /* renamed from: f */
    private volatile C12066g f42582f;

    /* renamed from: g */
    private final Object f42583g = new Object();

    /* renamed from: h */
    private boolean f42584h = false;

    C14641a() {
    }

    private void initializeComponentContext() {
        if (this.f42580d == null) {
            this.f42580d = C12066g.m44266b(super.getContext(), this);
            this.f42581e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f42582f == null) {
            synchronized (this.f42583g) {
                if (this.f42582f == null) {
                    this.f42582f = createComponentManager();
                }
            }
        }
        return this.f42582f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f42581e) {
            return null;
        }
        initializeComponentContext();
        return this.f42580d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f42584h) {
            this.f42584h = true;
            ((C16310b) generatedComponent()).mo32745s1((SetConciergeResultFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f42580d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
