package p341ge.bog.mobilebank.loans.presentation.details;

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
import vr0.C39439b;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.b */
public abstract class C32594b extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f80252d;

    /* renamed from: e */
    private boolean f80253e;

    /* renamed from: f */
    private volatile C12066g f80254f;

    /* renamed from: g */
    private final Object f80255g = new Object();

    /* renamed from: h */
    private boolean f80256h = false;

    C32594b() {
    }

    private void initializeComponentContext() {
        if (this.f80252d == null) {
            this.f80252d = C12066g.m44266b(super.getContext(), this);
            this.f80253e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f80254f == null) {
            synchronized (this.f80255g) {
                if (this.f80254f == null) {
                    this.f80254f = createComponentManager();
                }
            }
        }
        return this.f80254f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f80253e) {
            return null;
        }
        initializeComponentContext();
        return this.f80252d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f80256h) {
            this.f80256h = true;
            ((C39439b) generatedComponent()).mo32660W((LoanDetailsFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f80252d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
