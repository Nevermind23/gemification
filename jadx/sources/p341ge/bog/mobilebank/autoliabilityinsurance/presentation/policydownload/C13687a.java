package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload;

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
import p686yk.C18931d;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.policydownload.a */
public abstract class C13687a extends Fragment implements C18155c {

    /* renamed from: d */
    private ContextWrapper f40861d;

    /* renamed from: e */
    private boolean f40862e;

    /* renamed from: f */
    private volatile C12066g f40863f;

    /* renamed from: g */
    private final Object f40864g = new Object();

    /* renamed from: h */
    private boolean f40865h = false;

    C13687a() {
    }

    private void initializeComponentContext() {
        if (this.f40861d == null) {
            this.f40861d = C12066g.m44266b(super.getContext(), this);
            this.f40862e = C17343a.m60707a(super.getContext());
        }
    }

    public final C12066g componentManager() {
        if (this.f40863f == null) {
            synchronized (this.f40864g) {
                if (this.f40863f == null) {
                    this.f40863f = createComponentManager();
                }
            }
        }
        return this.f40863f;
    }

    /* access modifiers changed from: protected */
    public C12066g createComponentManager() {
        return new C12066g(this);
    }

    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f40862e) {
            return null;
        }
        initializeComponentContext();
        return this.f40861d;
    }

    public C1620q0.C1624b getDefaultViewModelProviderFactory() {
        return C17766a.m61452b(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    public void inject() {
        if (!this.f40865h) {
            this.f40865h = true;
            ((C18931d) generatedComponent()).mo32688e0((PolicyDownloadFragment) C18157e.m62250a(this));
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
        ContextWrapper contextWrapper = this.f40861d;
        C18156d.m62249d(contextWrapper == null || C12066g.m44268d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
